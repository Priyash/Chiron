package BASE.base_types.identification;

public class INTERNET_ID extends UID {
    private static final String INTERNET_ID_PATTERN = "[a-zA-Z]([a-zA-Z0-9-]*[a-zA-Z0-9])?(\\\\.[a-zA-Z]([a-zA-Z0-9-]*[a-zA-Z0-9])?)*";
    protected INTERNET_ID(String UID_VALUE) {
        super(UID_VALUE);
        if(!INTERNET_ID_PATTERN.matches(UID_VALUE)){
            throw new IllegalArgumentException("Wrong format of Internet ID has been given");
        }
    }
}
