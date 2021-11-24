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
 * This is a model class for SessionInfoResponse type.
 */
public class SessionInfoResponse {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String userName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String userDisplayName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String userEmail;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double userCreatedTime;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String userGUID;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean canChangePassword;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean isSystemUser;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer userGroupMask;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> privileges;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer expirationTime;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String authToken;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String locale;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String timezone;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private SessionDateTimeFormat dateFormat;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private SessionDateTimeFormat timeFormat;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private SessionDateTimeFormat dateTimeFormat;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String partialJSessionGUID;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean isFirstLogin;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double firstLoginDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private SessionUserProperties userProperties;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String state;

    /**
     * Default constructor.
     */
    public SessionInfoResponse() {
    }

    /**
     * Initialization constructor.
     * @param  userName  String value for userName.
     * @param  userDisplayName  String value for userDisplayName.
     * @param  userEmail  String value for userEmail.
     * @param  userCreatedTime  Double value for userCreatedTime.
     * @param  userGUID  String value for userGUID.
     * @param  canChangePassword  Boolean value for canChangePassword.
     * @param  isSystemUser  Boolean value for isSystemUser.
     * @param  userGroupMask  Integer value for userGroupMask.
     * @param  privileges  List of String value for privileges.
     * @param  expirationTime  Integer value for expirationTime.
     * @param  authToken  String value for authToken.
     * @param  locale  String value for locale.
     * @param  timezone  String value for timezone.
     * @param  dateFormat  SessionDateTimeFormat value for dateFormat.
     * @param  timeFormat  SessionDateTimeFormat value for timeFormat.
     * @param  dateTimeFormat  SessionDateTimeFormat value for dateTimeFormat.
     * @param  partialJSessionGUID  String value for partialJSessionGUID.
     * @param  isFirstLogin  Boolean value for isFirstLogin.
     * @param  firstLoginDate  Double value for firstLoginDate.
     * @param  userProperties  SessionUserProperties value for userProperties.
     * @param  state  String value for state.
     */
    public SessionInfoResponse(
            String userName,
            String userDisplayName,
            String userEmail,
            Double userCreatedTime,
            String userGUID,
            Boolean canChangePassword,
            Boolean isSystemUser,
            Integer userGroupMask,
            List<String> privileges,
            Integer expirationTime,
            String authToken,
            String locale,
            String timezone,
            SessionDateTimeFormat dateFormat,
            SessionDateTimeFormat timeFormat,
            SessionDateTimeFormat dateTimeFormat,
            String partialJSessionGUID,
            Boolean isFirstLogin,
            Double firstLoginDate,
            SessionUserProperties userProperties,
            String state) {
        this.userName = userName;
        this.userDisplayName = userDisplayName;
        this.userEmail = userEmail;
        this.userCreatedTime = userCreatedTime;
        this.userGUID = userGUID;
        this.canChangePassword = canChangePassword;
        this.isSystemUser = isSystemUser;
        this.userGroupMask = userGroupMask;
        this.privileges = privileges;
        this.expirationTime = expirationTime;
        this.authToken = authToken;
        this.locale = locale;
        this.timezone = timezone;
        this.dateFormat = dateFormat;
        this.timeFormat = timeFormat;
        this.dateTimeFormat = dateTimeFormat;
        this.partialJSessionGUID = partialJSessionGUID;
        this.isFirstLogin = isFirstLogin;
        this.firstLoginDate = firstLoginDate;
        this.userProperties = userProperties;
        this.state = state;
    }

    /**
     * Getter for UserName.
     * Username of the user account for which the session information is returned
     * @return Returns the String
     */
    @JsonGetter("userName")
    public String getUserName() {
        return userName;
    }

    /**
     * Setter for UserName.
     * Username of the user account for which the session information is returned
     * @param userName Value for String
     */
    @JsonSetter("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Getter for UserDisplayName.
     * A unique display name string for the user
     * @return Returns the String
     */
    @JsonGetter("userDisplayName")
    public String getUserDisplayName() {
        return userDisplayName;
    }

    /**
     * Setter for UserDisplayName.
     * A unique display name string for the user
     * @param userDisplayName Value for String
     */
    @JsonSetter("userDisplayName")
    public void setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }

