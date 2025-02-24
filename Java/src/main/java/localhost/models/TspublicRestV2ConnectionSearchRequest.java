/*
 * ThoughtSpotPublicRESTAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for TspublicRestV2ConnectionSearchRequest type.
 */
public class TspublicRestV2ConnectionSearchRequest {
    private Integer offset;
    private Integer batchNumber;
    private Integer batchSize;
    private SortBy1Enum sortBy;
    private SortOrder1Enum sortOrder;
    private Type15Enum type;
    private String namePattern;
    private List<String> fetchId;
    private List<String> skipId;
    private List<TagNameAndIdInput> tag;

    /**
     * Default constructor.
     */
    public TspublicRestV2ConnectionSearchRequest() {
        offset = 0;
        batchNumber = -1;
        batchSize = -1;
        sortBy = SortBy1Enum.DEFAULT;
    }

    /**
     * Initialization constructor.
     * @param  type  Type15Enum value for type.
     * @param  offset  Integer value for offset.
     * @param  batchNumber  Integer value for batchNumber.
     * @param  batchSize  Integer value for batchSize.
     * @param  sortBy  SortBy1Enum value for sortBy.
     * @param  sortOrder  SortOrder1Enum value for sortOrder.
     * @param  namePattern  String value for namePattern.
     * @param  fetchId  List of String value for fetchId.
     * @param  skipId  List of String value for skipId.
     * @param  tag  List of TagNameAndIdInput value for tag.
     */
    public TspublicRestV2ConnectionSearchRequest(
            Type15Enum type,
            Integer offset,
            Integer batchNumber,
            Integer batchSize,
            SortBy1Enum sortBy,
            SortOrder1Enum sortOrder,
            String namePattern,
            List<String> fetchId,
            List<String> skipId,
            List<TagNameAndIdInput> tag) {
        this.offset = offset;
        this.batchNumber = batchNumber;
        this.batchSize = batchSize;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
        this.type = type;
        this.namePattern = namePattern;
        this.fetchId = fetchId;
        this.skipId = skipId;
        this.tag = tag;
    }

    /**
     * Getter for Offset.
     * The offset point, starting from where the records should be included in the response. If no
     * input is provided then offset starts from 0
     * @return Returns the Integer
     */
    @JsonGetter("offset")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOffset() {
        return offset;
    }

