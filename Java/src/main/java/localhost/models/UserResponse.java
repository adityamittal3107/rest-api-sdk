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
 * This is a model class for UserResponse type.
 */
public class UserResponse {
    private String name;
    private String displayName;
    private String id;
    private String visibility;
    private String mail;
    private List<GroupNameAndID> groups;
    private List<String> privileges;
    private List<OrgType> orgs;
    private List<String> tags;
    private String state;
    private Boolean notifyOnShare;
    private Boolean showWalkMe;
    private Boolean analystOnboardingComplete;
    private Integer firstLogin;
    private Boolean welcomeEmailSent;
    private Boolean isDeleted;
    private Boolean isHidden;
    private Boolean isExternal;
    private Boolean isDeprecated;
    private Boolean complete;
    private Boolean isSuperUser;
    private Boolean isSystemPrincipal;
    private String type;
    private String parenttype;
    private String tenantId;
    private Double indexVersion;
    private Double generationNum;
    private Double created;
    private Double modified;
    private UserNameAndID author;
    private UserNameAndID modifiedBy;
    private UserNameAndID owner;

    /**
     * Default constructor.
     */
    public UserResponse() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  displayName  String value for displayName.
     * @param  id  String value for id.
     * @param  visibility  String value for visibility.
     * @param  mail  String value for mail.
     * @param  groups  List of GroupNameAndID value for groups.
     * @param  privileges  List of String value for privileges.
     * @param  orgs  List of OrgType value for orgs.
     * @param  tags  List of String value for tags.
     * @param  state  String value for state.
     * @param  notifyOnShare  Boolean value for notifyOnShare.
     * @param  showWalkMe  Boolean value for showWalkMe.
     * @param  analystOnboardingComplete  Boolean value for analystOnboardingComplete.
     * @param  firstLogin  Integer value for firstLogin.
     * @param  welcomeEmailSent  Boolean value for welcomeEmailSent.
     * @param  isDeleted  Boolean value for isDeleted.
     * @param  isHidden  Boolean value for isHidden.
     * @param  isExternal  Boolean value for isExternal.
     * @param  isDeprecated  Boolean value for isDeprecated.
     * @param  complete  Boolean value for complete.
     * @param  isSuperUser  Boolean value for isSuperUser.
     * @param  isSystemPrincipal  Boolean value for isSystemPrincipal.
     * @param  type  String value for type.
     * @param  parenttype  String value for parenttype.
     * @param  tenantId  String value for tenantId.
     * @param  indexVersion  Double value for indexVersion.
     * @param  generationNum  Double value for generationNum.
     * @param  created  Double value for created.
     * @param  modified  Double value for modified.
     * @param  author  UserNameAndID value for author.
     * @param  modifiedBy  UserNameAndID value for modifiedBy.
     * @param  owner  UserNameAndID value for owner.
     */
    public UserResponse(
            String name,
            String displayName,
            String id,
            String visibility,
            String mail,
            List<GroupNameAndID> groups,
            List<String> privileges,
            List<OrgType> orgs,
            List<String> tags,
            String state,
            Boolean notifyOnShare,
            Boolean showWalkMe,
            Boolean analystOnboardingComplete,
            Integer firstLogin,
            Boolean welcomeEmailSent,
            Boolean isDeleted,
            Boolean isHidden,
            Boolean isExternal,
            Boolean isDeprecated,
            Boolean complete,
            Boolean isSuperUser,
            Boolean isSystemPrincipal,
            String type,
            String parenttype,
            String tenantId,
            Double indexVersion,
            Double generationNum,
            Double created,
            Double modified,
            UserNameAndID author,
            UserNameAndID modifiedBy,
            UserNameAndID owner) {
        this.name = name;
        this.displayName = displayName;
        this.id = id;
        this.visibility = visibility;
        this.mail = mail;
        this.groups = groups;
        this.privileges = privileges;
        this.orgs = orgs;
        this.tags = tags;
        this.state = state;
        this.notifyOnShare = notifyOnShare;
        this.showWalkMe = showWalkMe;
        this.analystOnboardingComplete = analystOnboardingComplete;
        this.firstLogin = firstLogin;
        this.welcomeEmailSent = welcomeEmailSent;
        this.isDeleted = isDeleted;
        this.isHidden = isHidden;
        this.isExternal = isExternal;
        this.isDeprecated = isDeprecated;
        this.complete = complete;
        this.isSuperUser = isSuperUser;
        this.isSystemPrincipal = isSystemPrincipal;
        this.type = type;
        this.parenttype = parenttype;
        this.tenantId = tenantId;
        this.indexVersion = indexVersion;
        this.generationNum = generationNum;
        this.created = created;
        this.modified = modified;
        this.author = author;
        this.modifiedBy = modifiedBy;
        this.owner = owner;
    }

