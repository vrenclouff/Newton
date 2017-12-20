public class FunctionDefinition {

    private String name;
    private int address;
    private DataType returnType;
    private Variable[] params;

    public FunctionDefinition(String name, int address, DataType returnType, Variable[] params) {
        this.name = name;
        this.address = address;
        this.returnType = returnType;
        this.params = params;
    }

    public String getName() {
        return name;
    }

    public int getAddress() {
        return address;
    }

    public DataType getReturnType() {
        return returnType;
    }

    public Variable[] getParams() {
        return params;
    }
}
