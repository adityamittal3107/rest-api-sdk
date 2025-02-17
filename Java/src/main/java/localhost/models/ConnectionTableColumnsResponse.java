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
 * This is a model class for ConnectionTableColumnsResponse type.
 */
public class ConnectionTableColumnsResponse {
    private String id;
    private List<ConnectionColumnsShema> table;

    /**
     * Default constructor.
     */
    public ConnectionTableColumnsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  table  List of ConnectionColumnsShema value for table.
     */
    public ConnectionTableColumnsResponse(
            String id,
            List<ConnectionColumnsShema> table) {
        this.id = id;
        this.table = table;
    }

    /**
     * Getter for Id.
     * Connection id
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Connection id
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Table.
     * List of table details
     * @return Returns the List of ConnectionColumnsShema
     */
    @JsonGetter("table")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ConnectionColumnsShema> getTable() {
        return table;
    }

    /**
     * Setter for Table.
     * List of table details
     * @param table Value for List of ConnectionColumnsShema
     */
    @JsonSetter("table")
    public void setTable(List<ConnectionColumnsShema> table) {
        this.table = table;
    }

    /**
     * Converts this ConnectionTableColumnsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ConnectionTableColumnsResponse [" + "id=" + id + ", table=" + table + "]";
    }

    /**
     * Builds a new {@link ConnectionTableColumnsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ConnectionTableColumnsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .table(getTable());
        return builder;
    }

    /**
     * Class to build instances of {@link ConnectionTableColumnsResponse}.
     */
    public static class Builder {
        private String id;
        private List<ConnectionColumnsShema> table;



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
         * Setter for table.
         * @param  table  List of ConnectionColumnsShema value for table.
         * @return Builder
         */
        public Builder table(List<ConnectionColumnsShema> table) {
            this.table = table;
            return this;
        }

        /**
         * Builds a new {@link ConnectionTableColumnsResponse} object using the set fields.
         * @return {@link ConnectionTableColumnsResponse}
         */
        public ConnectionTableColumnsResponse build() {
            return new ConnectionTableColumnsResponse(id, table);
        }
    }
}
