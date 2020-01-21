package BASE.resource;

import BASE.foundation_types.terminology.Terminology_code;

import java.util.Map;

public class TRANSLATION_DETAILS {
    private Terminology_code language = null;
    private Map<String, String> author = null;
    /**
     * Accreditation of translator,
     * usually a national translator’s registration or association membership id
     */
    private String accreditation = "";
    private Map<String, String> other_details = null;
    private String version_last_translated = "";

    public TRANSLATION_DETAILS(Terminology_code language, Map<String, String> author, String accreditation, Map<String, String> other_details, String version_last_translated) {
        this.language = language;
        this.author = author;
        this.accreditation = accreditation;
        this.other_details = other_details;
        this.version_last_translated = version_last_translated;
    }

    public Terminology_code getLanguage() {
        return language;
    }

    public Map<String, String> getAuthor() {
        return author;
    }

    public String getAccreditation() {
        return accreditation;
    }

    public Map<String, String> getOther_details() {
        return other_details;
    }

    public String getVersion_last_translated() {
        return version_last_translated;
    }
}
