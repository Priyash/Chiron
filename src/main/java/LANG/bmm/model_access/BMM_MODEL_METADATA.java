package LANG.bmm.model_access;

import java.util.regex.Pattern;

public class BMM_MODEL_METADATA {
    private String rm_publisher = "";
    private String rm_release = "";
    private Pattern rm_release_pattern = Pattern.compile("[0-9].[0-9].[0.9]");
    public BMM_MODEL_METADATA() {
    }

    public BMM_MODEL_METADATA(String rm_publisher, String rm_release) {
        this.rm_publisher = rm_publisher;
        this.rm_release = rm_release;
        validate();
    }

    private void validate() {
        if(!rm_release_pattern.matcher(rm_release).matches()){
            throw new IllegalArgumentException("Wrong format of rm_release variable should in the form for example : 3.1.0");
        }
    }

    public String getRm_publisher() {
        return new String(rm_publisher);
    }

    public String getRm_release() {
        return new String(rm_release);
    }
}
