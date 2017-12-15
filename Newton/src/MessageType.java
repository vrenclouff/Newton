/**
 * Created by Lukas Cerny.
 */

/**
 * ENABLE PARAMS
 *
 * {0} = line
 */

public enum MessageType {
    VARIABLE_IS_DECLARED            (Type.ERROR, "at line {0}. Variable was declared."),
    CONSTANT_IS_DECLARED            (Type.ERROR, "at line {0}. Constant was declared."),
    CONSTANT_INITIALIZE             (Type.ERROR, "at line {0}. Constant can not be initialized."),
    CAN_NOT_INITIALIZE_CONSTANT     (Type.ERROR, "at line {0}. Constant can not be initialized."),
    UNDEFINED_VARIABLE              (Type.ERROR, "at line {0}. Variable is undefined."),
    WRONG_INITIALIZE                (Type.ERROR, "at line {0}. Incompatible types."),
    UNSUPPORTED_OPERATION           (Type.ERROR, "at line {0}. Unsupported operation."),
    PARALLEL_WRONG_OPERAND_SIZE     (Type.ERROR, "at line {0}. Number of variables doesn't equal of number of values."),
    EMPTY_MAIN                      (Type.WARNING, "Main function is empty. Program doesn't have do nothing."),

    ;
    private final Type type;
    private final String pattern;
    MessageType(Type type, String pattern) {
        this.type = type;
        this.pattern = pattern;
    }

    public String getPattern() {
        return type+" "+pattern;
    }
}

enum Type {
    ERROR    ("ERROR"),
    WARNING  ("WARNING"),
    INFO     ("INFO"),

    ;
    private final String str;
    Type(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return this.str;
    }
}