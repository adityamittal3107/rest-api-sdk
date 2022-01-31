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
 * This is a model class for ApiRestV2MetadataHomeliveboardUnassignRequest type.
 */
public class ApiRestV2MetadataHomeliveboardUnassignRequest {
    private String userName;
    private String userId;

    /**
     * Default constructor.
     */
    public ApiRestV2MetadataHomeliveboardUnassignRequest() {
    }

    /**
     * Initialization constructor.
     * @param  userName  String value for userName.
     * @param  userId  String value for userId.
     */
    public ApiRestV2MetadataHomeliveboardUnassignRequest(
            String userName,
            String userId) {
        this.userName = userName;
        this.userId = userId;
    }

    /**
     * Getter for UserName.
     * Name of the user
     * @return Returns the String
     */
    @JsonGetter("userName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUserName() {
        return userName;
    }

    /**
     * Setter for UserName.
     * Name of the user
     * @param userName Value for String
     */
    @JsonSetter("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Getter for UserId.
     * The GUID of the user
     * @return Returns the String
     */
    @JsonGetter("userId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUserId() {
        return userId;
    }

    /**
     * Setter for UserId.
     * The GUID of the user
     * @param userId Value for String
     */
    @JsonSetter("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Converts this ApiRestV2MetadataHomeliveboardUnassignRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApiRestV2MetadataHomeliveboardUnassignRequest [" + "userName=" + userName
                + ", userId=" + userId + "]";
    }

    /**
     * Builds a new {@link ApiRestV2MetadataHomeliveboardUnassignRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApiRestV2MetadataHomeliveboardUnassignRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .userName(getUserName())
                .userId(getUserId());
        return builder;
    }

    /**
     * Class to build instances of {@link ApiRestV2MetadataHomeliveboardUnassignRequest}.
     */
    public static class Builder {
        private String userName;
        private String userId;



        /**
         * Setter for userName.
         * @param  userName  String value for userName.
         * @return Builder
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * Setter for userId.
         * @param  userId  String value for userId.
         * @return Builder
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Builds a new {@link ApiRestV2MetadataHomeliveboardUnassignRequest} object using the set
         * fields.
         * @return {@link ApiRestV2MetadataHomeliveboardUnassignRequest}
         */
        public ApiRestV2MetadataHomeliveboardUnassignRequest build() {
            return new ApiRestV2MetadataHomeliveboardUnassignRequest(userName, userId);
        }
    }
}
