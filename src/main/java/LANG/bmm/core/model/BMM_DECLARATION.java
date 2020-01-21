package LANG.bmm.core.model;

import java.util.Map;

/*
Meta-type of BMM declared model elements.
A declaration is a an element of a model specified by an author within a model definition within a context,
which defines the scope of the element. Thus,
a class definition and its property and routine definitions are model elements,
but Types are not, since they are derived from model elements.
 */
public abstract class BMM_DECLARATION extends BMM_DEFINITIONS {
    private String name = "";
    private Map<String, Object> documentation = null;
    private BMM_DECLARATION scope = null;
    private Map<String, Object> meta_data = null;

    protected BMM_DECLARATION(){

    }

    protected BMM_DECLARATION(String name, Map<String, Object> documentation, BMM_DECLARATION scope, Map<String, Object> meta_data) {
        this.name = name;
        this.documentation = documentation;
        this.scope = scope;
        this.meta_data = meta_data;
        this.validate();
    }

    private void validate(){
        if(name.isEmpty()){
            throw new IllegalArgumentException("Name of the element of this model is given");
        } else if(documentation.isEmpty() || documentation == null){
            throw  new IllegalArgumentException("Description/Documentation for this element in this model is not given");
        }
    }

    public String getName() {
        return name;
    }

    public Map<String, Object> getDocumentation() {
        return documentation;
    }

    public BMM_DECLARATION getScope() {
        return scope;
    }

    public Map<String, Object> getMeta_data() {
        return meta_data;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDocumentation(Map<String, Object> documentation) {
        this.documentation = documentation;
    }

    public void setScope(BMM_DECLARATION scope) {
        this.scope = scope;
    }

    public void setMeta_data(Map<String, Object> meta_data) {
        this.meta_data = meta_data;
    }
}
