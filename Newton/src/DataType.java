/**
 * Created by Lukas Cerny.
 */
public enum DataType {
    INT,
    BOOL,
    ;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}