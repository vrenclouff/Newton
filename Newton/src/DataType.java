/**
 * Created by Lukas Cerny.
 */
public enum DataType {
    INT,
    BOOL,
    DOUBLE,

    ;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}