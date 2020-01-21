package BASE.base_types.identification;

public class VERSION_TREE_ID {
    private String value = "";
    private String trunk_version = "";
    private String branch_version = "";
    private String branch_number = "";
    private Boolean hasBranchNumber = false;
    private Boolean hasBranchVersion = false;

    public VERSION_TREE_ID(String trunk_version, String branch_version, String branch_number){
        this.trunk_version = trunk_version;
        this.branch_version = branch_version;
        this.branch_number = branch_number;
        this.version_validator(trunk_version, branch_version, branch_number);
    }

    private void version_validator(String trunk_version, String branch_version, String branch_number){
        if(isTrunkVersionValid(trunk_version) && isBranchNumberValid(branch_version) && isBranchVersionValid(branch_number)){
            hasBranchNumber = true;
            hasBranchVersion = true;
        }else{
            throw new IllegalArgumentException("trunk_version/branch_version/branch_number either one of them is not valid");
        }

    }

    private Boolean isTrunkVersionValid(String trunkVersionStr){

        if(!trunkVersionStr.isEmpty() && this.isInteger(trunkVersionStr)){
            Integer trunkVersionInt = Integer.valueOf(trunkVersionStr);
            if(trunkVersionInt <= 0 ){
                return false;
            }
        }
        return true;
    }
    private Boolean isBranchNumberValid(String branchNumberStr){

        if(!branchNumberStr.isEmpty() && this.isInteger(branchNumberStr)){
            Integer branchNumberInt = Integer.valueOf(branchNumberStr);
            if(branchNumberInt < 0 ){
                return false;
            }
        }
        return true;
    }
    private Boolean isBranchVersionValid(String branchVersionStr){

        if(!branchVersionStr.isEmpty() && this.isInteger(branchVersionStr)){
            Integer branchNumberInt = Integer.valueOf(branchVersionStr);
            if(branchNumberInt < 0 ){
                return false;
            }
        }
        return true;
    }

    private Boolean isInteger(String strValue){
        try {
            Integer intValue = Integer.valueOf(strValue);
            return true;
        }catch (NumberFormatException nfe){
            nfe.getMessage();
        }
        return false;
    }

    private Boolean branch_validity(){
        return ((branch_number.isEmpty() && branch_version.isEmpty()) ^ (!branch_number.isEmpty() && !branch_version.isEmpty()));
    }

    public Boolean is_branch(){
        return hasBranchNumber && hasBranchVersion;
    }
    private Boolean is_branch_valid(){
        return (this.is_branch() ^ branch_number.isEmpty());
    }

    private Boolean is_first_valid(){
        return trunk_version.equals("1");
    }

    public String getTrunk_version() {
        return trunk_version;
    }

    public String getBranch_version() {
        return branch_version;
    }

    public String getBranch_number() {
        return branch_number;
    }

    public String getValue(){
        value = String.valueOf(trunk_version) + "." + String.valueOf(branch_number) + "." + String.valueOf(branch_version);
        if(value.isEmpty()){
            throw new IllegalArgumentException("Wrong format of Version Tree ID is given");
        }
        return value;
    }
}
