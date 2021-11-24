/*
 * TSPublicRestAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ApiRestV2GroupAdduserRequest type.
 */
public class ApiRestV2GroupAdduserRequest {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> userNames;

    /**
     * Default constructor.
     */
    public ApiRestV2GroupAdduserRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  id  String value for id.
     * @param  userNames  List of String value for userNames.
     */
    public ApiRestV2GroupAdduserRequest(
            String name,
            String id,
            List<String> userNames) {
        this.name = name;
        this.id = id;
        this.userNames = userNames;
    }

    /**
     * Getter for Name.
     * Name of the group
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the group
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Id.
     * The GUID of the group
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The GUID of the group
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for UserNames.
     * A JSON array of name of users
     * @return Returns the List of String
     */
    @JsonGetter("userNames")
    public List<String> getUserNames() {
        return userNames;
    }

    /**
     * Setter for UserNames.
     * A JSON array of name of users
     * @param userNames Value for List of String
     */
    @JsonSetter("userNames")
    public void setUserNames(List<String> userNames) {
        this.userNames = userNames;
    }

    /**
     * Converts this ApiRestV2GroupAdduserRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApiRestV2GroupAdduserRequest [" + "name=" + name + ", id=" + id + ", userNames="
                + userNames + "]";
    }

    /**
     * Builds a new {@link ApiRestV2GroupAdduserRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApiRestV2GroupAdduserRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .id(getId())
                .userNames(getUserNames());
        return builder;
    }

    /**
     * Class to build instances of {@link ApiRestV2GroupAdduserRequest}.
     */
    public static class Builder {
        private String name;
        private String id;
        private List<String> userNames;



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
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for userNames.
         * @param  userNames  List of String value for userNames.
         * @return Builder
         */
        public Builder userNames(List<String> userNames) {
            this.userNames = userNames;
            return this;
        }

        /**
         * Builds a new {@link ApiRestV2GroupAdduserRequest} object using the set fields.
         * @return {@link ApiRestV2GroupAdduserRequest}
         */
        public ApiRestV2GroupAdduserRequest build() {
            return new ApiRestV2GroupAdduserRequest(name, id, userNames);
        }
    }
}
