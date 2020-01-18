package base.base_types.identification;

import java.util.regex.Pattern;

/*
Class describing a reference to another object, which may exist locally or be maintained outside the current namespace,
e.g. in another service. Services are usually external, e.g. available in a LAN (including on the same host) or
the internet via Corba, SOAP, or some other distributed protocol.
However, in small systems they may be part of the same executable as the data containing the Id.
 */
public class OBJECT_REF {
    private String namespace = "";
    private String type = "";
    private OBJECT_ID id = null;
    private enum NAMESPACE_ENUM{
        local,
        unknown
    }

    private static Pattern NAMESPACE_PATTERN = Pattern.compile("[a-zA-Z][a-zA-Z0-9-_:/&+?]*");

    protected OBJECT_REF(String namespace, String type, OBJECT_ID id){
        this.namespace = namespace;
        this.type = type;
        this.id = id;
        this.validate();
    }

    private void validate(){
        if(!NAMESPACE_PATTERN.matcher(namespace).matches() || !this.namespace.equals(NAMESPACE_ENUM.local.toString()) || !this.namespace.equals(NAMESPACE_ENUM.unknown.toString())){
            throw new IllegalArgumentException("Wrong format of namespace");
        }
    }

    public String getNamespace() {
        return namespace;
    }
    public String getType(){
        return this.type;
    }

    public OBJECT_ID getId() {
        return id;
    }
}
