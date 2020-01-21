package LANG.bmm.core.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public abstract class BMM_PACKAGE_CONTAINER extends BMM_DECLARATION {
    private Map<String, BMM_PACKAGE> packages = null;
    private BMM_PACKAGE_CONTAINER scope = null;
    private String package_name= "";


    protected BMM_PACKAGE_CONTAINER() {
        super();
    }



    public BMM_PACKAGE package_at_path(String a_path){
        throw new UnsupportedOperationException("This method is not implemented");
    }

//    public void do_recursive_packages(Consumer<BMM_PACKAGE> action){
//        packages.forEach((package_name, bmm_package) -> {
//            action.accept(bmm_package);
//            bmm_package.do_recursive_packages(action);
//        });
//    }

    public void do_recursive_packages(BMM_PACKAGE action){
        Map<String, BMM_PACKAGE> packageMap = action.getPackages();
        for(Map.Entry<String, BMM_PACKAGE> packageEntry : packageMap.entrySet()){
            if(packageEntry != null && packageEntry.getValue() != null){
                this.do_recursive_packages(packageEntry.getValue());
            }
        }
    }

    public Boolean has_package_path(String a_path) {
        List<String> pathComponents = Arrays.asList(a_path.split("\\" + Package_name_delimiter));
        Boolean match = false;
        if (pathComponents == null || pathComponents.isEmpty()) {
            throw new IllegalArgumentException("Package path is empty");
        } else {
            match = this.has_package_path_exist(pathComponents, 0, false);
        }
        return match;
    }

    private Boolean has_package_path_exist(List<String> pathComponents, int index, Boolean match) {
        if (pathComponents.size() > 1) {
            if (pathComponents.get(index).equalsIgnoreCase(this.getPackage_name())) {
                this.has_package_path_exist(pathComponents, index + 1, match);
            }
        }else{
            if (pathComponents.get(index).equalsIgnoreCase(this.getPackage_name())) {
                match = true;
            }else{
                match = false;
            }
        }
        return match;
    }

    public String getPackage_name() {
        return package_name;
    }

    public void setPackage_name(String package_name) {
        this.package_name = package_name;
    }


    public Map<String, BMM_PACKAGE> getPackages(){
        return this.packages;
    }

    public BMM_PACKAGE_CONTAINER getBMM_PACKAGE_CONTAINER_SCOPE(){
        return this.scope;
    }


    public void setPackages(Map<String, BMM_PACKAGE> packages) {
        this.packages = packages;
    }

    public void addChildPackage(String package_name, BMM_PACKAGE bmm_package){
        if(bmm_package != null){
            this.packages.put(package_name, bmm_package);
        }
    }

    public void setScope(BMM_PACKAGE_CONTAINER scope) {
        this.scope = scope;
    }


}
