/*
 * ThoughtSpotPublicRESTAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for ColumnsInput type.
 */
public class ColumnsInput {
    private String name;
    private String dataType;

    /**
     * Default constructor.
     */
    public ColumnsInput() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  dataType  String value for dataType.
     */
    public ColumnsInput(
            String name,
            String dataType) {
        this.name = name;
        this.dataType = dataType;
    }

    /**
     * Getter for Name.
     * Name of the column
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the column
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for DataType.
     * Datatype of the column
     * @return Returns the String
     */
    @JsonGetter("dataType")
    public String getDataType() {
        return dataType;
    }

    /**
     * Setter for DataType.
     * Datatype of the column
     * @param dataType Value for String
     */
    @JsonSetter("dataType")
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * Converts this ColumnsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ColumnsInput [" + "name=" + name + ", dataType=" + dataType + "]";
    }

    /**
     * Builds a new {@link ColumnsInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ColumnsInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, dataType);
        return builder;
    }

    /**
     * Class to build instances of {@link ColumnsInput}.
     */
    public static class Builder {
        private String name;
        private String dataType;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  dataType  String value for dataType.
         */
        public Builder(String name, String dataType) {
            this.name = name;
            this.dataType = dataType;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for dataType.
         * @param  dataType  String value for dataType.
         * @return Builder
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * Builds a new {@link ColumnsInput} object using the set fields.
         * @return {@link ColumnsInput}
         */
        public ColumnsInput build() {
            return new ColumnsInput(name, dataType);
        }
    }
}
