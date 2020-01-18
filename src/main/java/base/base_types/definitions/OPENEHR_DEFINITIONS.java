package base.base_types.definitions;

public class OPENEHR_DEFINITIONS extends BASIC_DEFINITIONS {
    private String local_terminology_id = "local";

    public OPENEHR_DEFINITIONS(){

    }
    public OPENEHR_DEFINITIONS(String local_terminology_id){
        this.local_terminology_id = local_terminology_id;
    }

    public String getLocaTerminologyId(){return this.local_terminology_id;}
}
