package BASE.resource;

import BASE.foundation_types.terminology.Terminology_code;

import java.util.List;
import java.util.Map;

public class RESOURCE_DESCRIPTION {
    private Map<String, String> original_author = null;
    private String original_namespace = "";
    private String original_publisher = "";
    //Other contributors to the resource, each listed in "name <email>" form
    private List<String> otherContributors = null;
    private Terminology_code lifecycle_state = null;
    private AUTHORED_RESOURCE parent_resource = null;
    private String custodian_namespace = "";
    private String custodian_organisation = "";
    private String copyright = "";
    //Licence of current artefact, in format "short licence name <URL of licence>",
    // e.g. "Apache 2.0 License <http://www.apache.org/licenses/LICENSE-2.0.html>"
    private String license = "";
    private Map<String, String> ip_acknowledgements = null;
    private Map<String, String> references = null;
    private String resource_package_uri = "";
    /**
     * Details related to conversion process that generated this model from an original,
     * if relevant, as a list of name/value pairs. Typical example with recommended tags:
     * conversion_details = <
     *     ["source_model"] = <"CEM model xyz <http://location.in.clinicalelementmodels.com>">
     *     ["tool"] = <"cem2adl v6.3.0">
     *     ["time"] = <"2014-11-03T09:05:00">
     * >
     */
    private Map<String, String> conversion_details = null;
    private Map<String, String> other_details = null;
    /**
     * Details of all parts of resource description
     * that are natural language-dependent, keyed by language code.
     */
    private Map<String, RESOURCE_DESCRIPTION_ITEM> details = null;

    public RESOURCE_DESCRIPTION(RESOURCE_DESCRIPTION_BUILDER builder){
        this.original_author = builder.original_author;
        this.original_namespace = builder.original_namespace;
        this.original_publisher = builder.original_publisher;
        this.otherContributors = builder.otherContributors;
        this.lifecycle_state = builder.lifecycle_state;
        this.parent_resource = builder.parent_resource;
        this.custodian_namespace = builder.custodian_namespace;
        this.custodian_organisation = builder.custodian_organisation;
        this.copyright = builder.copyright;
        this.license = builder.license;
        this.ip_acknowledgements = builder.ip_acknowledgements;
        this.references = builder.references;
        this.resource_package_uri = builder.resource_package_uri;
        this.conversion_details = builder.conversion_details;
        this.other_details = builder.other_details;
        this.details = builder.details;
    }

    public Map<String, String> getOriginal_author() {
        return original_author;
    }

    public String getOriginal_namespace() {
        return original_namespace;
    }

    public String getOriginal_publisher() {
        return original_publisher;
    }

    public List<String> getOtherContributors() {
        return otherContributors;
    }

    public Terminology_code getLifecycle_state() {
        return lifecycle_state;
    }

    public AUTHORED_RESOURCE getParent_resource() {
        return parent_resource;
    }

    public String getCustodian_namespace() {
        return custodian_namespace;
    }

    public String getCustodian_organisation() {
        return custodian_organisation;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getLicense() {
        return license;
    }

    public Map<String, String> getIp_acknowledgements() {
        return ip_acknowledgements;
    }

    public Map<String, String> getReferences() {
        return references;
    }

    public String getResource_package_uri() {
        return resource_package_uri;
    }

    public Map<String, String> getConversion_details() {
        return conversion_details;
    }

    public Map<String, String> getOther_details() {
        return other_details;
    }

    public Map<String, RESOURCE_DESCRIPTION_ITEM> getDetails() {
        return details;
    }

    public static class RESOURCE_DESCRIPTION_BUILDER{
        private Map<String, String> original_author = null;
        private String original_namespace = "";
        private String original_publisher = "";
        private List<String> otherContributors = null;
        private Terminology_code lifecycle_state = null;
        private AUTHORED_RESOURCE parent_resource = null;
        private String custodian_namespace = "";
        private String custodian_organisation = "";
        private String copyright = "";
        private String license = "";
        private Map<String, String> ip_acknowledgements = null;
        private Map<String, String> references = null;
        private String resource_package_uri = "";

        private Map<String, String> conversion_details = null;
        private Map<String, String> other_details = null;
        private Map<String, RESOURCE_DESCRIPTION_ITEM> details = null;

        public RESOURCE_DESCRIPTION_BUILDER(){

        }

        public RESOURCE_DESCRIPTION_BUILDER Original_author(Map<String, String> original_author) {
            this.original_author = original_author;
            return this;
        }

        public RESOURCE_DESCRIPTION_BUILDER Original_namespace(String original_namespace) {
            this.original_namespace = original_namespace;
            return this;
        }

        public RESOURCE_DESCRIPTION_BUILDER Original_publisher(String original_publisher) {
            this.original_publisher = original_publisher;
            return this;
        }

        public RESOURCE_DESCRIPTION_BUILDER OtherContributors(List<String> otherContributors) {
            this.otherContributors = otherContributors;
            return this;
        }

        public RESOURCE_DESCRIPTION_BUILDER Lifecycle_state(Terminology_code lifecycle_state) {
            this.lifecycle_state = lifecycle_state;
            return this;
        }

        public RESOURCE_DESCRIPTION_BUILDER Parent_resource(AUTHORED_RESOURCE parent_resource) {
            this.parent_resource = parent_resource;
            return this;
        }

        public RESOURCE_DESCRIPTION_BUILDER Custodian_namespace(String custodian_namespace) {
            this.custodian_namespace = custodian_namespace;
            return this;
        }

        public RESOURCE_DESCRIPTION_BUILDER Custodian_organisation(String custodian_organisation) {
            this.custodian_organisation = custodian_organisation;
            return this;
        }

        public RESOURCE_DESCRIPTION_BUILDER Copyright(String copyright) {
            this.copyright = copyright;
            return this;
        }

        public RESOURCE_DESCRIPTION_BUILDER License(String license) {
            this.license = license;
            return this;
        }

        public RESOURCE_DESCRIPTION_BUILDER Ip_acknowledgements(Map<String, String> ip_acknowledgements) {
            this.ip_acknowledgements = ip_acknowledgements;
            return this;
        }

        public RESOURCE_DESCRIPTION_BUILDER References(Map<String, String> references) {
            this.references = references;
            return this;
        }

        public RESOURCE_DESCRIPTION_BUILDER Resource_package_uri(String resource_package_uri) {
            this.resource_package_uri = resource_package_uri;
            return this;
        }

        public RESOURCE_DESCRIPTION_BUILDER Conversion_details(Map<String, String> conversion_details) {
            this.conversion_details = conversion_details;
            return this;
        }

        public RESOURCE_DESCRIPTION_BUILDER Other_details(Map<String, String> other_details) {
            this.other_details = other_details;
            return this;
        }

        public RESOURCE_DESCRIPTION_BUILDER Details(Map<String, RESOURCE_DESCRIPTION_ITEM> details) {
            this.details = details;
            return this;
        }

        public RESOURCE_DESCRIPTION build(){
            RESOURCE_DESCRIPTION resource_description = new RESOURCE_DESCRIPTION(this);
            //USE SOME VALIDATION
            return resource_description;
        }
    }
}
