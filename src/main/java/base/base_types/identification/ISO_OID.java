package base.base_types.identification;

import org.ietf.jgss.GSSException;
import org.ietf.jgss.Oid;

public class ISO_OID extends UID {
    protected ISO_OID(String UID_VALUE) throws GSSException {
        super(UID_VALUE);
        new Oid(UID_VALUE);
    }
}
