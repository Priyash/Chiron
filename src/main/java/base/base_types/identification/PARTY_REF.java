package base.base_types.identification;

public class PARTY_REF extends OBJECT_REF {
    private enum PARTY_REF_ENUM{
        PERSON,
        ORGANISATION,
        GROUP,
        AGENT,
        ROLE,
        PARTY,
        ACTOR
    }

    public PARTY_REF(String namespace, String type, OBJECT_ID id) {
        super(namespace, type, id);
        this.validateAll();
    }

    private void validateAll(){
        if(!super.getType().equals(PARTY_REF_ENUM.PERSON.toString()) ||
                !super.getType().equals(PARTY_REF_ENUM.ORGANISATION.toString()) ||
                !super.getType().equals(PARTY_REF_ENUM.GROUP.toString()) ||
                !super.getType().equals(PARTY_REF_ENUM.AGENT.toString()) ||
                !super.getType().equals(PARTY_REF_ENUM.ROLE.toString()) ||
                !super.getType().equals(PARTY_REF_ENUM.PARTY.toString()) ||
                !super.getType().equals(PARTY_REF_ENUM.ACTOR.toString())
        ){
            throw new IllegalArgumentException("Party definition doesn't match in EHR system");
        }
    }
}
