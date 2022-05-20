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
 * This is a model class for MetadataTagResponse type.
 */
public class MetadataTagResponse {
    private String name;
    private String id;
    private ClientState clientState;
    private Double indexVersion;
    private Double generationNum;
    private Boolean isDeleted;
    private Boolean isHidden;
    private Boolean isExternal;
    private Boolean isDeprecated;
    private Double created;
    private Double modified;
    private TagNameAndID modifiedBy;
    private TagNameAndID author;
    private TagNameAndID owner;

    /**
     * Default constructor.
     */
    public MetadataTagResponse() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  id  String value for id.
     * @param  clientState  ClientState value for clientState.
     * @param  indexVersion  Double value for indexVersion.
     * @param  generationNum  Double value for generationNum.
     * @param  isDeleted  Boolean value for isDeleted.
     * @param  isHidden  Boolean value for isHidden.
     * @param  isExternal  Boolean value for isExternal.
     * @param  isDeprecated  Boolean value for isDeprecated.
     * @param  created  Double value for created.
     * @param  modified  Double value for modified.
     * @param  modifiedBy  TagNameAndID value for modifiedBy.
     * @param  author  TagNameAndID value for author.
     * @param  owner  TagNameAndID value for owner.
     */
    public MetadataTagResponse(
            String name,
            String id,
            ClientState clientState,
            Double indexVersion,
            Double generationNum,
            Boolean isDeleted,
            Boolean isHidden,
            Boolean isExternal,
            Boolean isDeprecated,
            Double created,
            Double modified,
            TagNameAndID modifiedBy,
            TagNameAndID author,
            TagNameAndID owner) {
        this.name = name;
        this.id = id;
        this.clientState = clientState;
        this.indexVersion = indexVersion;
        this.generationNum = generationNum;
        this.isDeleted = isDeleted;
        this.isHidden = isHidden;
        this.isExternal = isExternal;
        this.isDeprecated = isDeprecated;
        this.created = created;
        this.modified = modified;
        this.modifiedBy = modifiedBy;
        this.author = author;
        this.owner = owner;
    }

    /**
     * Getter for Name.
     * Name of the tag
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for Id.
     * GUID of the tag
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * GUID of the tag
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for ClientState.
     * @return Returns the ClientState
     */
    @JsonGetter("clientState")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ClientState getClientState() {
        return clientState;
    }

