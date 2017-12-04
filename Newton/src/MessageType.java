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
    CAN_NOT_INITIALIZE_CONSTANT     (Type.ERROR, "at line {0}. Constant can not be initialized."),
    UNDEFINED_VARIABLE              (Type.ERROR, "at line {0}. Variable is undefined."),
    WRONG_INITIALIZE                (Type.ERROR, "at line {0}. Incompatible types."),

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