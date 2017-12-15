
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class MainVisitor extends NewtonBaseVisitor<Void> {

    /*
     * Aktivacni zaznam
     *      dynamicka baze
     *      staticka baze
     *      pozice navratove instrukce
     */
    private final int ACTIVATE_RECORD_SIZE = 3;

    /* List instrukci */
    private final List<Instruction> INSTRUCTIONS = new LinkedList<>();

    /* List funkci */
    private final List<FunctionDefinition> FUNCTIONS = new LinkedList<>();

    /* Definice vsech promenych */
    private final Map<String, Variable> VARIABLES = new HashMap<>();

    /* Definice vsech konstant */
    private final Map<String, Variable> CONSTANTS = new HashMap<>();

    /* Hlasky pri preklady (ERROR, WARNING, atd..) */
    private final List<String> MESSAGES = new LinkedList<>();

    /* Vrchol zasobniku (citac hodnot na zasobniku) */
    private int topStack = -1;

    /* Aktualni uroven zanoreni */
    private int level = 0;

    public List<Instruction> getInstructions() {
        return INSTRUCTIONS;
    }

    public List<String> getMessages() {
        return MESSAGES;
    }

    private boolean isVariableDeclared(String name) {
        return VARIABLES.containsKey(name) || CONSTANTS.containsKey(name);
    }

    private Variable getVariable(String variableName) {
        if (CONSTANTS.containsKey(variableName)) {
            return CONSTANTS.get(variableName);
        }else if (VARIABLES.containsKey(variableName)) {
            return VARIABLES.get(variableName);
        }else {
            return null;
        }
    }

    private void generateInstructionForOperator(List neterminals,
                                                List<TerminalNode> firstTerminals,
                                                List<TerminalNode> secondTerminals,
                                                Consumer<Boolean> result) {

        visit((ParseTree) neterminals.get(0));

        for (int first = 0, second = 0, factor = 1; first < firstTerminals.size() || second < secondTerminals.size(); factor++) {

            TerminalNode actualFirst = firstTerminals.size() > first ? firstTerminals.get(first) : null;
            TerminalNode actualSecond = secondTerminals.size() > second ?  secondTerminals.get(second) : null;

            TerminalNode actualOperator = actualFirst == null && actualSecond != null ? actualSecond : actualFirst != null && actualSecond == null ? actualFirst : null;
            actualOperator = actualOperator != null ? actualOperator : actualFirst.getSourceInterval().a < actualSecond.getSourceInterval().a ? actualFirst : actualSecond;

            visit((ParseTree) neterminals.get(factor));

            if (actualOperator.equals(actualFirst)) {
                result.accept(true);
                first++;
            } else {
                result.accept(false);
                second++;
            }
        }

    }

    @Override
    public Void visitProgram(NewtonParser.ProgramContext ctx) {

        // vygenerovani opakujicich se kusu bloku, atd

        Void result = super.visitProgram(ctx);

        INSTRUCTIONS.add(new Instruction(InstructionType.RET, 0, 0));

        return result;
    }

    @Override
    public Void visitMainStatement(NewtonParser.MainStatementContext ctx) {

        if (ctx.statement().isEmpty()) {
            // WARNING program nema co vykonavat
            return null;
        }

        int offset = CONSTANTS.size() * 2; // pocet instrukci pro vytvoreni konstant
        int position;

        if (offset != 0) {
            // skot na instrukce pro vytvoreni konstant
            INSTRUCTIONS.add(0, new Instruction(InstructionType.JMP, 1));
            offset += 2; // nove pridana JMP + za aktualne posledni instrukci
            position = INSTRUCTIONS.size() + 1;
        } else {
            position = INSTRUCTIONS.size();
        }

        // skoc na prvni instrukci v mainu
        INSTRUCTIONS.add(offset, new Instruction(InstructionType.JMP, position));

        return super.visitMainStatement(ctx);
    }

    @Override
    public Void visitProgramHeading(NewtonParser.ProgramHeadingContext ctx) {

        // pro aktivacni zaznam
        int spaceAtStack = ACTIVATE_RECORD_SIZE;

        // misto pro promene a konstanty
        spaceAtStack += ctx.constantDefinitionPart().constantDefinition().size()
                          + ctx.variableDefinitionPart().variableDefinition().size();

        // promene a konstanty maji bazi 0
        INSTRUCTIONS.add(new Instruction(InstructionType.INT, spaceAtStack));

        topStack = spaceAtStack;

        return super.visitProgramHeading(ctx);
    }

    @Override
    public Void visitVariableDefinition(NewtonParser.VariableDefinitionContext ctx) {
        String variableName = ctx.Identifier().getText();
        String type = ctx.baseType().getText();

        if (isVariableDeclared(variableName)) {
            MESSAGES.add(MessageUtil.create(MessageType.VARIABLE_IS_DECLARED, ctx)); return null;
        }

        int position = VARIABLES.size() + CONSTANTS.size() + ACTIVATE_RECORD_SIZE;
        Variable variable = new Variable(variableName, DataType.valueOf(type.toUpperCase()), position);

        VARIABLES.put(variableName, variable);

        return super.visitVariableDefinition(ctx);
    }

    @Override
    public Void visitConstantDefinition(NewtonParser.ConstantDefinitionContext ctx) {

        String variableName = ctx.Identifier().getText();

        if (isVariableDeclared(variableName)) {
            MESSAGES.add(MessageUtil.create(MessageType.CONSTANT_IS_DECLARED, ctx)); return null;
        }

        Variable variable = null;
        int position = CONSTANTS.size() + ACTIVATE_RECORD_SIZE;
        String value = null;

        if (ctx.IntType() != null) {
            value = ctx.Int().getText();
            variable = new Variable(variableName, DataType.INT, position);
        } else if (ctx.BoolType() != null) {
            value = ctx.Boolean().getText().equals("true") ? "1" : "0";
            variable = new Variable(variableName, DataType.BOOL, position);
        }

        CONSTANTS.put(variableName, variable);

        Void result = super.visitConstantDefinition(ctx);

        INSTRUCTIONS.add(new Instruction(InstructionType.LIT, value));
        INSTRUCTIONS.add(new Instruction(InstructionType.STO, variable.getStackPosition()));

        return result;
    }

    @Override
    public Void visitParallelAssignmentStatement(NewtonParser.ParallelAssignmentStatementContext ctx) {

        if (ctx.Identifier().size() != ctx.simpleFactor().size()) {
            MESSAGES.add(MessageUtil.create(MessageType.PARALLEL_WRONG_OPERAND_SIZE, ctx)); return null;
        }

        for (int ind = 0; ind < ctx.Identifier().size(); ind++) {

            Variable variable = VARIABLES.get(ctx.Identifier().get(ind).getText());

            if (variable == null) {
                MESSAGES.add(MessageUtil.create(MessageType.UNDEFINED_VARIABLE, ctx)); return null;
            }

            visit(ctx.simpleFactor().get(ind));
            INSTRUCTIONS.add(new Instruction(InstructionType.STO, level, variable.getStackPosition()));
        }

        return null;
    }

    @Override
    public Void visitAssignmentStatement(NewtonParser.AssignmentStatementContext ctx) {
        String variableName = ctx.Identifier().getText();

        if (CONSTANTS.containsKey(variableName)) {
            MESSAGES.add(MessageUtil.create(MessageType.CONSTANT_INITIALIZE, ctx)); return null;
        }

        Variable variable = VARIABLES.get(variableName);

        if (variable == null) {
            MESSAGES.add(MessageUtil.create(MessageType.UNDEFINED_VARIABLE, ctx)); return null;
        }

        Void result = super.visitAssignmentStatement(ctx);

        INSTRUCTIONS.add(new Instruction(InstructionType.STO, level, variable.getStackPosition()));

        ctx.multipleAssignmentStatement().forEach(e -> {

            Variable var = VARIABLES.get(e.Identifier().getText());

            if (var == null) {
                MESSAGES.add(MessageUtil.create(MessageType.UNDEFINED_VARIABLE, ctx)); return;
            }

            INSTRUCTIONS.add(new Instruction(InstructionType.LOD, level, variable.getStackPosition()));
            INSTRUCTIONS.add(new Instruction(InstructionType.STO, level, var.getStackPosition()));

        });


        return result;
    }

    @Override
    public Void visitSimpleExpression(NewtonParser.SimpleExpressionContext ctx) {

        if (ctx.term().size() > 1) {
            generateInstructionForOperator(ctx.term(), ctx.Add(), ctx.Sub(), res -> {
                if (res) {
                    INSTRUCTIONS.add(new Instruction(OperationType.ADD, level));
                }else {
                    INSTRUCTIONS.add(new Instruction(OperationType.DIV, level));
                }
            });
            return null;
        }

        return super.visitSimpleExpression(ctx);
    }

    @Override
    public Void visitTerm(NewtonParser.TermContext ctx) {

        if (ctx.factor().isEmpty()) {
            // zavorky
            return null;
        }

        if (ctx.factor().size() > 1){
            generateInstructionForOperator(ctx.factor(), ctx.Mul(), ctx.Div(), res -> {
                if (res) {
                    INSTRUCTIONS.add(new Instruction(OperationType.MUL, level));
                }else {
                    INSTRUCTIONS.add(new Instruction(OperationType.DIV, level));
                }
            });
            return null;
        }

        return super.visitTerm(ctx);
    }

    @Override
    public Void visitFactor(NewtonParser.FactorContext ctx) {
        if (ctx.Identifier() != null) {
            Variable variable = getVariable(ctx.Identifier().getText());
            if (variable == null) {
                MESSAGES.add(MessageUtil.create(MessageType.UNDEFINED_VARIABLE, ctx)); return null;
            }
            INSTRUCTIONS.add(new Instruction(InstructionType.LOD, level, variable.getStackPosition()));
        }
        return super.visitFactor(ctx);
    }

    @Override
    public Void visitSimpleFactor(NewtonParser.SimpleFactorContext ctx) {
        if (ctx.Int() != null) {
            INSTRUCTIONS.add(new Instruction(InstructionType.LIT, level, ctx.Int().getText()));
        } else if (ctx.Boolean() != null) {
            INSTRUCTIONS.add(new Instruction(InstructionType.LIT, level,  ctx.Boolean().getText().equals("true") ? 1 : 0));
        }
        return super.visitSimpleFactor(ctx);
    }
}
