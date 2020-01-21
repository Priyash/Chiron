package BASE.base_types.identification;

public abstract class OBJECT_ID {
    private String value;
    protected OBJECT_ID(String value){
        this.value = value;
    }

    protected OBJECT_ID() {

    }

    public void setValue(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

}
