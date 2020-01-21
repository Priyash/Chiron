package BASE.base_types.identification;

import java.util.regex.Pattern;

public class TERMINOLOGY_ID extends OBJECT_ID {
    private String name;
    private String version;
    private static Pattern NAME_PATTERN = Pattern.compile("[a-zA-Z][a-zA-Z0-9()_/%$#&]*");
    public TERMINOLOGY_ID(String name, String version){
        this.name = name;
        this.version = version;
        super.setValue(this.name + this.version);
        this.validateAll();
    }

    private void validateAll(){
        if(!NAME_PATTERN.matcher(name).matches() || !NAME_PATTERN.matcher(version).matches()){
            throw new IllegalArgumentException("Wrong format of either name or version when creating TERMINOLOGY_ID");
        }
    }

}
