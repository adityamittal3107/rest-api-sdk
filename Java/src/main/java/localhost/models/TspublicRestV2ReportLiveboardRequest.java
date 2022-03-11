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
 * This is a model class for TspublicRestV2ReportLiveboardRequest type.
 */
public class TspublicRestV2ReportLiveboardRequest {
    private String id;
    private List<String> vizId;
    private String transientContent;
    private String runtimeFilter;
    private String runtimeSort;
    private Type16Enum type;
    private PdfOptionsInput pdfOptions;

    /**
     * Default constructor.
     */
    public TspublicRestV2ReportLiveboardRequest() {
        type = Type16Enum.CSV;
    }

    /**
     * Initialization constructor.
     * @param  type  Type16Enum value for type.
     * @param  id  String value for id.
     * @param  vizId  List of String value for vizId.
     * @param  transientContent  String value for transientContent.
     * @param  runtimeFilter  String value for runtimeFilter.
     * @param  runtimeSort  String value for runtimeSort.
     * @param  pdfOptions  PdfOptionsInput value for pdfOptions.
     */
    public TspublicRestV2ReportLiveboardRequest(
            Type16Enum type,
            String id,
            List<String> vizId,
            String transientContent,
            String runtimeFilter,
            String runtimeSort,
            PdfOptionsInput pdfOptions) {
        this.id = id;
        this.vizId = vizId;
        this.transientContent = transientContent;
        this.runtimeFilter = runtimeFilter;
        this.runtimeSort = runtimeSort;
        this.type = type;
        this.pdfOptions = pdfOptions;
    }

    /**
     * Getter for Id.
     * GUID of the Liveboard to download. This field is considered only when no input is provided
     * for transientContent field.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * GUID of the Liveboard to download. This field is considered only when no input is provided
     * for transientContent field.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for VizId.
     * JSON Array of GUIDs of the visualizations in the Liveboard to be included in the downloaded
     * file. For CSV, XLSX and PNG file download, visualization id is mandatory. CSV and XLSX is
     * valid only for visualization of type table and PNG is valid for charts. Only one value will
     * be accepted for these formats. If multiple values are provided then first value in the array
     * will be considered.
     * @return Returns the List of String
     */
    @JsonGetter("vizId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getVizId() {
        return vizId;
    }

    /**
     * Setter for VizId.
     * JSON Array of GUIDs of the visualizations in the Liveboard to be included in the downloaded
     * file. For CSV, XLSX and PNG file download, visualization id is mandatory. CSV and XLSX is
     * valid only for visualization of type table and PNG is valid for charts. Only one value will
     * be accepted for these formats. If multiple values are provided then first value in the array
     * will be considered.
     * @param vizId Value for List of String
     */
    @JsonSetter("vizId")
    public void setVizId(List<String> vizId) {
        this.vizId = vizId;
    }

    /**
     * Getter for TransientContent.
     * If you have embedded ThoughtSpot in your host application, and you want to download
     * Liveboards with unsaved changes as a file, pass the transient content from the browser fetch
     * request, using the getExportRequestForCurrentPinboard method. For more information, see
     * https://developers.thoughtspot.com/docs/?pageid=liveboard-export-api#transient-pinboard.
     * @return Returns the String
     */
    @JsonGetter("transientContent")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTransientContent() {
        return transientContent;
    }

    /**
     * Setter for TransientContent.
     * If you have embedded ThoughtSpot in your host application, and you want to download
     * Liveboards with unsaved changes as a file, pass the transient content from the browser fetch
     * request, using the getExportRequestForCurrentPinboard method. For more information, see
     * https://developers.thoughtspot.com/docs/?pageid=liveboard-export-api#transient-pinboard.
     * @param transientContent Value for String
     */
    @JsonSetter("transientContent")
    public void setTransientContent(String transientContent) {
        this.transientContent = transientContent;
    }

    /**
     * Getter for RuntimeFilter.
     * JSON object which contains filter condition to filter the data at the time of data retrieval.
     * Example:
     * {"col1":"region","op1":"EQ","val1":"northeast","col2":"date","op2":"BET","val2":["1625126400000","1625126400000"]}
     * For more information, see https://developers.thoughtspot.com/docs/?pageid=runtime-filters
     * @return Returns the String
     */
    @JsonGetter("runtimeFilter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRuntimeFilter() {
        return runtimeFilter;
    }

    /**
     * Setter for RuntimeFilter.
     * JSON object which contains filter condition to filter the data at the time of data retrieval.
     * Example:
     * {"col1":"region","op1":"EQ","val1":"northeast","col2":"date","op2":"BET","val2":["1625126400000","1625126400000"]}
     * For more information, see https://developers.thoughtspot.com/docs/?pageid=runtime-filters
     * @param runtimeFilter Value for String
     */
    @JsonSetter("runtimeFilter")
    public void setRuntimeFilter(String runtimeFilter) {
        this.runtimeFilter = runtimeFilter;
    }

