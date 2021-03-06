
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MainVisitor extends NewtonBaseVisitor<DataType> {

    private class VariableWrapper {
        Variable variable;
        int level;

        public VariableWrapper(Variable variable, int level) {
            this.variable = variable;
            this.level = level;
        }
    }

    /*
     * Aktivacni zaznam
     *      dynamicka baze
     *      staticka baze
     *      pozice navratove instrukce
     */
    private final int ACTIVATION_RECORD_SIZE = 3;

    /* Maximalni delka identifikatoru */
    private final int MAX_IDENTIFIER_LENGTH = 20;

    /* List instrukci */
    private final List<Instruction> INSTRUCTIONS = new LinkedList<>();

    /* List funkci */
    private final Map<String, FunctionDefinition> FUNCTIONS = new HashMap();

    /* Definice vsech promennych */
    private final Map<String, Variable> VARIABLES = new HashMap<>();

    /* Definice vsech konstant */
    private final Map<String, Variable> CONSTANTS = new HashMap<>();

    /* Hlasky pri preklady (ERROR, WARNING, atd..) */
    //private final List<String> MESSAGES = new LinkedList<>();

    /* Aktualni uroven zanoreni */
    private int level = 0;

    private Map<String, Variable> VARIABLES_TEMP = Collections.EMPTY_MAP;

    private Instruction jmpToMain = new Instruction(InstructionType.JMP, 0);

    public List<Instruction> getInstructions() {
        return INSTRUCTIONS;
    }

    private boolean isVariableDeclared(String name) {
        return VARIABLES.containsKey(name) || CONSTANTS.containsKey(name);
    }

    private VariableWrapper getVariable(String variableName) {
        if (VARIABLES_TEMP.containsKey(variableName)) {
            return new VariableWrapper(VARIABLES_TEMP.get(variableName), 0);
        } else if (VARIABLES.containsKey(variableName)) {
            return new VariableWrapper(VARIABLES.get(variableName), level);
        } else {
            return null;
        }
    }

    private VariableWrapper getVariableConstant(String variableName) {
        if (CONSTANTS.containsKey(variableName)) {
            return new VariableWrapper(CONSTANTS.get(variableName), level);
        }
        return getVariable(variableName);
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

        INSTRUCTIONS.add(new Instruction(InstructionType.JMP, 1));

        DataType result = super.visitProgram(ctx);

        INSTRUCTIONS.add(new Instruction(InstructionType.RET, 0, 0));

        return result;
    }

    @Override
    public DataType visitMainStatement(NewtonParser.MainStatementContext ctx) {

        if (ctx.statement().isEmpty()) {
            throw new GrammarException(MessageUtil.create(MessageType.EMPTY_MAIN, ctx));
        }

        jmpToMain.setValue(INSTRUCTIONS.size());

        return super.visitMainStatement(ctx);
    }

    @Override
    public DataType visitProgramHeading(NewtonParser.ProgramHeadingContext ctx) {

        // pro aktivacni zaznam
        int spaceAtStack = ACTIVATION_RECORD_SIZE;

        // misto pro promenne a konstanty
        spaceAtStack += ctx.constantDefinitionPart().constantDefinition().size()
                + ctx.variableDefinitionPart().variableDefinition().size() + 1; // + 1 pro return hodnotu

        // promenne a konstanty maji bazi 0
        INSTRUCTIONS.add(new Instruction(InstructionType.INT, spaceAtStack));
        VARIABLES.put("#", new Variable("#", DataType.INT, ACTIVATION_RECORD_SIZE));

        visit(ctx.constantDefinitionPart());
        visit(ctx.variableDefinitionPart());

        INSTRUCTIONS.add(jmpToMain);

        return null;
    }

    @Override
    public DataType visitVariableDefinition(NewtonParser.VariableDefinitionContext ctx) {
        String variableName = ctx.Identifier().getText();

        if (variableName.length() > MAX_IDENTIFIER_LENGTH) {
            throw new GrammarException(MessageUtil.create(MessageType.OVERFLOWED_IDENTIFIER, ctx));
        }

        String type = ctx.baseType().getText();

        if (isVariableDeclared(variableName)) {
            throw new GrammarException(MessageUtil.create(MessageType.VARIABLE_IS_DECLARED, ctx));
        }

        int position = VARIABLES.size() + CONSTANTS.size() + ACTIVATION_RECORD_SIZE;
        Variable variable = new Variable(variableName, DataType.valueOf(type.toUpperCase()), position);

        VARIABLES.put(variableName, variable);

        INSTRUCTIONS.add(new Instruction(InstructionType.LIT, 0));
        INSTRUCTIONS.add(new Instruction(InstructionType.STO, variable.getStackPosition()));

        return super.visitVariableDefinition(ctx);
    }

    @Override
    public DataType visitConstantDefinition(NewtonParser.ConstantDefinitionContext ctx) {
        String variableName = ctx.Identifier().getText();

        if (variableName.length() > MAX_IDENTIFIER_LENGTH) {
            throw new GrammarException(MessageUtil.create(MessageType.OVERFLOWED_IDENTIFIER, ctx));
        }

        if (isVariableDeclared(variableName)) {
            throw new GrammarException(MessageUtil.create(MessageType.CONSTANT_IS_DECLARED, ctx));
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
            throw new GrammarException(MessageUtil.create(MessageType.PARALLEL_WRONG_OPERAND_SIZE, ctx));
        }

        for (int i = 0; i < ctx.Identifier().size(); i++) {

            VariableWrapper variableWrapper = getVariable(ctx.Identifier().get(i).getText());

            if (variableWrapper == null) {
                throw new GrammarException(MessageUtil.create(MessageType.UNDEFINED_VARIABLE, ctx));
            }

            DataType type =  visit(ctx.simpleFactor().get(i));

            if (type.equals(variableWrapper.variable.getDataType())) {
                INSTRUCTIONS.add(new Instruction(InstructionType.STO, variableWrapper.level, variableWrapper.variable.getStackPosition()));
            } else {
                throw new GrammarException(MessageUtil.create(MessageType.WRONG_INITIALIZE, ctx));
            }
        }

        return null;
    }

    @Override
    public DataType visitFunctionStatement(NewtonParser.FunctionStatementContext ctx) {

        level++;
        String name = ctx.Identifier().getText();

        if (name.length() > MAX_IDENTIFIER_LENGTH) {
            throw new GrammarException(MessageUtil.create(MessageType.OVERFLOWED_IDENTIFIER, ctx));
        }

        DataType returnType = ctx.baseType() != null ? (ctx.baseType().IntType() != null ? DataType.INT : DataType.BOOL) : DataType.VOID;
        Variable[] params = ctx.tag() != null ? new Variable[ctx.tag().baseType().size()] : new Variable[0];

        for(int i = 0; i < params.length; i++) {
            String varName = ctx.tag().Identifier(i).getText();
            DataType varType = ctx.tag().baseType(i).IntType() != null ? DataType.INT : DataType.BOOL;
            params[i] = new Variable(varName, varType, -(params.length-i));
        }

        VARIABLES_TEMP = Stream.of(params).collect(Collectors.toMap(Variable::getName, Function.identity()));

        FUNCTIONS.put(name, new FunctionDefinition(name, INSTRUCTIONS.size(), returnType, params));

        // vytvor aktivacni zaznam
        int spaceAtStack = ACTIVATION_RECORD_SIZE + 0; // 0 pocet parametru
        INSTRUCTIONS.add(new Instruction(InstructionType.INT, spaceAtStack));

        ctx.statement().forEach(this::visit); // vytvor insturkce obsahu funkce

        if (!returnType.equals(DataType.VOID)) {
            // funce ma navratovy typ
            DataType type = ctx.expression() != null ? visit(ctx.expression()) : visit(ctx.ternaryStatement());

            if (!returnType.equals(type)) {
                throw new GrammarException(MessageUtil.create(MessageType.WRONG_TYPE, ctx));
            }

            // uloz return hodnotu do pripraveneho mista na zasobniku
            VariableWrapper variableWrapper = getVariable("#");
            INSTRUCTIONS.add(new Instruction(InstructionType.STO, variableWrapper.level, variableWrapper.variable.getStackPosition()));
        }

        INSTRUCTIONS.add(new Instruction(InstructionType.RET, 0));

        VARIABLES_TEMP = Collections.EMPTY_MAP;

        level--;
        return returnType;
    }

    @Override
    public DataType visitCallFunctionStatement(NewtonParser.CallFunctionStatementContext ctx) {

        boolean isAssign = ctx.Assign() != null && ctx.Identifier().size() > 1;
        String fncName = isAssign ? ctx.Identifier(1).getText() : ctx.Identifier(0).getText();

        FunctionDefinition function = FUNCTIONS.get(fncName);

        if (function == null) {
            throw new GrammarException(MessageUtil.create(MessageType.UNKNOWN_FUNCTION, ctx));
        }

        int paramsCount = ctx.parameterList() != null ? ctx.parameterList().expression().size() : 0;

        if (function.getParams().length != paramsCount) {
            throw new GrammarException(MessageUtil.create(MessageType.WRONG_PARAMS_COUNT, ctx));
        }

        for (int param = 0; param < paramsCount; param++) {
            DataType paramType = visit(ctx.parameterList().expression(param));
            if (!function.getParams()[param].getDataType().equals(paramType)) {
                throw new GrammarException(MessageUtil.create(MessageType.WRONG_TYPE, ctx));
            }
        }

        INSTRUCTIONS.add(new Instruction(InstructionType.CAL, level, function.getAddress()));

        if (paramsCount != 0) {
            INSTRUCTIONS.add(new Instruction(InstructionType.INT, -paramsCount));
        }

        if (isAssign) {

            VariableWrapper variableWrapper = getVariable(ctx.Identifier(0).getText());

            if (variableWrapper == null) {
                throw new GrammarException(MessageUtil.create(MessageType.UNDEFINED_VARIABLE, ctx));
            }

            if (!variableWrapper.variable.getDataType().equals(function.getReturnType())) {
                throw new GrammarException(MessageUtil.create(MessageType.WRONG_TYPE, ctx));
            }

            VariableWrapper variableTemp = getVariable("#");
            INSTRUCTIONS.add(new Instruction(InstructionType.LOD,variableTemp.level, variableTemp.variable.getStackPosition()));
            INSTRUCTIONS.add(new Instruction(InstructionType.STO, variableWrapper.level, variableWrapper.variable.getStackPosition()));

        }

        return null;
    }

    @Override
    public DataType visitAssignmentStatement(NewtonParser.AssignmentStatementContext ctx) {
        String variableName = ctx.Identifier().getText();

        if (CONSTANTS.containsKey(variableName)) {
            throw new GrammarException(MessageUtil.create(MessageType.CONSTANT_INITIALIZE, ctx));
        }

        VariableWrapper variableWrapper = getVariable(variableName);

        if (variableWrapper == null) {
            throw new GrammarException(MessageUtil.create(MessageType.UNDEFINED_VARIABLE, ctx));
        }

        DataType result = ctx.expression() != null ? visit(ctx.expression()) : visit(ctx.ternaryStatement());

        if (!variableWrapper.variable.getDataType().equals(result)) {
            throw new GrammarException(MessageUtil.create(MessageType.WRONG_TYPE, ctx));
        }

        INSTRUCTIONS.add(new Instruction(InstructionType.STO, variableWrapper.level, variableWrapper.variable.getStackPosition()));

        ctx.multipleAssignmentStatement().forEach(e -> {

            VariableWrapper varWrapper = getVariable(e.Identifier().getText());

            if (varWrapper == null) {
                throw new GrammarException(MessageUtil.create(MessageType.UNDEFINED_VARIABLE, ctx));
            }

            if (!varWrapper.variable.getDataType().equals(result)) {
                throw new GrammarException(MessageUtil.create(MessageType.WRONG_TYPE, ctx));
            }

            INSTRUCTIONS.add(new Instruction(InstructionType.LOD, level, variableWrapper.variable.getStackPosition()));
            INSTRUCTIONS.add(new Instruction(InstructionType.STO, level, varWrapper.variable.getStackPosition()));
        });

        return result;
    }

    @Override
    public DataType visitIfStatement(NewtonParser.IfStatementContext ctx) {

        visit(ctx.expression()); // generuj instrukce pro podminku

        Instruction jmc = new Instruction(InstructionType.JMC, 0);
        INSTRUCTIONS.add(jmc);

        ctx.statement().forEach(this::visit);

        if (ctx.elseStatement() != null) {

            // po vykonani true preskoc else
            Instruction jmp = new Instruction(InstructionType.JMP, 0);
            INSTRUCTIONS.add(jmp);

            // nastav adresu zacatku else
            jmc.setValue(INSTRUCTIONS.size());

            visit(ctx.elseStatement());

            jmp.setValue(INSTRUCTIONS.size());

        } else {
            // skoc na kod za podminkou
            jmc.setValue(INSTRUCTIONS.size());
        }

        return null;
    }

    @Override
    public DataType visitForStatement(NewtonParser.ForStatementContext ctx) {

        VariableWrapper variableWrapper;

        if (ctx.Identifier() != null) {
            variableWrapper = getVariable(ctx.Identifier().getText());

            if (variableWrapper == null) {
                throw new GrammarException(MessageUtil.create(MessageType.UNDEFINED_VARIABLE, ctx));
            }

        } else {
            variableWrapper = getVariable("#");
        }

        // vytvor instrukce pro pocatecni hodnotu
        DataType startType = visit(ctx.factor(0));

        if (!startType.equals(DataType.INT)) {
            throw new GrammarException(MessageUtil.create(MessageType.WRONG_TYPE, ctx));
        }

        INSTRUCTIONS.add(new Instruction(InstructionType.STO, variableWrapper.level, variableWrapper.variable.getStackPosition()));

        int iterationJump = INSTRUCTIONS.size();

        INSTRUCTIONS.add(new Instruction(InstructionType.LOD, variableWrapper.level, variableWrapper.variable.getStackPosition()));

        DataType endType = visit(ctx.factor(1));

        if (!endType.equals(DataType.INT)) {
            throw new GrammarException(MessageUtil.create(MessageType.WRONG_TYPE, ctx));
        }

        INSTRUCTIONS.add(new Instruction(OperationType.LTE));

        Instruction jmc = new Instruction(InstructionType.JMC, 0);
        INSTRUCTIONS.add(jmc);

        // vytvor obsah foru
        ctx.statement().forEach(this::visit);

        INSTRUCTIONS.add(new Instruction(InstructionType.LOD, variableWrapper.level, variableWrapper.variable.getStackPosition()));
        String increment = ctx.Int() != null ? ctx.Int().getText() : "1";
        INSTRUCTIONS.add(new Instruction(InstructionType.LIT, increment));
        INSTRUCTIONS.add(new Instruction(OperationType.ADD));
        INSTRUCTIONS.add(new Instruction(InstructionType.STO, variableWrapper.level, variableWrapper.variable.getStackPosition()));
        INSTRUCTIONS.add(new Instruction(InstructionType.JMP, iterationJump));

        jmc.setValue(INSTRUCTIONS.size());

        return null;
    }

    @Override
    public DataType visitWhileStatement(NewtonParser.WhileStatementContext ctx) {

        int iterationJump = INSTRUCTIONS.size();

        DataType conditional = visit(ctx.expression());
        if (conditional != DataType.BOOL) {
            throw new GrammarException(MessageUtil.create(MessageType.WRONG_TYPE, ctx));
        }

        Instruction jmc = new Instruction(InstructionType.JMC, 0);
        INSTRUCTIONS.add(jmc);

        ctx.statement().forEach(this::visit);

        INSTRUCTIONS.add(new Instruction(InstructionType.JMP, iterationJump));

        jmc.setValue(INSTRUCTIONS.size());

        return null;
    }

    @Override
    public DataType visitDoWhileStatement(NewtonParser.DoWhileStatementContext ctx) {
        int iterationJump = INSTRUCTIONS.size();

        ctx.statement().forEach(this::visit);

        visit(ctx.expression());

        addNegation();  // Skaceme pri dodrzeni podminky, takze musime znegovat

        INSTRUCTIONS.add(new Instruction(InstructionType.JMC, iterationJump));

        return null;
    }

    @Override
    public DataType visitRepeatUntilStatement(NewtonParser.RepeatUntilStatementContext ctx) {
        int iterationJump = INSTRUCTIONS.size();

        ctx.statement().forEach(this::visit);

        visit(ctx.expression());

        INSTRUCTIONS.add(new Instruction(InstructionType.JMC, iterationJump));

        return null;
    }

    @Override
    public DataType visitSwitchStatement(NewtonParser.SwitchStatementContext ctx) {

        DataType switchParam = visit(ctx.simpleExpression());

        if (!switchParam.equals(DataType.INT)) {
            throw new GrammarException(MessageUtil.create(MessageType.WRONG_TYPE, ctx));
        }

        VariableWrapper tempVar = getVariable("#");
        INSTRUCTIONS.add(new Instruction(InstructionType.STO, tempVar.level, tempVar.variable.getStackPosition()));

        Instruction jmp = new Instruction(InstructionType.JMP, 0); // skok za switch

        ctx.caseStatement().forEach(caseStatement -> {

            // nacti hodnotu switche
            INSTRUCTIONS.add(new Instruction(InstructionType.LOD, tempVar.level, tempVar.variable.getStackPosition()));

            // nacti hodnotu case
            INSTRUCTIONS.add(new Instruction(InstructionType.LIT, caseStatement.Int().getText()));

            // porovnej
            INSTRUCTIONS.add(new Instruction(OperationType.EQ));

            // podminey skok - pokud se rovnaji, vykonej case, kdyz ne skoc na dalsi case
            Instruction jmc = new Instruction(InstructionType.JMC, 0);
            INSTRUCTIONS.add(jmc);

            visit(caseStatement);

            // vyskoc ze switche
            INSTRUCTIONS.add(jmp);

            // adresa pri skoku na dalsi case
            jmc.setValue(INSTRUCTIONS.size());
        });

        visit(ctx.statement()); // default

        jmp.setValue(INSTRUCTIONS.size());

        return null;
    }

    @Override
    public DataType visitTernaryStatement(NewtonParser.TernaryStatementContext ctx) {

        DataType conditional = visit(ctx.expression(0));
        if (conditional != DataType.BOOL) {
            throw new GrammarException(MessageUtil.create(MessageType.WRONG_TYPE, ctx));
        }

        Instruction jmc = new Instruction(InstructionType.JMC, 0);
        INSTRUCTIONS.add(jmc);

        DataType trueExpression = visit(ctx.expression(1));

        Instruction jmp = new Instruction(InstructionType.JMP, 0);
        INSTRUCTIONS.add(jmp);

        jmc.setValue(INSTRUCTIONS.size());

        DataType falseExpression =  visit(ctx.expression(2));

        jmp.setValue(INSTRUCTIONS.size());

        if (!trueExpression.equals(falseExpression)) {
            throw new GrammarException(MessageUtil.create(MessageType.WRONG_TYPE, ctx));
        }

        return trueExpression;
    }

    @Override
    public DataType visitExpression(NewtonParser.ExpressionContext ctx) {
        if (ctx.relationExpression().size() > 1) {
            visitIntOpr(ctx.relationExpression(), ctx.And(), ctx.Or(), res -> {
                switch (res) {
                    case NewtonParser.And:
                        INSTRUCTIONS.add(new Instruction(OperationType.EQ));
                        break;
                    case NewtonParser.Or:
                        INSTRUCTIONS.add(new Instruction(OperationType.ADD));
                        INSTRUCTIONS.add(new Instruction(InstructionType.LIT, 0));
                        INSTRUCTIONS.add(new Instruction(OperationType.EQ));
                        addNegation();
                        break;
                }
            });
            return DataType.BOOL;
        }
        return super.visitExpression(ctx);
    }

    @Override
    public DataType visitRelationExpression(NewtonParser.RelationExpressionContext ctx) {
        if (ctx.simpleExpression().size() > 1) {
            visitStringOpr(ctx.simpleExpression(), ctx.RelationOp(), res -> {
                if (res.equals("<")) {
                    INSTRUCTIONS.add(new Instruction(OperationType.LT));
                } else if (res.equals("<=")) {
                    INSTRUCTIONS.add(new Instruction(OperationType.LTE));
                } else if (res.equals(">")) {
                    INSTRUCTIONS.add(new Instruction(OperationType.GT));
                } else if (res.equals(">=")) {
                    INSTRUCTIONS.add(new Instruction(OperationType.GTE));
                } else if (res.equals("==")) {
                    INSTRUCTIONS.add(new Instruction(OperationType.EQ));
                }
            });
            return DataType.BOOL;
        }
        return super.visitRelationExpression(ctx);
    }

    @Override
    public DataType visitMulDiv(NewtonParser.MulDivContext ctx) {

        DataType left = visit(ctx.simpleExpression(0));
        DataType right = visit(ctx.simpleExpression(1));

        if (!(left.equals(DataType.INT) || right.equals(DataType.INT))) {
            throw new GrammarException(MessageUtil.create(MessageType.WRONG_TYPE, ctx));
        }

        switch (ctx.op.getType()) {
            case NewtonParser.Mul:
                INSTRUCTIONS.add(new Instruction(OperationType.MUL));
                break;
            case NewtonParser.Div:
                INSTRUCTIONS.add(new Instruction(OperationType.DIV));
                break;
        }

        return DataType.INT;
    }

    @Override
    public DataType visitParents(NewtonParser.ParentsContext ctx) {
        return visit(ctx.simpleExpression());
    }

    @Override
    public DataType visitAddSub(NewtonParser.AddSubContext ctx) {

        DataType left = visit(ctx.simpleExpression(0));
        DataType right = visit(ctx.simpleExpression(1));

        if (!(left.equals(DataType.INT) || right.equals(DataType.INT))) {
            throw new GrammarException(MessageUtil.create(MessageType.WRONG_TYPE, ctx));
        }

        switch (ctx.op.getType()) {
            case NewtonParser.Add:
                INSTRUCTIONS.add(new Instruction(OperationType.ADD));
                break;
            case NewtonParser.Sub:
                INSTRUCTIONS.add(new Instruction(OperationType.SUB));
                break;
        }

        return DataType.INT;
    }

    @Override
    public DataType visitFactor(NewtonParser.FactorContext ctx) {
        if (ctx.Identifier() != null) {
            VariableWrapper variableWrapper = getVariableConstant(ctx.Identifier().getText());
            if (variableWrapper == null) {
                throw new GrammarException(MessageUtil.create(MessageType.UNDEFINED_VARIABLE, ctx));
            }
            INSTRUCTIONS.add(new Instruction(InstructionType.LOD, variableWrapper.level, variableWrapper.variable.getStackPosition()));
            return variableWrapper.variable.getDataType();
        }
        return super.visitFactor(ctx);
    }

    @Override
    public DataType visitSimpleFactor(NewtonParser.SimpleFactorContext ctx) {
        if (ctx.Int() != null) {
            INSTRUCTIONS.add(new Instruction(InstructionType.LIT, ctx.Int().getText()));
            return DataType.INT;
        } else if (ctx.Boolean() != null) {
            INSTRUCTIONS.add(new Instruction(InstructionType.LIT, ctx.Boolean().getText().equals("true") ? 1 : 0));
            return DataType.BOOL;
        }
        return null; // nejnizsi uzel derivacniho stromu
    }

    private void addNegation() {
        INSTRUCTIONS.add(new Instruction(InstructionType.LIT, 0));
        INSTRUCTIONS.add(new Instruction(OperationType.EQ));
    }
}
