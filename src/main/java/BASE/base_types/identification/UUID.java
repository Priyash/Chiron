package BASE.base_types.identification;

public class UUID extends UID {
    protected UUID(String UID_VALUE) {
        super(UID_VALUE);
        java.util.UUID.fromString(UID_VALUE);
    }
}