    /**
     * Getter for RuntimeSort.
     * JSON object which provides columns to sort the data at the time of data retrieval. Example:
     * {"sortCol1":"region","asc1":true,"sortCol2":"date"} For more information, see
     * https://developers.thoughtspot.com/docs/?pageid=runtime-filters
     * @return Returns the String
     */
    @JsonGetter("runtimeSort")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRuntimeSort() {
        return runtimeSort;
    }

    /**
     * Setter for RuntimeSort.
     * JSON object which provides columns to sort the data at the time of data retrieval. Example:
     * {"sortCol1":"region","asc1":true,"sortCol2":"date"} For more information, see
     * https://developers.thoughtspot.com/docs/?pageid=runtime-filters
     * @param runtimeSort Value for String
     */
    @JsonSetter("runtimeSort")
    public void setRuntimeSort(String runtimeSort) {
        this.runtimeSort = runtimeSort;
    }

    /**
     * Getter for Type.
     * Type of file to be generated.
     * @return Returns the Type16Enum
     */
    @JsonGetter("type")
    public Type16Enum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type of file to be generated.
     * @param type Value for Type16Enum
     */
    @JsonSetter("type")
    public void setType(Type16Enum type) {
        this.type = type;
    }

    /**
     * Getter for PdfOptions.
     * @return Returns the PdfOptionsInput
     */
    @JsonGetter("pdfOptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PdfOptionsInput getPdfOptions() {
        return pdfOptions;
    }

    /**
     * Setter for PdfOptions.
     * @param pdfOptions Value for PdfOptionsInput
     */
    @JsonSetter("pdfOptions")
    public void setPdfOptions(PdfOptionsInput pdfOptions) {
        this.pdfOptions = pdfOptions;
    }

    /**
     * Converts this TspublicRestV2ReportLiveboardRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2ReportLiveboardRequest [" + "type=" + type + ", id=" + id + ", vizId="
                + vizId + ", transientContent=" + transientContent + ", runtimeFilter="
                + runtimeFilter + ", runtimeSort=" + runtimeSort + ", pdfOptions=" + pdfOptions
                + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2ReportLiveboardRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2ReportLiveboardRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type)
                .id(getId())
                .vizId(getVizId())
                .transientContent(getTransientContent())
                .runtimeFilter(getRuntimeFilter())
                .runtimeSort(getRuntimeSort())
                .pdfOptions(getPdfOptions());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2ReportLiveboardRequest}.
     */
    public static class Builder {
        private Type16Enum type = Type16Enum.CSV;
        private String id;
        private List<String> vizId;
        private String transientContent;
        private String runtimeFilter;
        private String runtimeSort;
        private PdfOptionsInput pdfOptions;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  Type16Enum value for type.
         */
        public Builder(Type16Enum type) {
            this.type = type;
        }

        /**
         * Setter for type.
         * @param  type  Type16Enum value for type.
         * @return Builder
         */
        public Builder type(Type16Enum type) {
            this.type = type;
            return this;
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
         * Setter for vizId.
         * @param  vizId  List of String value for vizId.
         * @return Builder
         */
        public Builder vizId(List<String> vizId) {
            this.vizId = vizId;
            return this;
        }

        /**
         * Setter for transientContent.
         * @param  transientContent  String value for transientContent.
         * @return Builder
         */
        public Builder transientContent(String transientContent) {
            this.transientContent = transientContent;
            return this;
        }

        /**
         * Setter for runtimeFilter.
         * @param  runtimeFilter  String value for runtimeFilter.
         * @return Builder
         */
        public Builder runtimeFilter(String runtimeFilter) {
            this.runtimeFilter = runtimeFilter;
            return this;
        }

        /**
         * Setter for runtimeSort.
         * @param  runtimeSort  String value for runtimeSort.
         * @return Builder
         */
        public Builder runtimeSort(String runtimeSort) {
            this.runtimeSort = runtimeSort;
            return this;
        }

        /**
         * Setter for pdfOptions.
         * @param  pdfOptions  PdfOptionsInput value for pdfOptions.
         * @return Builder
         */
        public Builder pdfOptions(PdfOptionsInput pdfOptions) {
            this.pdfOptions = pdfOptions;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2ReportLiveboardRequest} object using the set fields.
         * @return {@link TspublicRestV2ReportLiveboardRequest}
         */
        public TspublicRestV2ReportLiveboardRequest build() {
            return new TspublicRestV2ReportLiveboardRequest(type, id, vizId, transientContent,
                    runtimeFilter, runtimeSort, pdfOptions);
        }
    }
}
