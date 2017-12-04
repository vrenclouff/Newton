
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class MainVisitor extends NewtonBaseVisitor<Integer> {

    private static final Map<String, Variable> VARIABLES = new HashMap<>();

    private static final Map<String, Variable> CONSTANTS = new HashMap<>();

    private static final List<String> MESSAGES = new LinkedList<>();

    private boolean isVariableDeclared(String name) {
        return VARIABLES.containsKey(name) || CONSTANTS.containsKey(name);
    }

    @Override
    public Integer visitProgram(NewtonParser.ProgramContext ctx) {

        Integer result = super.visitProgram(ctx);

        System.out.println("----- CONSTANTS ------");
        CONSTANTS.values().stream().forEach(System.out::println);

        System.out.println("----- VARIABLES ------");
        VARIABLES.values().stream().forEach(System.out::println);

        System.out.println("------ MESSAGES -------");
        MESSAGES.stream().forEach(System.out::println);

        return result;
    }

    @Override
    public Integer visitVariableDefinition(NewtonParser.VariableDefinitionContext ctx) {

        String variableName = ctx.Identifier().getText();
        String type = ctx.baseType().getText();

        if (isVariableDeclared(variableName)) {
            MESSAGES.add(MessageUtil.create(MessageType.VARIABLE_IS_DECLARED, ctx)); return null;
        }

        VARIABLES.put(variableName, new Variable(variableName, DataType.valueOf(type.toUpperCase())));

        return super.visitVariableDefinition(ctx);
    }

    @Override
    public Integer visitConstantDefinition(NewtonParser.ConstantDefinitionContext ctx) {

        String variableName = ctx.Identifier().getText();

        if (isVariableDeclared(variableName)) {
            MESSAGES.add(MessageUtil.create(MessageType.CONSTANT_IS_DECLARED, ctx)); return null;
        }

        if (ctx.IntType() != null) {
            CONSTANTS.put(variableName, new Variable(variableName, DataType.INT, new Double(ctx.Int().getText())));
        } else if (ctx.DoubleType() != null) {
            CONSTANTS.put(variableName, new Variable(variableName, DataType.DOUBLE, new Double(ctx.Double().getText())));
        } else if (ctx.BoolType() != null) {
            CONSTANTS.put(variableName, new Variable(variableName, DataType.BOOL, new Double(ctx.Boolean().getText().equals("true") ? 1 : 0)));
        }

        return super.visitConstantDefinition(ctx);
    }

    @Override
    public Integer visitAssignmentStatement(NewtonParser.AssignmentStatementContext ctx) {

        String variableName = ctx.Identifier().getText();
        String value = ctx.expression().getText();

        Variable variable = VARIABLES.get(variableName);

        if (variable == null) {
            MESSAGES.add(MessageUtil.create(MessageType.UNDEFINED_VARIABLE, ctx)); return null;
        }

        if (variable.getDataType().equals(DataType.BOOL)) {
            if (value.contains("true")) {
                value = "1";
            } else if (value.contains("false")) {
                value = "0";
            } else {
                MESSAGES.add(MessageUtil.create(MessageType.WRONG_INITIALIZE, ctx)); return null;
            }
        }

        variable.setValue(new Double(value));

        return super.visitAssignmentStatement(ctx);
    }
}
