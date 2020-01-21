package BASE.base_types.identification;


public class HIER_OBJECT_ID extends UID_BASED_ID {
    private UID root = null;
    private String extension = "";

    public HIER_OBJECT_ID(UID root, String extension) {
        if(root == null){
            throw new IllegalArgumentException("UID root is empty");
        }

        if(extension.isEmpty()){
            super.setValue(root.getValue());
        }else{
            super.setValue(root.getValue() + "::" + extension);
        }

        this.root = root;
        this.extension = extension;
    }

    @Override
    public UID root() {
        return root;
    }

    @Override
    public String extension() {
        return extension;
    }

    @Override
    public Boolean has_extension() {
        return extension.isEmpty();
    }
}
