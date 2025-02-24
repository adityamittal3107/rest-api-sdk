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
 * This is a model class for TspublicRestV2MetadataFavoriteAssignRequest type.
 */
public class TspublicRestV2MetadataFavoriteAssignRequest {
    private String userName;
    private String userId;
    private List<TsObjectInput> tsObject;

    /**
     * Default constructor.
     */
    public TspublicRestV2MetadataFavoriteAssignRequest() {
    }

    /**
     * Initialization constructor.
     * @param  tsObject  List of TsObjectInput value for tsObject.
     * @param  userName  String value for userName.
     * @param  userId  String value for userId.
     */
    public TspublicRestV2MetadataFavoriteAssignRequest(
            List<TsObjectInput> tsObject,
            String userName,
            String userId) {
        this.userName = userName;
        this.userId = userId;
        this.tsObject = tsObject;
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
     * Getter for TsObject.
     * A JSON Array of GUIDs and type of metadata object.
     * @return Returns the List of TsObjectInput
     */
    @JsonGetter("tsObject")
    public List<TsObjectInput> getTsObject() {
        return tsObject;
    }

    /**
     * Setter for TsObject.
     * A JSON Array of GUIDs and type of metadata object.
     * @param tsObject Value for List of TsObjectInput
     */
    @JsonSetter("tsObject")
    public void setTsObject(List<TsObjectInput> tsObject) {
        this.tsObject = tsObject;
    }

    /**
     * Converts this TspublicRestV2MetadataFavoriteAssignRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2MetadataFavoriteAssignRequest [" + "tsObject=" + tsObject
                + ", userName=" + userName + ", userId=" + userId + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2MetadataFavoriteAssignRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2MetadataFavoriteAssignRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(tsObject)
                .userName(getUserName())
                .userId(getUserId());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2MetadataFavoriteAssignRequest}.
     */
    public static class Builder {
        private List<TsObjectInput> tsObject;
        private String userName;
        private String userId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  tsObject  List of TsObjectInput value for tsObject.
         */
        public Builder(List<TsObjectInput> tsObject) {
            this.tsObject = tsObject;
        }

        /**
         * Setter for tsObject.
         * @param  tsObject  List of TsObjectInput value for tsObject.
         * @return Builder
         */
        public Builder tsObject(List<TsObjectInput> tsObject) {
            this.tsObject = tsObject;
            return this;
        }

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
         * Builds a new {@link TspublicRestV2MetadataFavoriteAssignRequest} object using the set
         * fields.
         * @return {@link TspublicRestV2MetadataFavoriteAssignRequest}
         */
        public TspublicRestV2MetadataFavoriteAssignRequest build() {
            return new TspublicRestV2MetadataFavoriteAssignRequest(tsObject, userName, userId);
        }
    }
}
