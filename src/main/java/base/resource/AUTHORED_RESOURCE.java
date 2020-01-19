package base.resource;

import base.base_types.identification.UUID;
import base.foundation_types.terminology.Terminology_code;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class AUTHORED_RESOURCE {
    private UUID uid = null;
    private Terminology_code original_language = null;
    private RESOURCE_DESCRIPTION description = null;
    private Boolean is_controlled = false;
    private Map<String, TRANSLATION_DETAILS> translation = null;

    public AUTHORED_RESOURCE(UUID uid, Terminology_code original_language, RESOURCE_DESCRIPTION description, Boolean is_controlled, Map<String, TRANSLATION_DETAILS> translation) {
        this.uid = uid;
        this.original_language = original_language;
        this.description = description;
        this.is_controlled = is_controlled;
        this.translation = translation;
        this.validate();
    }

    private void validate(){
        if(uid == null){
            throw new IllegalArgumentException("UID cannot be null");
        } else if(original_language == null){
            throw new IllegalArgumentException("Terminology code cannot be null");
        } else if(description == null){
            throw new IllegalArgumentException("Please provide description by using RESOURCE_DESCRIPTION object");
        } else if(translation == null){
            throw new IllegalArgumentException("Please provide translation by using TRANSLATION_DETAILS object");
        } else if(!this.Translations_valid()){
            throw new IllegalArgumentException("Translation should not contain terminology details");
        }
    }

    public List<String> languages_available(){
        Set<String> languages = null;
        if(translation != null){
            languages = new HashSet<String>(translation.keySet());
        }else{
            languages = new HashSet<String>();
        }
        languages.add(original_language.getCode_string().toString());
        return (List<String>) languages;
    }

    public Boolean Languages_available_valid(){
        return this.languages_available().contains(original_language);
    }

    public Boolean Translations_valid(){
        return !translation.isEmpty() && !translation.containsKey(original_language.getCode_string());
    }

    public Boolean Description_valid(){
        Boolean is_description_valid = false;
        Map<String, RESOURCE_DESCRIPTION_ITEM> details = description.getDetails();
        for (Map.Entry<String, RESOURCE_DESCRIPTION_ITEM> entry : details.entrySet()) {
            if(!translation.containsKey(entry.getValue().getLanguage().getCode_string())){
                is_description_valid = true;
            }
        }
        return is_description_valid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }

    public void setOriginal_language(Terminology_code original_language) {
        this.original_language = original_language;
    }

    public void setDescription(RESOURCE_DESCRIPTION description) {
        this.description = description;
    }

    public void setIs_controlled(Boolean is_controlled) {
        this.is_controlled = is_controlled;
    }

    public void setTranslation(Map<String, TRANSLATION_DETAILS> translation) {
        this.translation = translation;
    }

    public UUID getUid() {
        return uid;
    }

    public Terminology_code getOriginal_language() {
        return original_language;
    }

    public RESOURCE_DESCRIPTION getDescription() {
        return description;
    }

    public Boolean getIs_controlled() {
        return is_controlled;
    }

    public Map<String, TRANSLATION_DETAILS> getTranslation() {
        return translation;
    }
}
