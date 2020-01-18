package base.base_types.identification;

public abstract class UID {
    private String value;

    protected UID(String UID_VALUE){
        if(UID_VALUE.isEmpty()){
            throw new IllegalArgumentException("UID value is empty");
        }
        this.value = UID_VALUE;
    }

    public String getValue() {
        return value;
    }
}
