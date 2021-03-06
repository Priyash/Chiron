package BASE.foundation_types.terminology;

import com.sun.jndi.toolkit.url.Uri;

public class Terminology_code {
    private String terminology_id = "";
    private String terminology_version = "";
    private String code_string = "";
    private Uri uri = null;

    public Terminology_code(String terminology_id, String terminology_version, String code_string, Uri uri) {
        this.terminology_id = terminology_id;
        this.terminology_version = terminology_version;
        this.code_string = code_string;
        this.uri = uri;
    }

    public String getTerminology_id() {
        return terminology_id;
    }

    public String getTerminology_version() {
        return terminology_version;
    }

    public String getCode_string() {
        return code_string;
    }

    public Uri getUri() {
        return uri;
    }
}
