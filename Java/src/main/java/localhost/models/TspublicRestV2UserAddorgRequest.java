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
 * This is a model class for TspublicRestV2UserAddorgRequest type.
 */
public class TspublicRestV2UserAddorgRequest {
    private Integer orgId;
    private List<UserNameAndIDInput> users;

    /**
     * Default constructor.
     */
    public TspublicRestV2UserAddorgRequest() {
    }

    /**
     * Initialization constructor.
     * @param  users  List of UserNameAndIDInput value for users.
     * @param  orgId  Integer value for orgId.
     */
    public TspublicRestV2UserAddorgRequest(
            List<UserNameAndIDInput> users,
            Integer orgId) {
        this.orgId = orgId;
        this.users = users;
    }

    /**
     * Getter for OrgId.
     * The ID of the organization.
     * @return Returns the Integer
     */
    @JsonGetter("orgId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * Setter for OrgId.
     * The ID of the organization.
     * @param orgId Value for Integer
     */
    @JsonSetter("orgId")
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * Getter for Users.
     * Array of objects. A JSON array of name of users or GUIDs of users or both. When both are
     * given then id is considered
     * @return Returns the List of UserNameAndIDInput
     */
    @JsonGetter("users")
    public List<UserNameAndIDInput> getUsers() {
        return users;
    }

    /**
     * Setter for Users.
     * Array of objects. A JSON array of name of users or GUIDs of users or both. When both are
     * given then id is considered
     * @param users Value for List of UserNameAndIDInput
     */
    @JsonSetter("users")
    public void setUsers(List<UserNameAndIDInput> users) {
        this.users = users;
    }

    /**
     * Converts this TspublicRestV2UserAddorgRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2UserAddorgRequest [" + "users=" + users + ", orgId=" + orgId + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2UserAddorgRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2UserAddorgRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(users)
                .orgId(getOrgId());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2UserAddorgRequest}.
     */
    public static class Builder {
        private List<UserNameAndIDInput> users;
        private Integer orgId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  users  List of UserNameAndIDInput value for users.
         */
        public Builder(List<UserNameAndIDInput> users) {
            this.users = users;
        }

        /**
         * Setter for users.
         * @param  users  List of UserNameAndIDInput value for users.
         * @return Builder
         */
        public Builder users(List<UserNameAndIDInput> users) {
            this.users = users;
            return this;
        }

        /**
         * Setter for orgId.
         * @param  orgId  Integer value for orgId.
         * @return Builder
         */
        public Builder orgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2UserAddorgRequest} object using the set fields.
         * @return {@link TspublicRestV2UserAddorgRequest}
         */
        public TspublicRestV2UserAddorgRequest build() {
            return new TspublicRestV2UserAddorgRequest(users, orgId);
        }
    }
}