    /**
     * Setter for Offset.
     * The offset point, starting from where the records should be included in the response. If no
     * input is provided then offset starts from 0
     * @param offset Value for Integer
     */
    @JsonSetter("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * Getter for BatchNumber.
     * An alternate way to set offset for the starting point of the response. Offset field should be
     * kept blank to use the value from this field. Offset value will be calculated as (batchNumber
     * - 1) * batchSize. It is mandatory to provide a value for batchSize with batchNumber. Example:
     * Assume response has 100 records. Now, batchNumber is set as 2 and batchSize as 10, then
     * offset value will be 10. So, 10 records starting from 11th record will be considered.
     * @return Returns the Integer
     */
    @JsonGetter("batchNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getBatchNumber() {
        return batchNumber;
    }

    /**
     * Setter for BatchNumber.
     * An alternate way to set offset for the starting point of the response. Offset field should be
     * kept blank to use the value from this field. Offset value will be calculated as (batchNumber
     * - 1) * batchSize. It is mandatory to provide a value for batchSize with batchNumber. Example:
     * Assume response has 100 records. Now, batchNumber is set as 2 and batchSize as 10, then
     * offset value will be 10. So, 10 records starting from 11th record will be considered.
     * @param batchNumber Value for Integer
     */
    @JsonSetter("batchNumber")
    public void setBatchNumber(Integer batchNumber) {
        this.batchNumber = batchNumber;
    }

    /**
     * Getter for BatchSize.
     * The number of records that should be included in the response starting from offset position.
     * If no input is provided, then all records starting from the value provided in offset is
     * included in the response.
     * @return Returns the Integer
     */
    @JsonGetter("batchSize")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getBatchSize() {
        return batchSize;
    }

    /**
     * Setter for BatchSize.
     * The number of records that should be included in the response starting from offset position.
     * If no input is provided, then all records starting from the value provided in offset is
     * included in the response.
     * @param batchSize Value for Integer
     */
    @JsonSetter("batchSize")
    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * Getter for SortBy.
     * Field based on which the re.sponse needs to be ordered. Valid values
     * @return Returns the SortBy1Enum
     */
    @JsonGetter("sortBy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SortBy1Enum getSortBy() {
        return sortBy;
    }

    /**
     * Setter for SortBy.
     * Field based on which the re.sponse needs to be ordered. Valid values
     * @param sortBy Value for SortBy1Enum
     */
    @JsonSetter("sortBy")
    public void setSortBy(SortBy1Enum sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * Getter for SortOrder.
     * Order in which sortBy should be applied. Valid values
     * @return Returns the SortOrder1Enum
     */
    @JsonGetter("sortOrder")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SortOrder1Enum getSortOrder() {
        return sortOrder;
    }

    /**
     * Setter for SortOrder.
     * Order in which sortBy should be applied. Valid values
     * @param sortOrder Value for SortOrder1Enum
     */
    @JsonSetter("sortOrder")
    public void setSortOrder(SortOrder1Enum sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * Getter for Type.
     * Type of the connect being searched. Valid values:
     * SNOWFLAKE|AMAZON_REDSHIFT|GOOGLE_BIGQUERY|AZURE_SYNAPSE|TERADATA|STARBURST|SAP_HANA|ORACLE_ADW|DATABRICKS|DENODO
     * @return Returns the Type15Enum
     */
    @JsonGetter("type")
    public Type15Enum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type of the connect being searched. Valid values:
     * SNOWFLAKE|AMAZON_REDSHIFT|GOOGLE_BIGQUERY|AZURE_SYNAPSE|TERADATA|STARBURST|SAP_HANA|ORACLE_ADW|DATABRICKS|DENODO
     * @param type Value for Type15Enum
     */
    @JsonSetter("type")
    public void setType(Type15Enum type) {
        this.type = type;
    }

    /**
     * Getter for NamePattern.
     * A pattern to match the name of the connection. This parameter supports matching
     * case-insensitive strings. For a wildcard match, use %.
     * @return Returns the String
     */
    @JsonGetter("namePattern")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNamePattern() {
        return namePattern;
    }

    /**
     * Setter for NamePattern.
     * A pattern to match the name of the connection. This parameter supports matching
     * case-insensitive strings. For a wildcard match, use %.
     * @param namePattern Value for String
     */
    @JsonSetter("namePattern")
    public void setNamePattern(String namePattern) {
        this.namePattern = namePattern;
    }

    /**
     * Getter for FetchId.
     * A JSON array containing the GUIDs of the connections that you want to fetch.
     * @return Returns the List of String
     */
    @JsonGetter("fetchId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getFetchId() {
        return fetchId;
    }

    /**
     * Setter for FetchId.
     * A JSON array containing the GUIDs of the connections that you want to fetch.
     * @param fetchId Value for List of String
     */
    @JsonSetter("fetchId")
    public void setFetchId(List<String> fetchId) {
        this.fetchId = fetchId;
    }

    /**
     * Getter for SkipId.
     * A JSON array containing the GUIDs of the connections that you want to skip.
     * @return Returns the List of String
     */
    @JsonGetter("skipId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getSkipId() {
        return skipId;
    }

    /**
     * Setter for SkipId.
     * A JSON array containing the GUIDs of the connections that you want to skip.
     * @param skipId Value for List of String
     */
    @JsonSetter("skipId")
    public void setSkipId(List<String> skipId) {
        this.skipId = skipId;
    }

    /**
     * Getter for Tag.
     * A JSON array of name or GUID of tags or both. When both are given then id is considered
     * @return Returns the List of TagNameAndIdInput
     */
    @JsonGetter("tag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<TagNameAndIdInput> getTag() {
        return tag;
    }

    /**
     * Setter for Tag.
     * A JSON array of name or GUID of tags or both. When both are given then id is considered
     * @param tag Value for List of TagNameAndIdInput
     */
    @JsonSetter("tag")
    public void setTag(List<TagNameAndIdInput> tag) {
        this.tag = tag;
    }

    /**
     * Converts this TspublicRestV2ConnectionSearchRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2ConnectionSearchRequest [" + "type=" + type + ", offset=" + offset
                + ", batchNumber=" + batchNumber + ", batchSize=" + batchSize + ", sortBy=" + sortBy
                + ", sortOrder=" + sortOrder + ", namePattern=" + namePattern + ", fetchId="
                + fetchId + ", skipId=" + skipId + ", tag=" + tag + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2ConnectionSearchRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2ConnectionSearchRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type)
                .offset(getOffset())
                .batchNumber(getBatchNumber())
                .batchSize(getBatchSize())
                .sortBy(getSortBy())
                .sortOrder(getSortOrder())
                .namePattern(getNamePattern())
                .fetchId(getFetchId())
                .skipId(getSkipId())
                .tag(getTag());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2ConnectionSearchRequest}.
     */
    public static class Builder {
        private Type15Enum type;
        private Integer offset = 0;
        private Integer batchNumber = -1;
        private Integer batchSize = -1;
        private SortBy1Enum sortBy = SortBy1Enum.DEFAULT;
        private SortOrder1Enum sortOrder;
        private String namePattern;
        private List<String> fetchId;
        private List<String> skipId;
        private List<TagNameAndIdInput> tag;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  Type15Enum value for type.
         */
        public Builder(Type15Enum type) {
            this.type = type;
        }

        /**
         * Setter for type.
         * @param  type  Type15Enum value for type.
         * @return Builder
         */
        public Builder type(Type15Enum type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for offset.
         * @param  offset  Integer value for offset.
         * @return Builder
         */
        public Builder offset(Integer offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Setter for batchNumber.
         * @param  batchNumber  Integer value for batchNumber.
         * @return Builder
         */
        public Builder batchNumber(Integer batchNumber) {
            this.batchNumber = batchNumber;
            return this;
        }

        /**
         * Setter for batchSize.
         * @param  batchSize  Integer value for batchSize.
         * @return Builder
         */
        public Builder batchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        /**
         * Setter for sortBy.
         * @param  sortBy  SortBy1Enum value for sortBy.
         * @return Builder
         */
        public Builder sortBy(SortBy1Enum sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Setter for sortOrder.
         * @param  sortOrder  SortOrder1Enum value for sortOrder.
         * @return Builder
         */
        public Builder sortOrder(SortOrder1Enum sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Setter for namePattern.
         * @param  namePattern  String value for namePattern.
         * @return Builder
         */
        public Builder namePattern(String namePattern) {
            this.namePattern = namePattern;
            return this;
        }

        /**
         * Setter for fetchId.
         * @param  fetchId  List of String value for fetchId.
         * @return Builder
         */
        public Builder fetchId(List<String> fetchId) {
            this.fetchId = fetchId;
            return this;
        }

        /**
         * Setter for skipId.
         * @param  skipId  List of String value for skipId.
         * @return Builder
         */
        public Builder skipId(List<String> skipId) {
            this.skipId = skipId;
            return this;
        }

        /**
         * Setter for tag.
         * @param  tag  List of TagNameAndIdInput value for tag.
         * @return Builder
         */
        public Builder tag(List<TagNameAndIdInput> tag) {
            this.tag = tag;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2ConnectionSearchRequest} object using the set fields.
         * @return {@link TspublicRestV2ConnectionSearchRequest}
         */
        public TspublicRestV2ConnectionSearchRequest build() {
            return new TspublicRestV2ConnectionSearchRequest(type, offset, batchNumber, batchSize,
                    sortBy, sortOrder, namePattern, fetchId, skipId, tag);
        }
    }
}
