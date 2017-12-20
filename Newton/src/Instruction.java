/**
 * Created by Lukas Cerny.
 */
public class Instruction {

    private InstructionType type;
    private int level;
    private String value;

    public Instruction(InstructionType type, int level, String value) {
        this.type = type;
        this.level = level;
        this.value = value;
    }

    public Instruction(OperationType operationType) {
        this(InstructionType.OPR, 0, operationType.ordinal() + 1);
    }

    public Instruction(InstructionType type, int level, int value) {
        this(type, level, String.valueOf(value));
    }

    public Instruction(InstructionType type, int value) {
        this(type, 0, String.valueOf(value));
    }

    public Instruction(InstructionType type, String value) {
        this(type, 0, value);
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = String.valueOf(value);
    }

    @Override
    public String toString() {
        return type + "\t" + level + "\t" + value;
    }
}
