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
 * This is a model class for ApiRestV2UserRemovegroupRequest type.
 */
public class ApiRestV2UserRemovegroupRequest {
    private String name;
    private String id;
    private List<GroupNameAndIDInput> groups;

    /**
     * Default constructor.
     */
    public ApiRestV2UserRemovegroupRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  id  String value for id.
     * @param  groups  List of GroupNameAndIDInput value for groups.
     */
    public ApiRestV2UserRemovegroupRequest(
            String name,
            String id,
            List<GroupNameAndIDInput> groups) {
        this.name = name;
        this.id = id;
        this.groups = groups;
    }

    /**
     * Getter for Name.
     * User name of the user account
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * User name of the user account
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Id.
     * The GUID of the user account
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The GUID of the user account
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Groups.
     * A JSON array of group names or GUIDs or both. When both are given then id is considered
     * @return Returns the List of GroupNameAndIDInput
     */
    @JsonGetter("groups")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<GroupNameAndIDInput> getGroups() {
        return groups;
    }

    /**
     * Setter for Groups.
     * A JSON array of group names or GUIDs or both. When both are given then id is considered
     * @param groups Value for List of GroupNameAndIDInput
     */
    @JsonSetter("groups")
    public void setGroups(List<GroupNameAndIDInput> groups) {
        this.groups = groups;
    }

    /**
     * Converts this ApiRestV2UserRemovegroupRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApiRestV2UserRemovegroupRequest [" + "name=" + name + ", id=" + id + ", groups="
                + groups + "]";
    }

    /**
     * Builds a new {@link ApiRestV2UserRemovegroupRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApiRestV2UserRemovegroupRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .id(getId())
                .groups(getGroups());
        return builder;
    }

    /**
     * Class to build instances of {@link ApiRestV2UserRemovegroupRequest}.
     */
    public static class Builder {
        private String name;
        private String id;
        private List<GroupNameAndIDInput> groups;



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
         * Setter for groups.
         * @param  groups  List of GroupNameAndIDInput value for groups.
         * @return Builder
         */
        public Builder groups(List<GroupNameAndIDInput> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * Builds a new {@link ApiRestV2UserRemovegroupRequest} object using the set fields.
         * @return {@link ApiRestV2UserRemovegroupRequest}
         */
        public ApiRestV2UserRemovegroupRequest build() {
            return new ApiRestV2UserRemovegroupRequest(name, id, groups);
        }
    }
}