    /**
     * Getter for UserEmail.
     * Email of the user account
     * @return Returns the String
     */
    @JsonGetter("userEmail")
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * Setter for UserEmail.
     * Email of the user account
     * @param userEmail Value for String
     */
    @JsonSetter("userEmail")
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * Getter for UserCreatedTime.
     * Date and time of creation of the user account
     * @return Returns the Double
     */
    @JsonGetter("userCreatedTime")
    public Double getUserCreatedTime() {
        return userCreatedTime;
    }

    /**
     * Setter for UserCreatedTime.
     * Date and time of creation of the user account
     * @param userCreatedTime Value for Double
     */
    @JsonSetter("userCreatedTime")
    public void setUserCreatedTime(Double userCreatedTime) {
        this.userCreatedTime = userCreatedTime;
    }

    /**
     * Getter for UserGUID.
     * GUID of the user account
     * @return Returns the String
     */
    @JsonGetter("userGUID")
    public String getUserGUID() {
        return userGUID;
    }

    /**
     * Setter for UserGUID.
     * GUID of the user account
     * @param userGUID Value for String
     */
    @JsonSetter("userGUID")
    public void setUserGUID(String userGUID) {
        this.userGUID = userGUID;
    }

    /**
     * Getter for CanChangePassword.
     * Indicates if the user account can change the password
     * @return Returns the Boolean
     */
    @JsonGetter("canChangePassword")
    public Boolean getCanChangePassword() {
        return canChangePassword;
    }

    /**
     * Setter for CanChangePassword.
     * Indicates if the user account can change the password
     * @param canChangePassword Value for Boolean
     */
    @JsonSetter("canChangePassword")
    public void setCanChangePassword(Boolean canChangePassword) {
        this.canChangePassword = canChangePassword;
    }

    /**
     * Getter for IsSystemUser.
     * Indicates if the user account is system or external user
     * @return Returns the Boolean
     */
    @JsonGetter("isSystemUser")
    public Boolean getIsSystemUser() {
        return isSystemUser;
    }

    /**
     * Setter for IsSystemUser.
     * Indicates if the user account is system or external user
     * @param isSystemUser Value for Boolean
     */
    @JsonSetter("isSystemUser")
    public void setIsSystemUser(Boolean isSystemUser) {
        this.isSystemUser = isSystemUser;
    }

    /**
     * Getter for UserGroupMask.
     * Group mask of the user account
     * @return Returns the Integer
     */
    @JsonGetter("userGroupMask")
    public Integer getUserGroupMask() {
        return userGroupMask;
    }

    /**
     * Setter for UserGroupMask.
     * Group mask of the user account
     * @param userGroupMask Value for Integer
     */
    @JsonSetter("userGroupMask")
    public void setUserGroupMask(Integer userGroupMask) {
        this.userGroupMask = userGroupMask;
    }

    /**
     * Getter for Privileges.
     * Privileges assigned to the user account
     * @return Returns the List of String
     */
    @JsonGetter("privileges")
    public List<String> getPrivileges() {
        return privileges;
    }

    /**
     * Setter for Privileges.
     * Privileges assigned to the user account
     * @param privileges Value for List of String
     */
    @JsonSetter("privileges")
    public void setPrivileges(List<String> privileges) {
        this.privileges = privileges;
    }

    /**
     * Getter for ExpirationTime.
     * Expiration time of the token for the user account
     * @return Returns the Integer
     */
    @JsonGetter("expirationTime")
    public Integer getExpirationTime() {
        return expirationTime;
    }

