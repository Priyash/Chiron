package LANG.bmm.core.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BMM_PACKAGE extends  BMM_PACKAGE_CONTAINER {
    private BMM_PACKAGE parent = null;
    private List<BMM_CLASS> classes = null;
    private String package_path = "";

    public BMM_PACKAGE() {
        super();
    }

    public BMM_PACKAGE(String name){
        super.setName(name);
    }

    public void setParent(BMM_PACKAGE parent) {
        this.parent = parent;
    }

    public BMM_PACKAGE getParent() {
        return parent;
    }

    public void setClasses(BMM_CLASS bmm_class){
        if(bmm_class != null){
            classes.add(bmm_class);
        }
    }

    public String getPackage_path() {
        return package_path;
    }

    /**
     * Setting of the path should be always canonical path
     * see the definition of canonical https://stackoverflow.com/questions/12100299/whats-a-canonical-path
     * @return String
     */
    public void setPackage_path(String package_path) {
        this.package_path = package_path;
    }

    public List<BMM_CLASS> getClasses(){
        List<BMM_CLASS> classList = new ArrayList<>();
        classList.addAll(classes);
        return classList;
    }

    public List<BMM_CLASS> root_classes(){
        List<BMM_CLASS> topLevelClasses = this.getClasses();
        this.findTopLevelClasses(this, topLevelClasses);
        return topLevelClasses;
    }

    private void findTopLevelClasses(BMM_PACKAGE bmm_package, List<BMM_CLASS> classList){
        if(bmm_package != null){
            List<BMM_CLASS> topLevelClasses = bmm_package.getClasses();
            if(topLevelClasses == null || topLevelClasses.isEmpty()){
                for(Map.Entry<String, BMM_PACKAGE> packageEntry : bmm_package.getPackages().entrySet()){
                    if(packageEntry != null || packageEntry.getValue() != null){
                        this.findTopLevelClasses(packageEntry.getValue(), classList);
                    }
                }
            }else{
                if(!bmm_package.getClasses().isEmpty() || bmm_package.getClasses() != null) {
                    classList.addAll(bmm_package.getClasses());
                }
            }
        }
    }

    public String path(){
        List<String> pathComponents = new ArrayList<>();
        this.pathComponent(this, pathComponents);
        return this.construct_path(pathComponents);
    }

    private void pathComponent(BMM_PACKAGE bmm_package, List<String> pathComponents){
        if(bmm_package != null){
            pathComponents.add(bmm_package.getPackage_path());
            this.pathComponent(bmm_package.getParent(), pathComponents);
        }
    }

    private String construct_path(List<String> pathComponents){
        StringBuilder builder = new StringBuilder();
        for(String packageString : pathComponents){
            if(!packageString.isEmpty()){
                builder.append(packageString);
            }
        }
        return builder.toString();
    }
}