    /**
     * Getter for Name.
     * Username of the user account
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Username of the user account
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for DisplayName.
     * Display name of the user account
     * @return Returns the String
     */
    @JsonGetter("displayName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Setter for DisplayName.
     * Display name of the user account
     * @param displayName Value for String
     */
    @JsonSetter("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Getter for Id.
     * GUID of the user account
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * GUID of the user account
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Visibility.
     * Visibility of the user account
     * @return Returns the String
     */
    @JsonGetter("visibility")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVisibility() {
        return visibility;
    }

    /**
     * Setter for Visibility.
     * Visibility of the user account
     * @param visibility Value for String
     */
    @JsonSetter("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * Getter for Mail.
     * Email of the user account
     * @return Returns the String
     */
    @JsonGetter("mail")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMail() {
        return mail;
    }

    /**
     * Setter for Mail.
     * Email of the user account
     * @param mail Value for String
     */
    @JsonSetter("mail")
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * Getter for Groups.
     * Name of the group to which user account is added
     * @return Returns the List of GroupNameAndID
     */
    @JsonGetter("groups")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<GroupNameAndID> getGroups() {
        return groups;
    }

    /**
     * Setter for Groups.
     * Name of the group to which user account is added
     * @param groups Value for List of GroupNameAndID
     */
    @JsonSetter("groups")
    public void setGroups(List<GroupNameAndID> groups) {
        this.groups = groups;
    }

    /**
     * Getter for Privileges.
     * Privileges assigned to user account
     * @return Returns the List of String
     */
    @JsonGetter("privileges")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getPrivileges() {
        return privileges;
    }

    /**
     * Setter for Privileges.
     * Privileges assigned to user account
     * @param privileges Value for List of String
     */
    @JsonSetter("privileges")
    public void setPrivileges(List<String> privileges) {
        this.privileges = privileges;
    }

    /**
     * Getter for Orgs.
     * The organizations that user belongs to
     * @return Returns the List of OrgType
     */
    @JsonGetter("orgs")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OrgType> getOrgs() {
        return orgs;
    }

    /**
     * Setter for Orgs.
     * The organizations that user belongs to
     * @param orgs Value for List of OrgType
     */
    @JsonSetter("orgs")
    public void setOrgs(List<OrgType> orgs) {
        this.orgs = orgs;
    }

    /**
     * Getter for Tags.
     * Tags assigned to the user
     * @return Returns the List of String
     */
    @JsonGetter("tags")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getTags() {
        return tags;
    }

    /**
     * Setter for Tags.
     * Tags assigned to the user
     * @param tags Value for List of String
     */
    @JsonSetter("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * Getter for State.
     * Indicates if the user account is active or inactive
     * @return Returns the String
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for NotifyOnShare.
     * Indicates if the email should be sent when object is shared with the user
     * @return Returns the Boolean
     */
    @JsonGetter("notifyOnShare")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getNotifyOnShare() {
        return notifyOnShare;
    }

    /**
     * Setter for NotifyOnShare.
     * Indicates if the email should be sent when object is shared with the user
     * @param notifyOnShare Value for Boolean
     */
    @JsonSetter("notifyOnShare")
    public void setNotifyOnShare(Boolean notifyOnShare) {
        this.notifyOnShare = notifyOnShare;
    }

    /**
     * Getter for ShowWalkMe.
     * Indicates if the walk me should be shown when logging in
     * @return Returns the Boolean
     */
    @JsonGetter("showWalkMe")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getShowWalkMe() {
        return showWalkMe;
    }

    /**
     * Setter for ShowWalkMe.
     * Indicates if the walk me should be shown when logging in
     * @param showWalkMe Value for Boolean
     */
    @JsonSetter("showWalkMe")
    public void setShowWalkMe(Boolean showWalkMe) {
        this.showWalkMe = showWalkMe;
    }

    /**
     * Getter for AnalystOnboardingComplete.
     * Indicates if the onboarding is completed for the user
     * @return Returns the Boolean
     */
    @JsonGetter("analystOnboardingComplete")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAnalystOnboardingComplete() {
        return analystOnboardingComplete;
    }

    /**
     * Setter for AnalystOnboardingComplete.
     * Indicates if the onboarding is completed for the user
     * @param analystOnboardingComplete Value for Boolean
     */
    @JsonSetter("analystOnboardingComplete")
    public void setAnalystOnboardingComplete(Boolean analystOnboardingComplete) {
        this.analystOnboardingComplete = analystOnboardingComplete;
    }

    /**
     * Getter for FirstLogin.
     * Indicates if the use is logging in for the first time
     * @return Returns the Integer
     */
    @JsonGetter("firstLogin")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getFirstLogin() {
        return firstLogin;
    }

    /**
     * Setter for FirstLogin.
     * Indicates if the use is logging in for the first time
     * @param firstLogin Value for Integer
     */
    @JsonSetter("firstLogin")
    public void setFirstLogin(Integer firstLogin) {
        this.firstLogin = firstLogin;
    }

    /**
     * Getter for WelcomeEmailSent.
     * Indicates if the welcome email is sent to email associated with the user account
     * @return Returns the Boolean
     */
    @JsonGetter("welcomeEmailSent")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getWelcomeEmailSent() {
        return welcomeEmailSent;
    }

    /**
     * Setter for WelcomeEmailSent.
     * Indicates if the welcome email is sent to email associated with the user account
     * @param welcomeEmailSent Value for Boolean
     */
    @JsonSetter("welcomeEmailSent")
    public void setWelcomeEmailSent(Boolean welcomeEmailSent) {
        this.welcomeEmailSent = welcomeEmailSent;
    }

    /**
     * Getter for IsDeleted.
     * Indicates if the user account is deleted
     * @return Returns the Boolean
     */
    @JsonGetter("isDeleted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * Setter for IsDeleted.
     * Indicates if the user account is deleted
     * @param isDeleted Value for Boolean
     */
    @JsonSetter("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * Getter for IsHidden.
     * Indicates if the user account is hidden
     * @return Returns the Boolean
     */
    @JsonGetter("isHidden")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsHidden() {
        return isHidden;
    }

    /**
     * Setter for IsHidden.
     * Indicates if the user account is hidden
     * @param isHidden Value for Boolean
     */
    @JsonSetter("isHidden")
    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    /**
     * Getter for IsExternal.
     * Indicates if the user account is from external system isDeprecated
     * @return Returns the Boolean
     */
    @JsonGetter("isExternal")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsExternal() {
        return isExternal;
    }

    /**
     * Setter for IsExternal.
     * Indicates if the user account is from external system isDeprecated
     * @param isExternal Value for Boolean
     */
    @JsonSetter("isExternal")
    public void setIsExternal(Boolean isExternal) {
        this.isExternal = isExternal;
    }

    /**
     * Getter for IsDeprecated.
     * @return Returns the Boolean
     */
    @JsonGetter("isDeprecated")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsDeprecated() {
        return isDeprecated;
    }

    /**
     * Setter for IsDeprecated.
     * @param isDeprecated Value for Boolean
     */
    @JsonSetter("isDeprecated")
    public void setIsDeprecated(Boolean isDeprecated) {
        this.isDeprecated = isDeprecated;
    }

    /**
     * Getter for Complete.
     * Indicates if the all the properties of user account is provided
     * @return Returns the Boolean
     */
    @JsonGetter("complete")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getComplete() {
        return complete;
    }

    /**
     * Setter for Complete.
     * Indicates if the all the properties of user account is provided
     * @param complete Value for Boolean
     */
    @JsonSetter("complete")
    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    /**
     * Getter for IsSuperUser.
     * Indicates if the user account is super user
     * @return Returns the Boolean
     */
    @JsonGetter("isSuperUser")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsSuperUser() {
        return isSuperUser;
    }

    /**
     * Setter for IsSuperUser.
     * Indicates if the user account is super user
     * @param isSuperUser Value for Boolean
     */
    @JsonSetter("isSuperUser")
    public void setIsSuperUser(Boolean isSuperUser) {
        this.isSuperUser = isSuperUser;
    }

    /**
     * Getter for IsSystemPrincipal.
     * Indicates if the user account is system principal
     * @return Returns the Boolean
     */
    @JsonGetter("isSystemPrincipal")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsSystemPrincipal() {
        return isSystemPrincipal;
    }

    /**
     * Setter for IsSystemPrincipal.
     * Indicates if the user account is system principal
     * @param isSystemPrincipal Value for Boolean
     */
    @JsonSetter("isSystemPrincipal")
    public void setIsSystemPrincipal(Boolean isSystemPrincipal) {
        this.isSystemPrincipal = isSystemPrincipal;
    }

    /**
     * Getter for Type.
     * Indicates the type of user account
     * @return Returns the String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Indicates the type of user account
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for Parenttype.
     * Indicates the type of parent object
     * @return Returns the String
     */
    @JsonGetter("parenttype")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getParenttype() {
        return parenttype;
    }

    /**
     * Setter for Parenttype.
     * Indicates the type of parent object
     * @param parenttype Value for String
     */
    @JsonSetter("parenttype")
    public void setParenttype(String parenttype) {
        this.parenttype = parenttype;
    }

    /**
     * Getter for TenantId.
     * Tenant id associated with the user account
     * @return Returns the String
     */
    @JsonGetter("tenantId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTenantId() {
        return tenantId;
    }

    /**
     * Setter for TenantId.
     * Tenant id associated with the user account
     * @param tenantId Value for String
     */
    @JsonSetter("tenantId")
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * Getter for IndexVersion.
     * @return Returns the Double
     */
    @JsonGetter("indexVersion")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getIndexVersion() {
        return indexVersion;
    }

    /**
     * Setter for IndexVersion.
     * @param indexVersion Value for Double
     */
    @JsonSetter("indexVersion")
    public void setIndexVersion(Double indexVersion) {
        this.indexVersion = indexVersion;
    }

    /**
     * Getter for GenerationNum.
     * @return Returns the Double
     */
    @JsonGetter("generationNum")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getGenerationNum() {
        return generationNum;
    }

    /**
     * Setter for GenerationNum.
     * @param generationNum Value for Double
     */
    @JsonSetter("generationNum")
    public void setGenerationNum(Double generationNum) {
        this.generationNum = generationNum;
    }

    /**
     * Getter for Created.
     * Date and time when user account was created
     * @return Returns the Double
     */
    @JsonGetter("created")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getCreated() {
        return created;
    }

    /**
     * Setter for Created.
     * Date and time when user account was created
     * @param created Value for Double
     */
    @JsonSetter("created")
    public void setCreated(Double created) {
        this.created = created;
    }

    /**
     * Getter for Modified.
     * Date and time of last modification of user account
     * @return Returns the Double
     */
    @JsonGetter("modified")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getModified() {
        return modified;
    }

    /**
     * Setter for Modified.
     * Date and time of last modification of user account
     * @param modified Value for Double
     */
    @JsonSetter("modified")
    public void setModified(Double modified) {
        this.modified = modified;
    }

    /**
     * Getter for Author.
     * @return Returns the UserNameAndID
     */
    @JsonGetter("author")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UserNameAndID getAuthor() {
        return author;
    }

    /**
     * Setter for Author.
     * @param author Value for UserNameAndID
     */
    @JsonSetter("author")
    public void setAuthor(UserNameAndID author) {
        this.author = author;
    }

    /**
     * Getter for ModifiedBy.
     * @return Returns the UserNameAndID
     */
    @JsonGetter("modifiedBy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UserNameAndID getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Setter for ModifiedBy.
     * @param modifiedBy Value for UserNameAndID
     */
    @JsonSetter("modifiedBy")
    public void setModifiedBy(UserNameAndID modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * Getter for Owner.
     * @return Returns the UserNameAndID
     */
    @JsonGetter("owner")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UserNameAndID getOwner() {
        return owner;
    }

    /**
     * Setter for Owner.
     * @param owner Value for UserNameAndID
     */
    @JsonSetter("owner")
    public void setOwner(UserNameAndID owner) {
        this.owner = owner;
    }

    /**
     * Converts this UserResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UserResponse [" + "name=" + name + ", displayName=" + displayName + ", id=" + id
                + ", visibility=" + visibility + ", mail=" + mail + ", groups=" + groups
                + ", privileges=" + privileges + ", orgs=" + orgs + ", tags=" + tags + ", state="
                + state + ", notifyOnShare=" + notifyOnShare + ", showWalkMe=" + showWalkMe
                + ", analystOnboardingComplete=" + analystOnboardingComplete + ", firstLogin="
                + firstLogin + ", welcomeEmailSent=" + welcomeEmailSent + ", isDeleted=" + isDeleted
                + ", isHidden=" + isHidden + ", isExternal=" + isExternal + ", isDeprecated="
                + isDeprecated + ", complete=" + complete + ", isSuperUser=" + isSuperUser
                + ", isSystemPrincipal=" + isSystemPrincipal + ", type=" + type + ", parenttype="
                + parenttype + ", tenantId=" + tenantId + ", indexVersion=" + indexVersion
                + ", generationNum=" + generationNum + ", created=" + created + ", modified="
                + modified + ", author=" + author + ", modifiedBy=" + modifiedBy + ", owner="
                + owner + "]";
    }

    /**
     * Builds a new {@link UserResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UserResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .displayName(getDisplayName())
                .id(getId())
                .visibility(getVisibility())
                .mail(getMail())
                .groups(getGroups())
                .privileges(getPrivileges())
                .orgs(getOrgs())
                .tags(getTags())
                .state(getState())
                .notifyOnShare(getNotifyOnShare())
                .showWalkMe(getShowWalkMe())
                .analystOnboardingComplete(getAnalystOnboardingComplete())
                .firstLogin(getFirstLogin())
                .welcomeEmailSent(getWelcomeEmailSent())
                .isDeleted(getIsDeleted())
                .isHidden(getIsHidden())
                .isExternal(getIsExternal())
                .isDeprecated(getIsDeprecated())
                .complete(getComplete())
                .isSuperUser(getIsSuperUser())
                .isSystemPrincipal(getIsSystemPrincipal())
                .type(getType())
                .parenttype(getParenttype())
                .tenantId(getTenantId())
                .indexVersion(getIndexVersion())
                .generationNum(getGenerationNum())
                .created(getCreated())
                .modified(getModified())
                .author(getAuthor())
                .modifiedBy(getModifiedBy())
                .owner(getOwner());
        return builder;
    }

    /**
     * Class to build instances of {@link UserResponse}.
     */
    public static class Builder {
        private String name;
        private String displayName;
        private String id;
        private String visibility;
        private String mail;
        private List<GroupNameAndID> groups;
        private List<String> privileges;
        private List<OrgType> orgs;
        private List<String> tags;
        private String state;
        private Boolean notifyOnShare;
        private Boolean showWalkMe;
        private Boolean analystOnboardingComplete;
        private Integer firstLogin;
        private Boolean welcomeEmailSent;
        private Boolean isDeleted;
        private Boolean isHidden;
        private Boolean isExternal;
        private Boolean isDeprecated;
        private Boolean complete;
        private Boolean isSuperUser;
        private Boolean isSystemPrincipal;
        private String type;
        private String parenttype;
        private String tenantId;
        private Double indexVersion;
        private Double generationNum;
        private Double created;
        private Double modified;
        private UserNameAndID author;
        private UserNameAndID modifiedBy;
        private UserNameAndID owner;



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
         * Setter for displayName.
         * @param  displayName  String value for displayName.
         * @return Builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
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
         * Setter for visibility.
         * @param  visibility  String value for visibility.
         * @return Builder
         */
        public Builder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        /**
         * Setter for mail.
         * @param  mail  String value for mail.
         * @return Builder
         */
        public Builder mail(String mail) {
            this.mail = mail;
            return this;
        }

        /**
         * Setter for groups.
         * @param  groups  List of GroupNameAndID value for groups.
         * @return Builder
         */
        public Builder groups(List<GroupNameAndID> groups) {
            this.groups = groups;
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
         * Setter for orgs.
         * @param  orgs  List of OrgType value for orgs.
         * @return Builder
         */
        public Builder orgs(List<OrgType> orgs) {
            this.orgs = orgs;
            return this;
        }

        /**
         * Setter for tags.
         * @param  tags  List of String value for tags.
         * @return Builder
         */
        public Builder tags(List<String> tags) {
            this.tags = tags;
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
         * Setter for notifyOnShare.
         * @param  notifyOnShare  Boolean value for notifyOnShare.
         * @return Builder
         */
        public Builder notifyOnShare(Boolean notifyOnShare) {
            this.notifyOnShare = notifyOnShare;
            return this;
        }

        /**
         * Setter for showWalkMe.
         * @param  showWalkMe  Boolean value for showWalkMe.
         * @return Builder
         */
        public Builder showWalkMe(Boolean showWalkMe) {
            this.showWalkMe = showWalkMe;
            return this;
        }

        /**
         * Setter for analystOnboardingComplete.
         * @param  analystOnboardingComplete  Boolean value for analystOnboardingComplete.
         * @return Builder
         */
        public Builder analystOnboardingComplete(Boolean analystOnboardingComplete) {
            this.analystOnboardingComplete = analystOnboardingComplete;
            return this;
        }

        /**
         * Setter for firstLogin.
         * @param  firstLogin  Integer value for firstLogin.
         * @return Builder
         */
        public Builder firstLogin(Integer firstLogin) {
            this.firstLogin = firstLogin;
            return this;
        }

        /**
         * Setter for welcomeEmailSent.
         * @param  welcomeEmailSent  Boolean value for welcomeEmailSent.
         * @return Builder
         */
        public Builder welcomeEmailSent(Boolean welcomeEmailSent) {
            this.welcomeEmailSent = welcomeEmailSent;
            return this;
        }

        /**
         * Setter for isDeleted.
         * @param  isDeleted  Boolean value for isDeleted.
         * @return Builder
         */
        public Builder isDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        /**
         * Setter for isHidden.
         * @param  isHidden  Boolean value for isHidden.
         * @return Builder
         */
        public Builder isHidden(Boolean isHidden) {
            this.isHidden = isHidden;
            return this;
        }

        /**
         * Setter for isExternal.
         * @param  isExternal  Boolean value for isExternal.
         * @return Builder
         */
        public Builder isExternal(Boolean isExternal) {
            this.isExternal = isExternal;
            return this;
        }

        /**
         * Setter for isDeprecated.
         * @param  isDeprecated  Boolean value for isDeprecated.
         * @return Builder
         */
        public Builder isDeprecated(Boolean isDeprecated) {
            this.isDeprecated = isDeprecated;
            return this;
        }

        /**
         * Setter for complete.
         * @param  complete  Boolean value for complete.
         * @return Builder
         */
        public Builder complete(Boolean complete) {
            this.complete = complete;
            return this;
        }

        /**
         * Setter for isSuperUser.
         * @param  isSuperUser  Boolean value for isSuperUser.
         * @return Builder
         */
        public Builder isSuperUser(Boolean isSuperUser) {
            this.isSuperUser = isSuperUser;
            return this;
        }

        /**
         * Setter for isSystemPrincipal.
         * @param  isSystemPrincipal  Boolean value for isSystemPrincipal.
         * @return Builder
         */
        public Builder isSystemPrincipal(Boolean isSystemPrincipal) {
            this.isSystemPrincipal = isSystemPrincipal;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for parenttype.
         * @param  parenttype  String value for parenttype.
         * @return Builder
         */
        public Builder parenttype(String parenttype) {
            this.parenttype = parenttype;
            return this;
        }

        /**
         * Setter for tenantId.
         * @param  tenantId  String value for tenantId.
         * @return Builder
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * Setter for indexVersion.
         * @param  indexVersion  Double value for indexVersion.
         * @return Builder
         */
        public Builder indexVersion(Double indexVersion) {
            this.indexVersion = indexVersion;
            return this;
        }

        /**
         * Setter for generationNum.
         * @param  generationNum  Double value for generationNum.
         * @return Builder
         */
        public Builder generationNum(Double generationNum) {
            this.generationNum = generationNum;
            return this;
        }

        /**
         * Setter for created.
         * @param  created  Double value for created.
         * @return Builder
         */
        public Builder created(Double created) {
            this.created = created;
            return this;
        }

        /**
         * Setter for modified.
         * @param  modified  Double value for modified.
         * @return Builder
         */
        public Builder modified(Double modified) {
            this.modified = modified;
            return this;
        }

        /**
         * Setter for author.
         * @param  author  UserNameAndID value for author.
         * @return Builder
         */
        public Builder author(UserNameAndID author) {
            this.author = author;
            return this;
        }

        /**
         * Setter for modifiedBy.
         * @param  modifiedBy  UserNameAndID value for modifiedBy.
         * @return Builder
         */
        public Builder modifiedBy(UserNameAndID modifiedBy) {
            this.modifiedBy = modifiedBy;
            return this;
        }

        /**
         * Setter for owner.
         * @param  owner  UserNameAndID value for owner.
         * @return Builder
         */
        public Builder owner(UserNameAndID owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Builds a new {@link UserResponse} object using the set fields.
         * @return {@link UserResponse}
         */
        public UserResponse build() {
            return new UserResponse(name, displayName, id, visibility, mail, groups, privileges,
                    orgs, tags, state, notifyOnShare, showWalkMe, analystOnboardingComplete,
                    firstLogin, welcomeEmailSent, isDeleted, isHidden, isExternal, isDeprecated,
                    complete, isSuperUser, isSystemPrincipal, type, parenttype, tenantId,
                    indexVersion, generationNum, created, modified, author, modifiedBy, owner);
        }
    }
}
