package base.base_types.identification;

public class LOCATABLE_REF extends OBJECT_REF {
    private String path = "";
    private String uri_scheme = "ehr:";
    private String PATH_SECTION_DOUBLE = "//";
    private String PATH_SECTION_SINGLE = "/";

    protected LOCATABLE_REF(String namespace, String type, UID_BASED_ID id, String path) {
        super(namespace, type, id);
        this.path = path;
        validate();
    }

    private void validate(){
        if(!path.isEmpty()){
            throw new IllegalArgumentException("Given path is empty");
        }
    }

    public String as_uri(){
        return this.uri_scheme + this.PATH_SECTION_DOUBLE + super.getId().getValue() + PATH_SECTION_SINGLE + this.path;
    }

    public String getPath(){
        return this.path;
    }
}
