
import com.sun.corba.se.impl.naming.namingutil.INSURL;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
import java.util.function.Consumer;


public class MainVisitor extends NewtonBaseVisitor<DataType> {

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
    public DataType visitProgram(NewtonParser.ProgramContext ctx) {

        // vygenerovani opakujicich se kusu bloku, atd

        DataType result = super.visitProgram(ctx);

        INSTRUCTIONS.add(new Instruction(InstructionType.RET, 0, 0));

        return result;
    }

    @Override
    public DataType visitMainStatement(NewtonParser.MainStatementContext ctx) {

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
    public DataType visitProgramHeading(NewtonParser.ProgramHeadingContext ctx) {

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
    public DataType visitVariableDefinition(NewtonParser.VariableDefinitionContext ctx) {
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
    public DataType visitConstantDefinition(NewtonParser.ConstantDefinitionContext ctx) {
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

        DataType result = super.visitConstantDefinition(ctx);

        INSTRUCTIONS.add(new Instruction(InstructionType.LIT, value));
        INSTRUCTIONS.add(new Instruction(InstructionType.STO, variable.getStackPosition()));

        return result;
    }

    @Override
    public DataType visitParallelAssignmentStatement(NewtonParser.ParallelAssignmentStatementContext ctx) {

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

            DataType type =  visit(ctx.simpleFactor().get(i));

            if (type.equals(variable.getDataType())) {
                INSTRUCTIONS.add(new Instruction(InstructionType.STO, level, variable.getStackPosition()));
            } else {
                MESSAGES.add(MessageUtil.create(MessageType.WRONG_INITIALIZE, ctx));
            }
        }

        return null;
    }

    @Override
    public DataType visitAssignmentStatement(NewtonParser.AssignmentStatementContext ctx) {
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

        DataType result = super.visitAssignmentStatement(ctx);

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
    public DataType visitExpression(NewtonParser.ExpressionContext ctx) {

        if (!ctx.expression().isEmpty()) {
            visitStringOpr(ctx.expression(), ctx.LogicalOp(), res -> {
                if (res.equals("&&")) {
                    addAND();
                } else if (res.equals("||")) {
                    addOR();
                }
            });

            return null;
        }

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
            return DataType.BOOL;
        }

        return super.visitExpression(ctx);
    }

    @Override
    public DataType visitSimpleExpression(NewtonParser.SimpleExpressionContext ctx) {

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
            return DataType.INT;
        }

        return super.visitSimpleExpression(ctx);
    }

    @Override
    public DataType visitTerm(NewtonParser.TermContext ctx) {
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
            return DataType.INT;
        }

        return super.visitTerm(ctx);
    }

    @Override
    public DataType visitFactor(NewtonParser.FactorContext ctx) {
        if (ctx.Identifier() != null) {
            Variable variable = getVariable(ctx.Identifier().getText());
            if (variable == null) {
                MESSAGES.add(MessageUtil.create(MessageType.UNDEFINED_VARIABLE, ctx));
                return null;
            }
            INSTRUCTIONS.add(new Instruction(InstructionType.LOD, level, variable.getStackPosition()));
            return variable.getDataType();
        }
        return super.visitFactor(ctx);
    }

    @Override
    public DataType visitSimpleFactor(NewtonParser.SimpleFactorContext ctx) {
        if (ctx.Int() != null) {
            INSTRUCTIONS.add(new Instruction(InstructionType.LIT, level, ctx.Int().getText()));
            return DataType.INT;
        } else if (ctx.Boolean() != null) {
            INSTRUCTIONS.add(new Instruction(InstructionType.LIT, level, ctx.Boolean().getText().equals("true") ? 1 : 0));
            return DataType.BOOL;
        }
        return null; // nejnizsi uzel derivacniho stromu
    }

    @Override
    public DataType visitIfStatement(NewtonParser.IfStatementContext ctx) {
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
    public DataType visitWhileStatement(NewtonParser.WhileStatementContext ctx) {
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
    public DataType visitDoWhileStatement(NewtonParser.DoWhileStatementContext ctx) {
        int iterationJump = INSTRUCTIONS.size();

        ctx.statement().forEach(this::visit);

        visit(ctx.expression());

        addNegation();  // Skaceme pri dodrzeni podminky, takze musime znegovat

        INSTRUCTIONS.add(new Instruction(InstructionType.JMC, level, iterationJump));

        return null;
    }

    @Override
    public DataType visitRepeatUntilStatement(NewtonParser.RepeatUntilStatementContext ctx) {
        int iterationJump = INSTRUCTIONS.size();

        ctx.statement().forEach(this::visit);

        visit(ctx.expression());

        INSTRUCTIONS.add(new Instruction(InstructionType.JMC, level, iterationJump));

        return null;
    }

    @Override
    public DataType visitSwitchStatement(NewtonParser.SwitchStatementContext ctx) {
        List<Integer> jumpEndPositions = new ArrayList<Integer>();

        for (int i = 0; i < ctx.caseStatement().size(); i++) {
            visit(ctx.simpleExpression());

            INSTRUCTIONS.add(new Instruction(InstructionType.LIT, level, ctx.caseStatement(i).Int()+""));
            INSTRUCTIONS.add(new Instruction(OperationType.EQ, level));

            int position = INSTRUCTIONS.size();
            visit(ctx.caseStatement(i));

            jumpEndPositions.add(INSTRUCTIONS.size()+1+i);

            int pos = INSTRUCTIONS.size() + i + 2;
            INSTRUCTIONS.add(position, new Instruction(InstructionType.JMC, level, pos));
        }

        visit(ctx.statement()); // default

        int endJump = INSTRUCTIONS.size() + jumpEndPositions.size();
        for (Integer i : jumpEndPositions) {
            INSTRUCTIONS.add(i, new Instruction(InstructionType.JMP, level, endJump));
        }

        return null;
    }


    // TODO: Kontrola typu pri prirazeni
    @Override
    public DataType visitTernaryStatement(NewtonParser.TernaryStatementContext ctx) {
        DataType o1 = visit(ctx.expression(0));
        if (o1 != DataType.BOOL) {
            MESSAGES.add(MessageUtil.create(MessageType.WRONG_TYPE, ctx));
            return null;
        }

        int position = INSTRUCTIONS.size();

        DataType o2 = visit(ctx.expression(1));

        int jumpPos = INSTRUCTIONS.size()+1;

        INSTRUCTIONS.add(position, new Instruction(InstructionType.JMC, level, INSTRUCTIONS.size() + 2));

        DataType o3 = visit(ctx.expression(2));
        if (o2 != o3) {
            MESSAGES.add(MessageUtil.create(MessageType.WRONG_TYPE, ctx));
            return null;
        }

        INSTRUCTIONS.add(jumpPos, new Instruction(InstructionType.JMP, level, INSTRUCTIONS.size() + 1));

        return o3;
    }

    private void addAND() {
        INSTRUCTIONS.add(new Instruction(OperationType.EQ, level));
    }

    private void addOR() {
        INSTRUCTIONS.add(new Instruction(OperationType.ADD, level));
        INSTRUCTIONS.add(new Instruction(InstructionType.LIT, level, 0));
        INSTRUCTIONS.add(new Instruction(OperationType.EQ, level));
        addNegation();
    }

    private void addNegation() {
        INSTRUCTIONS.add(new Instruction(InstructionType.LIT, level, 0));
        INSTRUCTIONS.add(new Instruction(OperationType.EQ, level));
    }
}
