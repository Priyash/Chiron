package BASE.base_types.identification;

public class OBJECT_VERSION_ID extends UID_BASED_ID {
    private UID object_id;
    private UID creating_system_id;
    private VERSION_TREE_ID version_tree_id;
    private String extension = "";

    public OBJECT_VERSION_ID(UID object_id, UID creating_system_id, VERSION_TREE_ID version_tree_id){
        if(object_id == null || creating_system_id == null || version_tree_id == null){
            throw new IllegalArgumentException("object id/creating_system_id/version_tree_id either on of them is null");
        }
        super.setValue(object_id.getValue() + "::" + creating_system_id.getValue() + "::" + version_tree_id.getValue());
        this.extension = this.creating_system_id.getValue() + "::" + this.version_tree_id.getValue();
        this.object_id = object_id;
        this.creating_system_id = creating_system_id;
        this.version_tree_id = version_tree_id;
    }

    public UID object_id(){
        return this.object_id;
    }

    public UID creating_system_id(){
        return this.creating_system_id;
    }

    public VERSION_TREE_ID version_tree_id(){
        return version_tree_id;
    }

    @Override
    public UID root() {
        return this.object_id;
    }

    @Override
    public String extension() {
        return this.extension;
    }

    @Override
    public Boolean has_extension() {
        return this.extension.isEmpty();
    }
}
