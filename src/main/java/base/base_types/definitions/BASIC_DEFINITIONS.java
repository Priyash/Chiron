package base.base_types.definitions;

public class BASIC_DEFINITIONS {
    public static final char CR = '\015';
    public static final char LF = '\012';
    public static final String ANY_TYPE = "Any";
    public static final String REGEX_ANY_PATTERN = ".*";
    public static final String DEFAULT_ENCODING = "UTF-8";

    BASIC_DEFINITIONS(){
        throw new IllegalArgumentException("Constant class cannot be initiated");
    }
}
