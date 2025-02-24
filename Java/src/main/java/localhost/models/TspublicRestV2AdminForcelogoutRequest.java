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
 * This is a model class for TspublicRestV2AdminForcelogoutRequest type.
 */
public class TspublicRestV2AdminForcelogoutRequest {
    private List<NameAndIdInput> user;

    /**
     * Default constructor.
     */
    public TspublicRestV2AdminForcelogoutRequest() {
    }

    /**
     * Initialization constructor.
     * @param  user  List of NameAndIdInput value for user.
     */
    public TspublicRestV2AdminForcelogoutRequest(
            List<NameAndIdInput> user) {
        this.user = user;
    }

    /**
     * Getter for User.
     * A JSON array of name of users or GUIDs of groups or both. When both are given then id is
     * considered.
     * @return Returns the List of NameAndIdInput
     */
    @JsonGetter("user")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<NameAndIdInput> getUser() {
        return user;
    }

    /**
     * Setter for User.
     * A JSON array of name of users or GUIDs of groups or both. When both are given then id is
     * considered.
     * @param user Value for List of NameAndIdInput
     */
    @JsonSetter("user")
    public void setUser(List<NameAndIdInput> user) {
        this.user = user;
    }

    /**
     * Converts this TspublicRestV2AdminForcelogoutRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2AdminForcelogoutRequest [" + "user=" + user + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2AdminForcelogoutRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2AdminForcelogoutRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .user(getUser());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2AdminForcelogoutRequest}.
     */
    public static class Builder {
        private List<NameAndIdInput> user;



        /**
         * Setter for user.
         * @param  user  List of NameAndIdInput value for user.
         * @return Builder
         */
        public Builder user(List<NameAndIdInput> user) {
            this.user = user;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2AdminForcelogoutRequest} object using the set fields.
         * @return {@link TspublicRestV2AdminForcelogoutRequest}
         */
        public TspublicRestV2AdminForcelogoutRequest build() {
            return new TspublicRestV2AdminForcelogoutRequest(user);
        }
    }
}
