/**
 * Created by Lukas Cerny.
 */
public enum DataType {
    INT,
    BOOL,
    VOID,
    ;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}