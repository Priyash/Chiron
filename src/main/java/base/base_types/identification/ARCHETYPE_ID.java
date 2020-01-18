package base.base_types.identification;

import java.util.regex.Pattern;

public class ARCHETYPE_ID extends OBJECT_ID {
    private static final String AXIS_SEPARATOR = ".";
    private static final String SECTION_SEPARATOR = "-";
    private static Pattern NAME_PATTERN = Pattern.compile("[a-zA-Z][a-zA-Z0-9()_/%$#&]*");
    private static Pattern VERSION_PATTERN = Pattern.compile("[a-zA-Z0-9]+");

    private String rm_originator = "";
    private String rm_name = "";
    private String rm_entity = "";
    private String concept_name = "";
    private String specialisation = "";
    private String version_id = "";
    private char versionChar = 'V';

    private String ARCH_ID = "";
    public ARCHETYPE_ID(String rm_originator, String rm_name, String rm_entity, String concept_name, String specialisation) {
        if(rm_entity.isEmpty() || rm_name.isEmpty() || rm_entity.isEmpty() || concept_name.isEmpty() || specialisation.isEmpty()){
            throw new IllegalArgumentException("One of the passing arguments cannot be empty or null");
        }

        this.rm_originator = rm_originator;
        this.rm_name = rm_name;
        this.rm_entity = rm_entity;
        this.concept_name = concept_name;
        this.specialisation = specialisation;
        this.ARCH_ID = this.toQualifiedRmEntity() + AXIS_SEPARATOR + this.toDomainConcept() + AXIS_SEPARATOR + versionChar + this.version_id;
        super.setValue(this.ARCH_ID);
        this.validateAll();
    }

    private void validateAll(){
        if(!NAME_PATTERN.matcher(this.rm_originator).matches()){
            throw new IllegalArgumentException("rm_originator format is wrong it should be alphanumeric value");
        } else if(!NAME_PATTERN.matcher(this.rm_name).matches()){
            throw new IllegalArgumentException("rm_name format is wrong it should be alphanumeric value");
        } else if(!NAME_PATTERN.matcher(this.rm_entity).matches()){
            throw new IllegalArgumentException("rm_entity format is wrong it should be alphanumeric value");
        } else if(!NAME_PATTERN.matcher(this.concept_name).matches()){
            throw new IllegalArgumentException("concept_name format is wrong it should be alphanumeric value");
        } else if(!NAME_PATTERN.matcher(this.specialisation).matches()){
            throw new IllegalArgumentException("specialisation format is wrong it should be alphanumeric value");
        }

        if(!VERSION_PATTERN.matcher(this.version_id).matches()){
            throw new IllegalArgumentException("version_id format is wrong it should be non-zero digit value example v123 ");
        }
    }

    private String toDomainConcept(){
        return this.concept_name + "{" + SECTION_SEPARATOR + this.specialisation + "}";
    }
    private String toQualifiedRmEntity(){
        return this.rm_originator + this.SECTION_SEPARATOR + this.rm_name + this.SECTION_SEPARATOR + this.rm_entity;
    }


    public String qualified_rm_entity(){
        return this.qualified_rm_entity();
    }

    public String domain_concept(){
        return this.concept_name + "{" + SECTION_SEPARATOR + this.specialisation + "}";
    }

    public  String rm_originator (){
        return this.rm_originator;
    }

    public String rm_name(){
        return this.rm_name;
    }

    public String rm_entity(){
        return this.rm_entity;
    }

    public String specialisation(){
        return this.specialisation;
    }

    public String version_id(){
        return this.version_id;
    }
}