    /**
     * Setter for ClientState.
     * @param clientState Value for ClientState
     */
    @JsonSetter("clientState")
    public void setClientState(ClientState clientState) {
        this.clientState = clientState;
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
     * Getter for IsDeleted.
     * Indicates if the tag is deleted
     * @return Returns the Boolean
     */
    @JsonGetter("isDeleted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * Setter for IsDeleted.
     * Indicates if the tag is deleted
     * @param isDeleted Value for Boolean
     */
    @JsonSetter("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * Getter for IsHidden.
     * Indicates if the tag is hidden
     * @return Returns the Boolean
     */
    @JsonGetter("isHidden")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsHidden() {
        return isHidden;
    }

    /**
     * Setter for IsHidden.
     * Indicates if the tag is hidden
     * @param isHidden Value for Boolean
     */
    @JsonSetter("isHidden")
    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    /**
     * Getter for IsExternal.
     * Indicates if the tag is from external system
     * @return Returns the Boolean
     */
    @JsonGetter("isExternal")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsExternal() {
        return isExternal;
    }

    /**
     * Setter for IsExternal.
     * Indicates if the tag is from external system
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
     * Getter for Created.
     * Date and time when group was created
     * @return Returns the Double
     */
    @JsonGetter("created")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getCreated() {
        return created;
    }

    /**
     * Setter for Created.
     * Date and time when group was created
     * @param created Value for Double
     */
    @JsonSetter("created")
    public void setCreated(Double created) {
        this.created = created;
    }

    /**
     * Getter for Modified.
     * Date and time of last modification of the group
     * @return Returns the Double
     */
    @JsonGetter("modified")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getModified() {
        return modified;
    }

    /**
     * Setter for Modified.
     * Date and time of last modification of the group
     * @param modified Value for Double
     */
    @JsonSetter("modified")
    public void setModified(Double modified) {
        this.modified = modified;
    }

    /**
     * Getter for ModifiedBy.
     * @return Returns the TagNameAndID
     */
    @JsonGetter("modifiedBy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TagNameAndID getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Setter for ModifiedBy.
     * @param modifiedBy Value for TagNameAndID
     */
    @JsonSetter("modifiedBy")
    public void setModifiedBy(TagNameAndID modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * Getter for Author.
     * @return Returns the TagNameAndID
     */
    @JsonGetter("author")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TagNameAndID getAuthor() {
        return author;
    }

    /**
     * Setter for Author.
     * @param author Value for TagNameAndID
     */
    @JsonSetter("author")
    public void setAuthor(TagNameAndID author) {
        this.author = author;
    }

    /**
     * Getter for Owner.
     * @return Returns the TagNameAndID
     */
    @JsonGetter("owner")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TagNameAndID getOwner() {
        return owner;
    }

    /**
     * Setter for Owner.
     * @param owner Value for TagNameAndID
     */
    @JsonSetter("owner")
    public void setOwner(TagNameAndID owner) {
        this.owner = owner;
    }

    /**
     * Converts this MetadataTagResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MetadataTagResponse [" + "name=" + name + ", id=" + id + ", clientState="
                + clientState + ", indexVersion=" + indexVersion + ", generationNum="
                + generationNum + ", isDeleted=" + isDeleted + ", isHidden=" + isHidden
                + ", isExternal=" + isExternal + ", isDeprecated=" + isDeprecated + ", created="
                + created + ", modified=" + modified + ", modifiedBy=" + modifiedBy + ", author="
                + author + ", owner=" + owner + "]";
    }

    /**
     * Builds a new {@link MetadataTagResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MetadataTagResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .id(getId())
                .clientState(getClientState())
                .indexVersion(getIndexVersion())
                .generationNum(getGenerationNum())
                .isDeleted(getIsDeleted())
                .isHidden(getIsHidden())
                .isExternal(getIsExternal())
                .isDeprecated(getIsDeprecated())
                .created(getCreated())
                .modified(getModified())
                .modifiedBy(getModifiedBy())
                .author(getAuthor())
                .owner(getOwner());
        return builder;
    }

    /**
     * Class to build instances of {@link MetadataTagResponse}.
     */
    public static class Builder {
        private String name;
        private String id;
        private ClientState clientState;
        private Double indexVersion;
        private Double generationNum;
        private Boolean isDeleted;
        private Boolean isHidden;
        private Boolean isExternal;
        private Boolean isDeprecated;
        private Double created;
        private Double modified;
        private TagNameAndID modifiedBy;
        private TagNameAndID author;
        private TagNameAndID owner;



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
         * Setter for clientState.
         * @param  clientState  ClientState value for clientState.
         * @return Builder
         */
        public Builder clientState(ClientState clientState) {
            this.clientState = clientState;
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
         * Setter for modifiedBy.
         * @param  modifiedBy  TagNameAndID value for modifiedBy.
         * @return Builder
         */
        public Builder modifiedBy(TagNameAndID modifiedBy) {
            this.modifiedBy = modifiedBy;
            return this;
        }

        /**
         * Setter for author.
         * @param  author  TagNameAndID value for author.
         * @return Builder
         */
        public Builder author(TagNameAndID author) {
            this.author = author;
            return this;
        }

        /**
         * Setter for owner.
         * @param  owner  TagNameAndID value for owner.
         * @return Builder
         */
        public Builder owner(TagNameAndID owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Builds a new {@link MetadataTagResponse} object using the set fields.
         * @return {@link MetadataTagResponse}
         */
        public MetadataTagResponse build() {
            return new MetadataTagResponse(name, id, clientState, indexVersion, generationNum,
                    isDeleted, isHidden, isExternal, isDeprecated, created, modified, modifiedBy,
                    author, owner);
        }
    }
}