    /**
     * Setter for ExpirationTime.
     * Expiration time of the token for the user account
     * @param expirationTime Value for Integer
     */
    @JsonSetter("expirationTime")
    public void setExpirationTime(Integer expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * Getter for AuthToken.
     * Auth token for the user account
     * @return Returns the String
     */
    @JsonGetter("authToken")
    public String getAuthToken() {
        return authToken;
    }

    /**
     * Setter for AuthToken.
     * Auth token for the user account
     * @param authToken Value for String
     */
    @JsonSetter("authToken")
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    /**
     * Getter for Locale.
     * Locale of the token for the user account
     * @return Returns the String
     */
    @JsonGetter("locale")
    public String getLocale() {
        return locale;
    }

    /**
     * Setter for Locale.
     * Locale of the token for the user account
     * @param locale Value for String
     */
    @JsonSetter("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * Getter for Timezone.
     * Timezone assigned to the user account
     * @return Returns the String
     */
    @JsonGetter("timezone")
    public String getTimezone() {
        return timezone;
    }

    /**
     * Setter for Timezone.
     * Timezone assigned to the user account
     * @param timezone Value for String
     */
    @JsonSetter("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * Getter for DateFormat.
     * @return Returns the SessionDateTimeFormat
     */
    @JsonGetter("dateFormat")
    public SessionDateTimeFormat getDateFormat() {
        return dateFormat;
    }

    /**
     * Setter for DateFormat.
     * @param dateFormat Value for SessionDateTimeFormat
     */
    @JsonSetter("dateFormat")
    public void setDateFormat(SessionDateTimeFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    /**
     * Getter for TimeFormat.
     * @return Returns the SessionDateTimeFormat
     */
    @JsonGetter("timeFormat")
    public SessionDateTimeFormat getTimeFormat() {
        return timeFormat;
    }

    /**
     * Setter for TimeFormat.
     * @param timeFormat Value for SessionDateTimeFormat
     */
    @JsonSetter("timeFormat")
    public void setTimeFormat(SessionDateTimeFormat timeFormat) {
        this.timeFormat = timeFormat;
    }

    /**
     * Getter for DateTimeFormat.
     * @return Returns the SessionDateTimeFormat
     */
    @JsonGetter("dateTimeFormat")
    public SessionDateTimeFormat getDateTimeFormat() {
        return dateTimeFormat;
    }

    /**
     * Setter for DateTimeFormat.
     * @param dateTimeFormat Value for SessionDateTimeFormat
     */
    @JsonSetter("dateTimeFormat")
    public void setDateTimeFormat(SessionDateTimeFormat dateTimeFormat) {
        this.dateTimeFormat = dateTimeFormat;
    }

    /**
     * Getter for PartialJSessionGUID.
     * Partial GUID of the user account
     * @return Returns the String
     */
    @JsonGetter("partialJSessionGUID")
    public String getPartialJSessionGUID() {
        return partialJSessionGUID;
    }

    /**
     * Setter for PartialJSessionGUID.
     * Partial GUID of the user account
     * @param partialJSessionGUID Value for String
     */
    @JsonSetter("partialJSessionGUID")
    public void setPartialJSessionGUID(String partialJSessionGUID) {
        this.partialJSessionGUID = partialJSessionGUID;
    }

    /**
     * Getter for IsFirstLogin.
     * Indicates if the user account is logging in for the first time
     * @return Returns the Boolean
     */
    @JsonGetter("isFirstLogin")
    public Boolean getIsFirstLogin() {
        return isFirstLogin;
    }

    /**
     * Setter for IsFirstLogin.
     * Indicates if the user account is logging in for the first time
     * @param isFirstLogin Value for Boolean
     */
    @JsonSetter("isFirstLogin")
    public void setIsFirstLogin(Boolean isFirstLogin) {
        this.isFirstLogin = isFirstLogin;
    }

    /**
     * Getter for FirstLoginDate.
     * Date on which the user account logged in for the first time
     * @return Returns the Double
     */
    @JsonGetter("firstLoginDate")
    public Double getFirstLoginDate() {
        return firstLoginDate;
    }

    /**
     * Setter for FirstLoginDate.
     * Date on which the user account logged in for the first time
     * @param firstLoginDate Value for Double
     */
    @JsonSetter("firstLoginDate")
    public void setFirstLoginDate(Double firstLoginDate) {
        this.firstLoginDate = firstLoginDate;
    }

    /**
     * Getter for UserProperties.
     * @return Returns the SessionUserProperties
     */
    @JsonGetter("userProperties")
    public SessionUserProperties getUserProperties() {
        return userProperties;
    }

    /**
     * Setter for UserProperties.
     * @param userProperties Value for SessionUserProperties
     */
    @JsonSetter("userProperties")
    public void setUserProperties(SessionUserProperties userProperties) {
        this.userProperties = userProperties;
    }

    /**
     * Getter for State.
     * Indicates if the user account is active or inactive
     * @return Returns the String
     */
    @JsonGetter("state")
    public String getState() {
        return state;
    }

    /**
     * Setter for State.
     * Indicates if the user account is active or inactive
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Converts this SessionInfoResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SessionInfoResponse [" + "userName=" + userName + ", userDisplayName="
                + userDisplayName + ", userEmail=" + userEmail + ", userCreatedTime="
                + userCreatedTime + ", userGUID=" + userGUID + ", canChangePassword="
                + canChangePassword + ", isSystemUser=" + isSystemUser + ", userGroupMask="
                + userGroupMask + ", privileges=" + privileges + ", expirationTime="
                + expirationTime + ", authToken=" + authToken + ", locale=" + locale + ", timezone="
                + timezone + ", dateFormat=" + dateFormat + ", timeFormat=" + timeFormat
                + ", dateTimeFormat=" + dateTimeFormat + ", partialJSessionGUID="
                + partialJSessionGUID + ", isFirstLogin=" + isFirstLogin + ", firstLoginDate="
                + firstLoginDate + ", userProperties=" + userProperties + ", state=" + state + "]";
    }

    /**
     * Builds a new {@link SessionInfoResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SessionInfoResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .userName(getUserName())
                .userDisplayName(getUserDisplayName())
                .userEmail(getUserEmail())
                .userCreatedTime(getUserCreatedTime())
                .userGUID(getUserGUID())
                .canChangePassword(getCanChangePassword())
                .isSystemUser(getIsSystemUser())
                .userGroupMask(getUserGroupMask())
                .privileges(getPrivileges())
                .expirationTime(getExpirationTime())
                .authToken(getAuthToken())
                .locale(getLocale())
                .timezone(getTimezone())
                .dateFormat(getDateFormat())
                .timeFormat(getTimeFormat())
                .dateTimeFormat(getDateTimeFormat())
                .partialJSessionGUID(getPartialJSessionGUID())
                .isFirstLogin(getIsFirstLogin())
                .firstLoginDate(getFirstLoginDate())
                .userProperties(getUserProperties())
                .state(getState());
        return builder;
    }

    /**
     * Class to build instances of {@link SessionInfoResponse}.
     */
    public static class Builder {
        private String userName;
        private String userDisplayName;
        private String userEmail;
        private Double userCreatedTime;
        private String userGUID;
        private Boolean canChangePassword;
        private Boolean isSystemUser;
        private Integer userGroupMask;
        private List<String> privileges;
        private Integer expirationTime;
        private String authToken;
        private String locale;
        private String timezone;
        private SessionDateTimeFormat dateFormat;
        private SessionDateTimeFormat timeFormat;
        private SessionDateTimeFormat dateTimeFormat;
        private String partialJSessionGUID;
        private Boolean isFirstLogin;
        private Double firstLoginDate;
        private SessionUserProperties userProperties;
        private String state;



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
         * Setter for userDisplayName.
         * @param  userDisplayName  String value for userDisplayName.
         * @return Builder
         */
        public Builder userDisplayName(String userDisplayName) {
            this.userDisplayName = userDisplayName;
            return this;
        }

        /**
         * Setter for userEmail.
         * @param  userEmail  String value for userEmail.
         * @return Builder
         */
        public Builder userEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        /**
         * Setter for userCreatedTime.
         * @param  userCreatedTime  Double value for userCreatedTime.
         * @return Builder
         */
        public Builder userCreatedTime(Double userCreatedTime) {
            this.userCreatedTime = userCreatedTime;
            return this;
        }

        /**
         * Setter for userGUID.
         * @param  userGUID  String value for userGUID.
         * @return Builder
         */
        public Builder userGUID(String userGUID) {
            this.userGUID = userGUID;
            return this;
        }

        /**
         * Setter for canChangePassword.
         * @param  canChangePassword  Boolean value for canChangePassword.
         * @return Builder
         */
        public Builder canChangePassword(Boolean canChangePassword) {
            this.canChangePassword = canChangePassword;
            return this;
        }

        /**
         * Setter for isSystemUser.
         * @param  isSystemUser  Boolean value for isSystemUser.
         * @return Builder
         */
        public Builder isSystemUser(Boolean isSystemUser) {
            this.isSystemUser = isSystemUser;
            return this;
        }

        /**
         * Setter for userGroupMask.
         * @param  userGroupMask  Integer value for userGroupMask.
         * @return Builder
         */
        public Builder userGroupMask(Integer userGroupMask) {
            this.userGroupMask = userGroupMask;
            return this;
        }

        /**
         * Setter for privileges.
         * @param  privileges  List of String value for privileges.
         * @return Builder
         */
        public Builder privileges(List<String> privileges) {
            this.privileges = privileges;
            return this;
        }

        /**
         * Setter for expirationTime.
         * @param  expirationTime  Integer value for expirationTime.
         * @return Builder
         */
        public Builder expirationTime(Integer expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        /**
         * Setter for authToken.
         * @param  authToken  String value for authToken.
         * @return Builder
         */
        public Builder authToken(String authToken) {
            this.authToken = authToken;
            return this;
        }

        /**
         * Setter for locale.
         * @param  locale  String value for locale.
         * @return Builder
         */
        public Builder locale(String locale) {
            this.locale = locale;
            return this;
        }

        /**
         * Setter for timezone.
         * @param  timezone  String value for timezone.
         * @return Builder
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * Setter for dateFormat.
         * @param  dateFormat  SessionDateTimeFormat value for dateFormat.
         * @return Builder
         */
        public Builder dateFormat(SessionDateTimeFormat dateFormat) {
            this.dateFormat = dateFormat;
            return this;
        }

        /**
         * Setter for timeFormat.
         * @param  timeFormat  SessionDateTimeFormat value for timeFormat.
         * @return Builder
         */
        public Builder timeFormat(SessionDateTimeFormat timeFormat) {
            this.timeFormat = timeFormat;
            return this;
        }

        /**
         * Setter for dateTimeFormat.
         * @param  dateTimeFormat  SessionDateTimeFormat value for dateTimeFormat.
         * @return Builder
         */
        public Builder dateTimeFormat(SessionDateTimeFormat dateTimeFormat) {
            this.dateTimeFormat = dateTimeFormat;
            return this;
        }

        /**
         * Setter for partialJSessionGUID.
         * @param  partialJSessionGUID  String value for partialJSessionGUID.
         * @return Builder
         */
        public Builder partialJSessionGUID(String partialJSessionGUID) {
            this.partialJSessionGUID = partialJSessionGUID;
            return this;
        }

        /**
         * Setter for isFirstLogin.
         * @param  isFirstLogin  Boolean value for isFirstLogin.
         * @return Builder
         */
        public Builder isFirstLogin(Boolean isFirstLogin) {
            this.isFirstLogin = isFirstLogin;
            return this;
        }

        /**
         * Setter for firstLoginDate.
         * @param  firstLoginDate  Double value for firstLoginDate.
         * @return Builder
         */
        public Builder firstLoginDate(Double firstLoginDate) {
            this.firstLoginDate = firstLoginDate;
            return this;
        }

        /**
         * Setter for userProperties.
         * @param  userProperties  SessionUserProperties value for userProperties.
         * @return Builder
         */
        public Builder userProperties(SessionUserProperties userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  String value for state.
         * @return Builder
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Builds a new {@link SessionInfoResponse} object using the set fields.
         * @return {@link SessionInfoResponse}
         */
        public SessionInfoResponse build() {
            return new SessionInfoResponse(userName, userDisplayName, userEmail, userCreatedTime,
                    userGUID, canChangePassword, isSystemUser, userGroupMask, privileges,
                    expirationTime, authToken, locale, timezone, dateFormat, timeFormat,
                    dateTimeFormat, partialJSessionGUID, isFirstLogin, firstLoginDate,
                    userProperties, state);
        }
    }
}
