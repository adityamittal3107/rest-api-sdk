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

/**
 * This is a model class for HomeLiveboardResponse type.
 */
public class HomeLiveboardResponse {
    private String userName;
    private String userId;
    private String liveboardName;
    private String liveboardId;

    /**
     * Default constructor.
     */
    public HomeLiveboardResponse() {
    }

    /**
     * Initialization constructor.
     * @param  userName  String value for userName.
     * @param  userId  String value for userId.
     * @param  liveboardName  String value for liveboardName.
     * @param  liveboardId  String value for liveboardId.
     */
    public HomeLiveboardResponse(
            String userName,
            String userId,
            String liveboardName,
            String liveboardId) {
        this.userName = userName;
        this.userId = userId;
        this.liveboardName = liveboardName;
        this.liveboardId = liveboardId;
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
     * Getter for LiveboardName.
     * Name of the liveboard
     * @return Returns the String
     */
    @JsonGetter("liveboardName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLiveboardName() {
        return liveboardName;
    }

    /**
     * Setter for LiveboardName.
     * Name of the liveboard
     * @param liveboardName Value for String
     */
    @JsonSetter("liveboardName")
    public void setLiveboardName(String liveboardName) {
        this.liveboardName = liveboardName;
    }

    /**
     * Getter for LiveboardId.
     * The GUID of the liveboard
     * @return Returns the String
     */
    @JsonGetter("liveboardId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLiveboardId() {
        return liveboardId;
    }

    /**
     * Setter for LiveboardId.
     * The GUID of the liveboard
     * @param liveboardId Value for String
     */
    @JsonSetter("liveboardId")
    public void setLiveboardId(String liveboardId) {
        this.liveboardId = liveboardId;
    }

    /**
     * Converts this HomeLiveboardResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "HomeLiveboardResponse [" + "userName=" + userName + ", userId=" + userId
                + ", liveboardName=" + liveboardName + ", liveboardId=" + liveboardId + "]";
    }

    /**
     * Builds a new {@link HomeLiveboardResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link HomeLiveboardResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .userName(getUserName())
                .userId(getUserId())
                .liveboardName(getLiveboardName())
                .liveboardId(getLiveboardId());
        return builder;
    }

    /**
     * Class to build instances of {@link HomeLiveboardResponse}.
     */
    public static class Builder {
        private String userName;
        private String userId;
        private String liveboardName;
        private String liveboardId;



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
         * Setter for liveboardName.
         * @param  liveboardName  String value for liveboardName.
         * @return Builder
         */
        public Builder liveboardName(String liveboardName) {
            this.liveboardName = liveboardName;
            return this;
        }

        /**
         * Setter for liveboardId.
         * @param  liveboardId  String value for liveboardId.
         * @return Builder
         */
        public Builder liveboardId(String liveboardId) {
            this.liveboardId = liveboardId;
            return this;
        }

        /**
         * Builds a new {@link HomeLiveboardResponse} object using the set fields.
         * @return {@link HomeLiveboardResponse}
         */
        public HomeLiveboardResponse build() {
            return new HomeLiveboardResponse(userName, userId, liveboardName, liveboardId);
        }
    }
}
