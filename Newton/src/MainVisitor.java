
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class MainVisitor extends NewtonBaseVisitor<Void> {

    private final List<Instruction> INSTRUCTIONS = new LinkedList<>();

    private final List<FunctionDefinition> FUNCTIONS = new LinkedList<>();

    private final Map<String, Variable> VARIABLES = new HashMap<>();

    private final Map<String, Variable> CONSTANTS = new HashMap<>();

    private final List<String> MESSAGES = new LinkedList<>();

    private int stackSize = 2;  // Aktivacni zaznam, vyresit lip

    public List<Instruction> getInstructions() {
        return INSTRUCTIONS;
    }

    public List<String> getMessages() {
        return MESSAGES;
    }

    private boolean isVariableDeclared(String name) {
        return VARIABLES.containsKey(name) || CONSTANTS.containsKey(name);
    }

    @Override
    public Void visitProgram(NewtonParser.ProgramContext ctx) {

        // vygenerovani opakujicich se kusu bloku, atd

        return super.visitProgram(ctx);
    }

    @Override
    public Void visitMainStatement(NewtonParser.MainStatementContext ctx) {
        if (!ctx.statement().isEmpty()) {
            // skoc na prvni instrukci v mainu
            INSTRUCTIONS.add(0, new Instruction(InstructionType.INT, 3));   // Pro aktivacni zaznam
            INSTRUCTIONS.add(1, new Instruction(InstructionType.CAL, INSTRUCTIONS.size() + 1));
        } else {
            // pokud je main prazdny, vytvori se pouze instrukce pro promene a konstanty
            INSTRUCTIONS.add(0, new Instruction(InstructionType.JMP, 1));
            INSTRUCTIONS.add(1, new Instruction(InstructionType.INT, 3));   // Pro aktivacni zaznam
        }


        return super.visitMainStatement(ctx);
    }

    @Override
    public Void visitVariableDefinition(NewtonParser.VariableDefinitionContext ctx) {
        String variableName = ctx.Identifier().getText();
        String type = ctx.baseType().getText();

        if (isVariableDeclared(variableName)) {
            MESSAGES.add(MessageUtil.create(MessageType.VARIABLE_IS_DECLARED, ctx)); return null;
        }

        INSTRUCTIONS.add(new Instruction(InstructionType.INT, 1));
        stackSize++;
        VARIABLES.put(variableName, new Variable(variableName, DataType.valueOf(type.toUpperCase()), stackSize));

        return super.visitVariableDefinition(ctx);
    }

    @Override
    public Void visitConstantDefinition(NewtonParser.ConstantDefinitionContext ctx) {

        String variableName = ctx.Identifier().getText();

        if (isVariableDeclared(variableName)) {
            MESSAGES.add(MessageUtil.create(MessageType.CONSTANT_IS_DECLARED, ctx)); return null;
        }

        Variable variable = null;
        String value = null;

        INSTRUCTIONS.add(new Instruction(InstructionType.INT, 1));
        stackSize++;

        if (ctx.IntType() != null) {
            value = ctx.Int().getText();
            variable = new Variable(variableName, DataType.INT, stackSize);
        } else if (ctx.BoolType() != null) {
            value = ctx.Boolean().getText();
            variable = new Variable(variableName, DataType.BOOL, stackSize);
        }

        INSTRUCTIONS.add(new Instruction(InstructionType.LIT, value));
        INSTRUCTIONS.add(new Instruction(InstructionType.STO, variable.getStackPosition()));

        VARIABLES.put(variableName, variable);

        return super.visitConstantDefinition(ctx);
    }

    @Override
    public Void visitAssignmentStatement(NewtonParser.AssignmentStatementContext ctx) {
        String variableName = ctx.Identifier().getText();
        String value = ctx.expression().getText();

        if (CONSTANTS.containsKey(variableName)) {
            MESSAGES.add(MessageUtil.create(MessageType.CONSTANT_INITIALIZE, ctx)); return null;
        }

        Variable variable = VARIABLES.get(variableName);

        if (variable == null) {
            MESSAGES.add(MessageUtil.create(MessageType.UNDEFINED_VARIABLE, ctx)); return null;
        }

        if (variable.getDataType().equals(DataType.BOOL)) {
            if (value.equals("true")) {
                value = "1";
            } else if (value.equals("false")) {
                value = "0";
            } else {
                MESSAGES.add(MessageUtil.create(MessageType.WRONG_INITIALIZE, ctx)); return null;
            }
        }

        INSTRUCTIONS.add(new Instruction(InstructionType.LIT, value));
        stackSize++;

        INSTRUCTIONS.add(new Instruction(InstructionType.STO, variable.getStackPosition()));

        return super.visitAssignmentStatement(ctx);
    }
}
