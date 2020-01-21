package BASE.resource;

import BASE.foundation_types.terminology.Terminology_code;

import java.util.List;
import java.util.Map;

public class RESOURCE_DESCRIPTION_ITEM {
    private Terminology_code language = null;
    private String purpose = "";
    private List<String> keywords = null;
    private String use = "";
    private String misuse = "";
    private Map<String, String> original_resource_uri = null;
    private Map<String, String> other_details = null;

    public Terminology_code getLanguage() {
        return language;
    }

    public String getPurpose() {
        return purpose;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public String getUse() {
        return use;
    }

    public String getMisuse() {
        return misuse;
    }

    public Map<String, String> getOriginal_resource_uri() {
        return original_resource_uri;
    }

    public Map<String, String> getOther_details() {
        return other_details;
    }

    public RESOURCE_DESCRIPTION_ITEM(Terminology_code language, String purpose, List<String> keywords, String use, String misuse, Map<String, String> original_resource_uri, Map<String, String> other_details) {
        this.language = language;
        this.purpose = purpose;
        this.keywords = keywords;
        this.use = use;
        this.misuse = misuse;
        this.original_resource_uri = original_resource_uri;
        this.other_details = other_details;
        this.validate();

    }

    private void validate(){
        if(this.language == null){
            throw new IllegalArgumentException("Terminology_Code is null");
        } else if(purpose.isEmpty()){
            throw new IllegalArgumentException("Please provide purpose for this resource item description");
        } else if(keywords.isEmpty() || keywords == null){
            throw new IllegalArgumentException("keywords are null");
        } else if(use.isEmpty()) {
            throw new IllegalArgumentException("There should be one description of the use of this resource");
        }else if(misuse.isEmpty()) {
            throw new IllegalArgumentException("There should be one description of the misuse of this resource");
        } else if(original_resource_uri.isEmpty() || original_resource_uri == null) {
            throw new IllegalArgumentException("original_resource_uri cannot be null , URIs of original clinical document(s) or description of which resource is a formalisation");
        }else if(other_details.isEmpty() || other_details == null) {
            throw new IllegalArgumentException("other_details cannot be null , Additional language-senstive resource metadata, as a list of name/value pairs.");
        }
    }
}
