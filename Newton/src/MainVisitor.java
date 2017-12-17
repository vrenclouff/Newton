
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
import java.util.function.Consumer;


public class MainVisitor extends NewtonBaseVisitor<Void> {

    /*
     * Aktivacni zaznam
     *      dynamicka baze
     *      staticka baze
     *      pozice navratove instrukce
     */
    private final int ACTIVATION_RECORD_SIZE = 3;

    /* List instrukci */
    private final List<Instruction> INSTRUCTIONS = new LinkedList<>();

    /* List funkci */
    private final List<FunctionDefinition> FUNCTIONS = new LinkedList<>();

    /* Definice vsech promennych */
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
        } else if (VARIABLES.containsKey(variableName)) {
            return VARIABLES.get(variableName);
        } else {
            return null;
        }
    }

    private void visitIntOpr(List nonterminals,
                             List<TerminalNode> firstTerminals,
                             List<TerminalNode> secondTerminals,
                             Consumer<Integer> result) {

        visit((ParseTree) nonterminals.get(0));
        for (int first = 0, second = 0, factor = 1; first < firstTerminals.size() || second < secondTerminals.size(); factor++) {

            TerminalNode actualFirst = firstTerminals.size() > first ? firstTerminals.get(first) : null;
            TerminalNode actualSecond = secondTerminals.size() > second ? secondTerminals.get(second) : null;

            TerminalNode actualOperator = actualFirst == null && actualSecond != null ? actualSecond : actualFirst != null && actualSecond == null ? actualFirst : null;
            actualOperator = actualOperator != null ? actualOperator : actualFirst.getSourceInterval().a < actualSecond.getSourceInterval().a ? actualFirst : actualSecond;

            visit((ParseTree) nonterminals.get(factor));

            if (actualOperator.equals(actualFirst)) {
                result.accept(actualFirst.getSymbol().getType());
                first++;
            } else {
                result.accept(actualSecond.getSymbol().getType());
                second++;
            }
        }
    }

    private void visitStringOpr(List nonterminals, List<TerminalNode> terminals, Consumer<String> result) {
        visit((ParseTree) nonterminals.get(0));
        for (int opr = 0, exp = 1; exp < nonterminals.size() || opr < terminals.size(); exp++, opr++) {
            visit((ParseTree) nonterminals.get(exp));
            result.accept(terminals.get(opr).getSymbol().getText());
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
            MESSAGES.add(MessageUtil.create(MessageType.EMPTY_MAIN, ctx));
            return null;
        }

        int offset = CONSTANTS.size() * 2; // pocet instrukci pro vytvoreni konstant
        int position;

        if (offset != 0) {
            // skok na instrukce pro vytvoreni konstant
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
        int spaceAtStack = ACTIVATION_RECORD_SIZE;

        // misto pro promenne a konstanty
        spaceAtStack += ctx.constantDefinitionPart().constantDefinition().size()
                + ctx.variableDefinitionPart().variableDefinition().size();

        // promenne a konstanty maji bazi 0
        INSTRUCTIONS.add(new Instruction(InstructionType.INT, spaceAtStack));

        topStack = spaceAtStack;

        return super.visitProgramHeading(ctx);
    }

    @Override
    public Void visitVariableDefinition(NewtonParser.VariableDefinitionContext ctx) {
        String variableName = ctx.Identifier().getText();
        String type = ctx.baseType().getText();

        if (isVariableDeclared(variableName)) {
            MESSAGES.add(MessageUtil.create(MessageType.VARIABLE_IS_DECLARED, ctx));
            return null;
        }

        int position = VARIABLES.size() + CONSTANTS.size() + ACTIVATION_RECORD_SIZE;
        Variable variable = new Variable(variableName, DataType.valueOf(type.toUpperCase()), position);

        VARIABLES.put(variableName, variable);

        return super.visitVariableDefinition(ctx);
    }

    @Override
    public Void visitConstantDefinition(NewtonParser.ConstantDefinitionContext ctx) {
        String variableName = ctx.Identifier().getText();
        if (isVariableDeclared(variableName)) {
            MESSAGES.add(MessageUtil.create(MessageType.CONSTANT_IS_DECLARED, ctx));
            return null;
        }

        Variable variable = null;
        int position = CONSTANTS.size() + ACTIVATION_RECORD_SIZE;
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
            MESSAGES.add(MessageUtil.create(MessageType.PARALLEL_WRONG_OPERAND_SIZE, ctx));
            return null;
        }

        for (int i = 0; i < ctx.Identifier().size(); i++) {

            Variable variable = VARIABLES.get(ctx.Identifier().get(i).getText());

            if (variable == null) {
                MESSAGES.add(MessageUtil.create(MessageType.UNDEFINED_VARIABLE, ctx));
                return null;
            }

            visit(ctx.simpleFactor().get(i));
            INSTRUCTIONS.add(new Instruction(InstructionType.STO, level, variable.getStackPosition()));
        }

        return null;
    }

    @Override
    public Void visitAssignmentStatement(NewtonParser.AssignmentStatementContext ctx) {
        String variableName = ctx.Identifier().getText();

        if (CONSTANTS.containsKey(variableName)) {
            MESSAGES.add(MessageUtil.create(MessageType.CONSTANT_INITIALIZE, ctx));
            return null;
        }

        Variable variable = VARIABLES.get(variableName);

        if (variable == null) {
            MESSAGES.add(MessageUtil.create(MessageType.UNDEFINED_VARIABLE, ctx));
            return null;
        }

        Void result = super.visitAssignmentStatement(ctx);

        INSTRUCTIONS.add(new Instruction(InstructionType.STO, level, variable.getStackPosition()));

        ctx.multipleAssignmentStatement().forEach(e -> {
            Variable var = VARIABLES.get(e.Identifier().getText());
            if (var == null) {
                MESSAGES.add(MessageUtil.create(MessageType.UNDEFINED_VARIABLE, ctx));
                return;
            }

            INSTRUCTIONS.add(new Instruction(InstructionType.LOD, level, variable.getStackPosition()));
            INSTRUCTIONS.add(new Instruction(InstructionType.STO, level, var.getStackPosition()));
        });

        return result;
    }

    @Override
    public Void visitExpression(NewtonParser.ExpressionContext ctx) {

//        if (!ctx.expression().isEmpty()) {
//            visitStringOpr(ctx.expression(), ctx.LogicalOp(), res -> {
//                if (res.equals("&&")) {
//                    // TODO instrukce pro AND
//                } else if (res.equals("||")) {
//                    // TODO instrukce OR
//                }
//            });
//            return null;
//        }

        if (ctx.simpleExpression().size() > 1) {
            visitStringOpr(ctx.simpleExpression(), ctx.RelationOp(), res -> {
                if (res.equals("<")) {
                    INSTRUCTIONS.add(new Instruction(OperationType.LT, level));
                } else if (res.equals("<=")) {
                    INSTRUCTIONS.add(new Instruction(OperationType.LTE, level));
                } else if (res.equals(">")) {
                    INSTRUCTIONS.add(new Instruction(OperationType.GT, level));
                } else if (res.equals(">=")) {
                    INSTRUCTIONS.add(new Instruction(OperationType.GTE, level));
                } else if (res.equals("==")) {
                    INSTRUCTIONS.add(new Instruction(OperationType.EQ, level));
                }
            });
            return null;
        }

        return super.visitExpression(ctx);
    }

    @Override
    public Void visitSimpleExpression(NewtonParser.SimpleExpressionContext ctx) {

        if (ctx.term().size() > 1) {
            visitIntOpr(ctx.term(), ctx.Add(), ctx.Sub(), res -> {
                switch (res) {
                    case NewtonParser.Add:
                        INSTRUCTIONS.add(new Instruction(OperationType.ADD, level));
                        break;
                    case NewtonParser.Sub:
                        INSTRUCTIONS.add(new Instruction(OperationType.SUB, level));
                        break;
                }
            });
            return null;
        }

        return super.visitSimpleExpression(ctx);
    }

    @Override
    public Void visitTerm(NewtonParser.TermContext ctx) {
        if (ctx.factor().isEmpty()) {
            // TODO zavorky
            return null;
        }

        if (ctx.factor().size() > 1) {
            visitIntOpr(ctx.factor(), ctx.Mul(), ctx.Div(), res -> {
                switch (res) {
                    case NewtonParser.Mul:
                        INSTRUCTIONS.add(new Instruction(OperationType.MUL, level));
                        break;
                    case NewtonParser.Div:
                        INSTRUCTIONS.add(new Instruction(OperationType.DIV, level));
                        break;
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
                MESSAGES.add(MessageUtil.create(MessageType.UNDEFINED_VARIABLE, ctx));
                return null;
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
            INSTRUCTIONS.add(new Instruction(InstructionType.LIT, level, ctx.Boolean().getText().equals("true") ? 1 : 0));
        }
        return super.visitSimpleFactor(ctx);
    }

    @Override
    public Void visitIfStatement(NewtonParser.IfStatementContext ctx) {
        visit(ctx.expression()); // generuj instrukce pro podminku

        int position = INSTRUCTIONS.size();

        ctx.statement().forEach(this::visit);

        if (ctx.elseStatement() != null) {
            // podmineny skok, pokud existuje else vetev skoc na ni
            INSTRUCTIONS.add(position, new Instruction(InstructionType.JMC, level, INSTRUCTIONS.size() + 2));

            position = INSTRUCTIONS.size();

            // zpracuj else vetev
            visit(ctx.elseStatement());

            // zpracuje true vetev a po skonceni skoc preskoc else vetev
            INSTRUCTIONS.add(position, new Instruction(InstructionType.JMP, level, INSTRUCTIONS.size() + 1));
        } else {
            // pokud neexistuje else vetev skoc za podminku
            INSTRUCTIONS.add(position, new Instruction(InstructionType.JMC, level, INSTRUCTIONS.size() + 1));
        }

        return null;
    }

    @Override
    public Void visitWhileStatement(NewtonParser.WhileStatementContext ctx) {
        int iterationJump = INSTRUCTIONS.size();

        visit(ctx.expression());

        int position  = INSTRUCTIONS.size();

        ctx.statement().forEach(this::visit);

        INSTRUCTIONS.add(new Instruction(InstructionType.JMP, level, iterationJump));

        int condJump = INSTRUCTIONS.size() + 1;
        INSTRUCTIONS.add(position, new Instruction(InstructionType.JMC, level, condJump));

        return null;
    }

    @Override
    public Void visitDoWhileStatement(NewtonParser.DoWhileStatementContext ctx) {
        int iterationJump = INSTRUCTIONS.size();

        ctx.statement().forEach(this::visit);

        visit(ctx.expression());

        addNegation();  // Skaceme pri dodrzeni podminky, takze musime znegovat

        INSTRUCTIONS.add(new Instruction(InstructionType.JMC, level, iterationJump));

        return null;
    }

    private void addNegation() {
        INSTRUCTIONS.add(new Instruction(InstructionType.LIT, level, 0));
        INSTRUCTIONS.add(new Instruction(OperationType.EQ, level));
    }
}
