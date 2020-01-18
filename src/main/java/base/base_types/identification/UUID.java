package base.base_types.identification;

import java.nio.charset.MalformedInputException;

public class UUID extends UID {
    protected UUID(String UID_VALUE) {
        super(UID_VALUE);
        java.util.UUID.fromString(UID_VALUE);
    }
}
