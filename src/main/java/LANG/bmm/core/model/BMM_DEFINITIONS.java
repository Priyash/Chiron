package LANG.bmm.core.model;

public class BMM_DEFINITIONS {
    public static final String Bmm_internal_version = "";
    public static final String Schema_name_delimiter = "::";
    public static final String Package_name_delimiter = ".";
    public static final String Bmm_schema_file_extension = ".bmm";
    public static final Character Generic_left_delimiter = '<';
    public static final Character Generic_right_delimiter = '>';
    public static final Character Generic_constraint_delimiter = ':';

    public BMM_DEFINITIONS() {
        throw new IllegalArgumentException("Constants class cannot be initiated");
    }
}
