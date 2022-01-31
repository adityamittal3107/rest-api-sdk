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
 * This is a model class for ApiRestV2MetadataTagCreateRequest type.
 */
public class ApiRestV2MetadataTagCreateRequest {
    private String name;
    private String color;

    /**
     * Default constructor.
     */
    public ApiRestV2MetadataTagCreateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  color  String value for color.
     */
    public ApiRestV2MetadataTagCreateRequest(
            String name,
            String color) {
        this.name = name;
        this.color = color;
    }

    /**
     * Getter for Name.
     * Name of the tag
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the tag
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Color.
     * Hex color code to be assigned to the tag
     * @return Returns the String
     */
    @JsonGetter("color")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getColor() {
        return color;
    }

    /**
     * Setter for Color.
     * Hex color code to be assigned to the tag
     * @param color Value for String
     */
    @JsonSetter("color")
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Converts this ApiRestV2MetadataTagCreateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApiRestV2MetadataTagCreateRequest [" + "name=" + name + ", color=" + color + "]";
    }

    /**
     * Builds a new {@link ApiRestV2MetadataTagCreateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApiRestV2MetadataTagCreateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name)
                .color(getColor());
        return builder;
    }

    /**
     * Class to build instances of {@link ApiRestV2MetadataTagCreateRequest}.
     */
    public static class Builder {
        private String name;
        private String color;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         */
        public Builder(String name) {
            this.name = name;
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
         * Setter for color.
         * @param  color  String value for color.
         * @return Builder
         */
        public Builder color(String color) {
            this.color = color;
            return this;
        }

        /**
         * Builds a new {@link ApiRestV2MetadataTagCreateRequest} object using the set fields.
         * @return {@link ApiRestV2MetadataTagCreateRequest}
         */
        public ApiRestV2MetadataTagCreateRequest build() {
            return new ApiRestV2MetadataTagCreateRequest(name, color);
        }
    }
}
