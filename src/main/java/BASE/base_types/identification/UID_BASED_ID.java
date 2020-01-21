package BASE.base_types.identification;

public abstract class UID_BASED_ID extends OBJECT_ID {
    protected UID_BASED_ID(String value) {
        super(value);
    }

    protected UID_BASED_ID() {

    }

    public abstract UID root();
    public abstract String extension();
    public abstract Boolean has_extension();
    public Boolean is_extension_valid(){
        return extension().isEmpty() ^ has_extension();
    }

}
