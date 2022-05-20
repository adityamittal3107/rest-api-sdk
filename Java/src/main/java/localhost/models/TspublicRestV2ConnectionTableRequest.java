/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for TspublicRestV2ConnectionTableRequest type.
 */
public class TspublicRestV2ConnectionTableRequest {
    private String id;
    private String configuration;
    private GetConnectionTablesIncludeColumnEnum includeColumn;

    /**
     * Default constructor.
     */
    public TspublicRestV2ConnectionTableRequest() {
        includeColumn = GetConnectionTablesIncludeColumnEnum.ENUM_TRUE;
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  configuration  String value for configuration.
     * @param  includeColumn  GetConnectionTablesIncludeColumnEnum value for includeColumn.
     */
    public TspublicRestV2ConnectionTableRequest(
            String id,
            String configuration,
            GetConnectionTablesIncludeColumnEnum includeColumn) {
        this.id = id;
        this.configuration = configuration;
        this.includeColumn = includeColumn;
    }

    /**
     * Getter for Id.
     * GUID of the connection
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * GUID of the connection
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Configuration.
     * A JSON object of the connection metadata. If this field is left empty, then the configuration
     * saved in the connection is considered. To get the tables based on a different configuration,
     * include required attributes in the connection configuration JSON. Example: Get tables from
     * Snowflake with a different user account than specified in the connection:
     * {"user":"test_user","password":"test_pwd","role":"test_role"} Get tables from Redshift for
     * different database than specified in the connection: {"database":"test_db"}
     * @return Returns the String
     */
    @JsonGetter("configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getConfiguration() {
        return configuration;
    }

    /**
     * Setter for Configuration.
     * A JSON object of the connection metadata. If this field is left empty, then the configuration
     * saved in the connection is considered. To get the tables based on a different configuration,
     * include required attributes in the connection configuration JSON. Example: Get tables from
     * Snowflake with a different user account than specified in the connection:
     * {"user":"test_user","password":"test_pwd","role":"test_role"} Get tables from Redshift for
     * different database than specified in the connection: {"database":"test_db"}
     * @param configuration Value for String
     */
    @JsonSetter("configuration")
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * Getter for IncludeColumn.
     * When set to true, the response will include column level details as well.
     * @return Returns the GetConnectionTablesIncludeColumnEnum
     */
    @JsonGetter("includeColumn")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GetConnectionTablesIncludeColumnEnum getIncludeColumn() {
        return includeColumn;
    }

    /**
     * Setter for IncludeColumn.
     * When set to true, the response will include column level details as well.
     * @param includeColumn Value for GetConnectionTablesIncludeColumnEnum
     */
    @JsonSetter("includeColumn")
    public void setIncludeColumn(GetConnectionTablesIncludeColumnEnum includeColumn) {
        this.includeColumn = includeColumn;
    }

    /**
     * Converts this TspublicRestV2ConnectionTableRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2ConnectionTableRequest [" + "id=" + id + ", configuration="
                + configuration + ", includeColumn=" + includeColumn + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2ConnectionTableRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2ConnectionTableRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id)
                .configuration(getConfiguration())
                .includeColumn(getIncludeColumn());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2ConnectionTableRequest}.
     */
    public static class Builder {
        private String id;
        private String configuration;
        private GetConnectionTablesIncludeColumnEnum includeColumn =
                GetConnectionTablesIncludeColumnEnum.ENUM_TRUE;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         */
        public Builder(String id) {
            this.id = id;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for configuration.
         * @param  configuration  String value for configuration.
         * @return Builder
         */
        public Builder configuration(String configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * Setter for includeColumn.
         * @param  includeColumn  GetConnectionTablesIncludeColumnEnum value for includeColumn.
         * @return Builder
         */
        public Builder includeColumn(GetConnectionTablesIncludeColumnEnum includeColumn) {
            this.includeColumn = includeColumn;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2ConnectionTableRequest} object using the set fields.
         * @return {@link TspublicRestV2ConnectionTableRequest}
         */
        public TspublicRestV2ConnectionTableRequest build() {
            return new TspublicRestV2ConnectionTableRequest(id, configuration, includeColumn);
        }
    }
}
