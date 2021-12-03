/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ApiRestV2MetadataTmlImportRequest type.
 */
public class ApiRestV2MetadataTmlImportRequest {
    private List<String> objectTML;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ImportPolicyEnum importPolicy;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean forceCreate;

    /**
     * Default constructor.
     */
    public ApiRestV2MetadataTmlImportRequest() {
        importPolicy = ImportPolicyEnum.PARTIAL;
        forceCreate = false;
    }

    /**
     * Initialization constructor.
     * @param  objectTML  List of String value for objectTML.
     * @param  importPolicy  ImportPolicyEnum value for importPolicy.
     * @param  forceCreate  Boolean value for forceCreate.
     */
    public ApiRestV2MetadataTmlImportRequest(
            List<String> objectTML,
            ImportPolicyEnum importPolicy,
            Boolean forceCreate) {
        this.objectTML = objectTML;
        this.importPolicy = importPolicy;
        this.forceCreate = forceCreate;
    }

    /**
     * Getter for ObjectTML.
     * A JSON array of TML objects to upload, in YAML or JSON format. If in YAML format within the
     * JSON array, use escape characters for YAML quotes, and new line characters when there is a
     * new line
     * @return Returns the List of String
     */
    @JsonGetter("objectTML")
    public List<String> getObjectTML() {
        return objectTML;
    }

    /**
     * Setter for ObjectTML.
     * A JSON array of TML objects to upload, in YAML or JSON format. If in YAML format within the
     * JSON array, use escape characters for YAML quotes, and new line characters when there is a
     * new line
     * @param objectTML Value for List of String
     */
    @JsonSetter("objectTML")
    public void setObjectTML(List<String> objectTML) {
        this.objectTML = objectTML;
    }

    /**
     * Getter for ImportPolicy.
     * Policy to follow during import
     * @return Returns the ImportPolicyEnum
     */
    @JsonGetter("importPolicy")
    public ImportPolicyEnum getImportPolicy() {
        return importPolicy;
    }

    /**
     * Setter for ImportPolicy.
     * Policy to follow during import
     * @param importPolicy Value for ImportPolicyEnum
     */
    @JsonSetter("importPolicy")
    public void setImportPolicy(ImportPolicyEnum importPolicy) {
        this.importPolicy = importPolicy;
    }

    /**
     * Getter for ForceCreate.
     * Specifies if you are updating or creating objects. To create new objects, specify true. By
     * default, ThoughtSpot updates existing objects that have the same GUID as the objects you are
     * importing. When set to true, the GUID property in the imported TML is replaced on the server,
     * and the response headers will include the id_guid property with the GUID of the new object.
     * The new object will be assigned a new GUID, even if the imported TML file included a guid
     * value. Thus, there is no need to include the guid in the TML file if you are using
     * forceCreate=true.
     * @return Returns the Boolean
     */
    @JsonGetter("forceCreate")
    public Boolean getForceCreate() {
        return forceCreate;
    }

    /**
     * Setter for ForceCreate.
     * Specifies if you are updating or creating objects. To create new objects, specify true. By
     * default, ThoughtSpot updates existing objects that have the same GUID as the objects you are
     * importing. When set to true, the GUID property in the imported TML is replaced on the server,
     * and the response headers will include the id_guid property with the GUID of the new object.
     * The new object will be assigned a new GUID, even if the imported TML file included a guid
     * value. Thus, there is no need to include the guid in the TML file if you are using
     * forceCreate=true.
     * @param forceCreate Value for Boolean
     */
    @JsonSetter("forceCreate")
    public void setForceCreate(Boolean forceCreate) {
        this.forceCreate = forceCreate;
    }

    /**
     * Converts this ApiRestV2MetadataTmlImportRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApiRestV2MetadataTmlImportRequest [" + "objectTML=" + objectTML + ", importPolicy="
                + importPolicy + ", forceCreate=" + forceCreate + "]";
    }

    /**
     * Builds a new {@link ApiRestV2MetadataTmlImportRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApiRestV2MetadataTmlImportRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(objectTML)
                .importPolicy(getImportPolicy())
                .forceCreate(getForceCreate());
        return builder;
    }

    /**
     * Class to build instances of {@link ApiRestV2MetadataTmlImportRequest}.
     */
    public static class Builder {
        private List<String> objectTML;
        private ImportPolicyEnum importPolicy = ImportPolicyEnum.PARTIAL;
        private Boolean forceCreate = false;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  objectTML  List of String value for objectTML.
         */
        public Builder(List<String> objectTML) {
            this.objectTML = objectTML;
        }

        /**
         * Setter for objectTML.
         * @param  objectTML  List of String value for objectTML.
         * @return Builder
         */
        public Builder objectTML(List<String> objectTML) {
            this.objectTML = objectTML;
            return this;
        }

        /**
         * Setter for importPolicy.
         * @param  importPolicy  ImportPolicyEnum value for importPolicy.
         * @return Builder
         */
        public Builder importPolicy(ImportPolicyEnum importPolicy) {
            this.importPolicy = importPolicy;
            return this;
        }

        /**
         * Setter for forceCreate.
         * @param  forceCreate  Boolean value for forceCreate.
         * @return Builder
         */
        public Builder forceCreate(Boolean forceCreate) {
            this.forceCreate = forceCreate;
            return this;
        }

        /**
         * Builds a new {@link ApiRestV2MetadataTmlImportRequest} object using the set fields.
         * @return {@link ApiRestV2MetadataTmlImportRequest}
         */
        public ApiRestV2MetadataTmlImportRequest build() {
            return new ApiRestV2MetadataTmlImportRequest(objectTML, importPolicy, forceCreate);
        }
    }
}
