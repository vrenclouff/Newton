/**
 * Created by Lukas Cerny.
 */
public class Variable {

    private String name;

    private DataType dataType;

    private Double value;

    public Variable(String name, DataType dataType) {
        this.name = name;
        this.dataType = dataType;
        this.value = new Double(0);
    }

    public Variable(String name, DataType dataType, Double value) {
        this.name = name;
        this.dataType = dataType;
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public DataType getDataType() {
        return dataType;
    }

    @Override
    public String toString() {
        return dataType + " " + name + " = " + DataTypeFormatter.formatValue(dataType, value);
    }
}