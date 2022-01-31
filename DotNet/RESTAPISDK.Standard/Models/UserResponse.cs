// <copyright file="UserResponse.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace RESTAPISDK.Standard.Models
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel;
    using System.IO;
    using System.Linq;
    using System.Text;
    using System.Threading.Tasks;
    using Newtonsoft.Json;
    using Newtonsoft.Json.Converters;
    using RESTAPISDK.Standard;
    using RESTAPISDK.Standard.Utilities;

    /// <summary>
    /// UserResponse.
    /// </summary>
    public class UserResponse
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UserResponse"/> class.
        /// </summary>
        public UserResponse()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="UserResponse"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="displayName">displayName.</param>
        /// <param name="id">id.</param>
        /// <param name="visibility">visibility.</param>
        /// <param name="mail">mail.</param>
        /// <param name="groups">groups.</param>
        /// <param name="privileges">privileges.</param>
        /// <param name="tags">tags.</param>
        /// <param name="state">state.</param>
        /// <param name="notifyOnShare">notifyOnShare.</param>
        /// <param name="showWalkMe">showWalkMe.</param>
        /// <param name="analystOnboardingComplete">analystOnboardingComplete.</param>
        /// <param name="firstLogin">firstLogin.</param>
        /// <param name="welcomeEmailSent">welcomeEmailSent.</param>
        /// <param name="isDeleted">isDeleted.</param>
        /// <param name="isHidden">isHidden.</param>
        /// <param name="isExternal">isExternal.</param>
        /// <param name="isDeprecated">isDeprecated.</param>
        /// <param name="complete">complete.</param>
        /// <param name="isSuperUser">isSuperUser.</param>
        /// <param name="isSystemPrincipal">isSystemPrincipal.</param>
        /// <param name="type">type.</param>
        /// <param name="parenttype">parenttype.</param>
        /// <param name="tenantId">tenantId.</param>
        /// <param name="indexVersion">indexVersion.</param>
        /// <param name="generationNum">generationNum.</param>
        /// <param name="created">created.</param>
        /// <param name="modified">modified.</param>
        /// <param name="author">author.</param>
        /// <param name="modifiedBy">modifiedBy.</param>
        /// <param name="owner">owner.</param>
        public UserResponse(
            string name = null,
            string displayName = null,
            string id = null,
            string visibility = null,
            string mail = null,
            List<Models.GroupNameAndID> groups = null,
            List<string> privileges = null,
            List<string> tags = null,
            string state = null,
            bool? notifyOnShare = null,
            bool? showWalkMe = null,
            bool? analystOnboardingComplete = null,
            int? firstLogin = null,
            bool? welcomeEmailSent = null,
            bool? isDeleted = null,
            bool? isHidden = null,
            bool? isExternal = null,
            bool? isDeprecated = null,
            bool? complete = null,
            bool? isSuperUser = null,
            bool? isSystemPrincipal = null,
            string type = null,
            string parenttype = null,
            string tenantId = null,
            int? indexVersion = null,
            int? generationNum = null,
            double? created = null,
            double? modified = null,
            Models.UserNameAndID author = null,
            Models.UserNameAndID modifiedBy = null,
            Models.UserNameAndID owner = null)
        {
            this.Name = name;
            this.DisplayName = displayName;
            this.Id = id;
            this.Visibility = visibility;
            this.Mail = mail;
            this.Groups = groups;
            this.Privileges = privileges;
            this.Tags = tags;
            this.State = state;
            this.NotifyOnShare = notifyOnShare;
            this.ShowWalkMe = showWalkMe;
            this.AnalystOnboardingComplete = analystOnboardingComplete;
            this.FirstLogin = firstLogin;
            this.WelcomeEmailSent = welcomeEmailSent;
            this.IsDeleted = isDeleted;
            this.IsHidden = isHidden;
            this.IsExternal = isExternal;
            this.IsDeprecated = isDeprecated;
            this.Complete = complete;
            this.IsSuperUser = isSuperUser;
            this.IsSystemPrincipal = isSystemPrincipal;
            this.Type = type;
            this.Parenttype = parenttype;
            this.TenantId = tenantId;
            this.IndexVersion = indexVersion;
            this.GenerationNum = generationNum;
            this.Created = created;
            this.Modified = modified;
            this.Author = author;
            this.ModifiedBy = modifiedBy;
            this.Owner = owner;
        }

        /// <summary>
        /// Username of the user account
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// Display name of the user account
        /// </summary>
        [JsonProperty("displayName", NullValueHandling = NullValueHandling.Ignore)]
        public string DisplayName { get; set; }

        /// <summary>
        /// GUID of the user account
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// Visibility of the user account
        /// </summary>
        [JsonProperty("visibility", NullValueHandling = NullValueHandling.Ignore)]
        public string Visibility { get; set; }

        /// <summary>
        /// Email of the user account
        /// </summary>
        [JsonProperty("mail", NullValueHandling = NullValueHandling.Ignore)]
        public string Mail { get; set; }

        /// <summary>
        /// Name of the group to which user account is added
        /// </summary>
        [JsonProperty("groups", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.GroupNameAndID> Groups { get; set; }

        /// <summary>
        /// Privileges assigned to user account
        /// </summary>
        [JsonProperty("privileges", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> Privileges { get; set; }

        /// <summary>
        /// Tags assigned to the user
        /// </summary>
        [JsonProperty("tags", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> Tags { get; set; }

        /// <summary>
        /// Indicates if the user account is active or inactive
        /// </summary>
        [JsonProperty("state", NullValueHandling = NullValueHandling.Ignore)]
        public string State { get; set; }

        /// <summary>
        /// Indicates if the email should be sent when object is shared with the user
        /// </summary>
        [JsonProperty("notifyOnShare", NullValueHandling = NullValueHandling.Ignore)]
        public bool? NotifyOnShare { get; set; }

        /// <summary>
        /// Indicates if the walk me should be shown when logging in
        /// </summary>
        [JsonProperty("showWalkMe", NullValueHandling = NullValueHandling.Ignore)]
        public bool? ShowWalkMe { get; set; }

        /// <summary>
        /// Indicates if the onboarding is completed for the user
        /// </summary>
        [JsonProperty("analystOnboardingComplete", NullValueHandling = NullValueHandling.Ignore)]
        public bool? AnalystOnboardingComplete { get; set; }

        /// <summary>
        /// Indicates if the use is logging in for the first time
        /// </summary>
        [JsonProperty("firstLogin", NullValueHandling = NullValueHandling.Ignore)]
        public int? FirstLogin { get; set; }

        /// <summary>
        /// Indicates if the welcome email is sent to email associated with the user account
        /// </summary>
        [JsonProperty("welcomeEmailSent", NullValueHandling = NullValueHandling.Ignore)]
        public bool? WelcomeEmailSent { get; set; }

        /// <summary>
        /// Indicates if the user account is deleted
        /// </summary>
        [JsonProperty("isDeleted", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsDeleted { get; set; }

        /// <summary>
        /// Indicates if the user account is hidden
        /// </summary>
        [JsonProperty("isHidden", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsHidden { get; set; }

        /// <summary>
        /// Indicates if the user account is from external system
        /// isDeprecated
        /// </summary>
        [JsonProperty("isExternal", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsExternal { get; set; }

        /// <summary>
        /// Gets or sets IsDeprecated.
        /// </summary>
        [JsonProperty("isDeprecated", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsDeprecated { get; set; }

        /// <summary>
        /// Indicates if the all the properties of user account is provided
        /// </summary>
        [JsonProperty("complete", NullValueHandling = NullValueHandling.Ignore)]
        public bool? Complete { get; set; }

        /// <summary>
        /// Indicates if the user account is super user
        /// </summary>
        [JsonProperty("isSuperUser", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsSuperUser { get; set; }

        /// <summary>
        /// Indicates if the user account is system principal
        /// </summary>
        [JsonProperty("isSystemPrincipal", NullValueHandling = NullValueHandling.Ignore)]
        public bool? IsSystemPrincipal { get; set; }

        /// <summary>
        /// Indicates the type of user account
        /// </summary>
        [JsonProperty("type", NullValueHandling = NullValueHandling.Ignore)]
        public string Type { get; set; }

        /// <summary>
        /// Indicates the type of parent object
        /// </summary>
        [JsonProperty("parenttype", NullValueHandling = NullValueHandling.Ignore)]
        public string Parenttype { get; set; }

        /// <summary>
        /// Tenant id associated with the user account
        /// </summary>
        [JsonProperty("tenantId", NullValueHandling = NullValueHandling.Ignore)]
        public string TenantId { get; set; }

        /// <summary>
        /// Gets or sets IndexVersion.
        /// </summary>
        [JsonProperty("indexVersion", NullValueHandling = NullValueHandling.Ignore)]
        public int? IndexVersion { get; set; }

        /// <summary>
        /// Gets or sets GenerationNum.
        /// </summary>
        [JsonProperty("generationNum", NullValueHandling = NullValueHandling.Ignore)]
        public int? GenerationNum { get; set; }

        /// <summary>
        /// Date and time when user account was created
        /// </summary>
        [JsonProperty("created", NullValueHandling = NullValueHandling.Ignore)]
        public double? Created { get; set; }

        /// <summary>
        /// Date and time of last modification of user account
        /// </summary>
        [JsonProperty("modified", NullValueHandling = NullValueHandling.Ignore)]
        public double? Modified { get; set; }

        /// <summary>
        /// Gets or sets Author.
        /// </summary>
        [JsonProperty("author", NullValueHandling = NullValueHandling.Ignore)]
        public Models.UserNameAndID Author { get; set; }

        /// <summary>
        /// Gets or sets ModifiedBy.
        /// </summary>
        [JsonProperty("modifiedBy", NullValueHandling = NullValueHandling.Ignore)]
        public Models.UserNameAndID ModifiedBy { get; set; }

        /// <summary>
        /// Gets or sets Owner.
        /// </summary>
        [JsonProperty("owner", NullValueHandling = NullValueHandling.Ignore)]
        public Models.UserNameAndID Owner { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"UserResponse : ({string.Join(", ", toStringOutput)})";
        }

        /// <inheritdoc/>
        public override bool Equals(object obj)
        {
            if (obj == null)
            {
                return false;
            }

            if (obj == this)
            {
                return true;
            }

            return obj is UserResponse other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.DisplayName == null && other.DisplayName == null) || (this.DisplayName?.Equals(other.DisplayName) == true)) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.Visibility == null && other.Visibility == null) || (this.Visibility?.Equals(other.Visibility) == true)) &&
                ((this.Mail == null && other.Mail == null) || (this.Mail?.Equals(other.Mail) == true)) &&
                ((this.Groups == null && other.Groups == null) || (this.Groups?.Equals(other.Groups) == true)) &&
                ((this.Privileges == null && other.Privileges == null) || (this.Privileges?.Equals(other.Privileges) == true)) &&
                ((this.Tags == null && other.Tags == null) || (this.Tags?.Equals(other.Tags) == true)) &&
                ((this.State == null && other.State == null) || (this.State?.Equals(other.State) == true)) &&
                ((this.NotifyOnShare == null && other.NotifyOnShare == null) || (this.NotifyOnShare?.Equals(other.NotifyOnShare) == true)) &&
                ((this.ShowWalkMe == null && other.ShowWalkMe == null) || (this.ShowWalkMe?.Equals(other.ShowWalkMe) == true)) &&
                ((this.AnalystOnboardingComplete == null && other.AnalystOnboardingComplete == null) || (this.AnalystOnboardingComplete?.Equals(other.AnalystOnboardingComplete) == true)) &&
                ((this.FirstLogin == null && other.FirstLogin == null) || (this.FirstLogin?.Equals(other.FirstLogin) == true)) &&
                ((this.WelcomeEmailSent == null && other.WelcomeEmailSent == null) || (this.WelcomeEmailSent?.Equals(other.WelcomeEmailSent) == true)) &&
                ((this.IsDeleted == null && other.IsDeleted == null) || (this.IsDeleted?.Equals(other.IsDeleted) == true)) &&
                ((this.IsHidden == null && other.IsHidden == null) || (this.IsHidden?.Equals(other.IsHidden) == true)) &&
                ((this.IsExternal == null && other.IsExternal == null) || (this.IsExternal?.Equals(other.IsExternal) == true)) &&
                ((this.IsDeprecated == null && other.IsDeprecated == null) || (this.IsDeprecated?.Equals(other.IsDeprecated) == true)) &&
                ((this.Complete == null && other.Complete == null) || (this.Complete?.Equals(other.Complete) == true)) &&
                ((this.IsSuperUser == null && other.IsSuperUser == null) || (this.IsSuperUser?.Equals(other.IsSuperUser) == true)) &&
                ((this.IsSystemPrincipal == null && other.IsSystemPrincipal == null) || (this.IsSystemPrincipal?.Equals(other.IsSystemPrincipal) == true)) &&
                ((this.Type == null && other.Type == null) || (this.Type?.Equals(other.Type) == true)) &&
                ((this.Parenttype == null && other.Parenttype == null) || (this.Parenttype?.Equals(other.Parenttype) == true)) &&
                ((this.TenantId == null && other.TenantId == null) || (this.TenantId?.Equals(other.TenantId) == true)) &&
                ((this.IndexVersion == null && other.IndexVersion == null) || (this.IndexVersion?.Equals(other.IndexVersion) == true)) &&
                ((this.GenerationNum == null && other.GenerationNum == null) || (this.GenerationNum?.Equals(other.GenerationNum) == true)) &&
                ((this.Created == null && other.Created == null) || (this.Created?.Equals(other.Created) == true)) &&
                ((this.Modified == null && other.Modified == null) || (this.Modified?.Equals(other.Modified) == true)) &&
                ((this.Author == null && other.Author == null) || (this.Author?.Equals(other.Author) == true)) &&
                ((this.ModifiedBy == null && other.ModifiedBy == null) || (this.ModifiedBy?.Equals(other.ModifiedBy) == true)) &&
                ((this.Owner == null && other.Owner == null) || (this.Owner?.Equals(other.Owner) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.DisplayName = {(this.DisplayName == null ? "null" : this.DisplayName == string.Empty ? "" : this.DisplayName)}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.Visibility = {(this.Visibility == null ? "null" : this.Visibility == string.Empty ? "" : this.Visibility)}");
            toStringOutput.Add($"this.Mail = {(this.Mail == null ? "null" : this.Mail == string.Empty ? "" : this.Mail)}");
            toStringOutput.Add($"this.Groups = {(this.Groups == null ? "null" : $"[{string.Join(", ", this.Groups)} ]")}");
            toStringOutput.Add($"this.Privileges = {(this.Privileges == null ? "null" : $"[{string.Join(", ", this.Privileges)} ]")}");
            toStringOutput.Add($"this.Tags = {(this.Tags == null ? "null" : $"[{string.Join(", ", this.Tags)} ]")}");
            toStringOutput.Add($"this.State = {(this.State == null ? "null" : this.State == string.Empty ? "" : this.State)}");
            toStringOutput.Add($"this.NotifyOnShare = {(this.NotifyOnShare == null ? "null" : this.NotifyOnShare.ToString())}");
            toStringOutput.Add($"this.ShowWalkMe = {(this.ShowWalkMe == null ? "null" : this.ShowWalkMe.ToString())}");
            toStringOutput.Add($"this.AnalystOnboardingComplete = {(this.AnalystOnboardingComplete == null ? "null" : this.AnalystOnboardingComplete.ToString())}");
            toStringOutput.Add($"this.FirstLogin = {(this.FirstLogin == null ? "null" : this.FirstLogin.ToString())}");
            toStringOutput.Add($"this.WelcomeEmailSent = {(this.WelcomeEmailSent == null ? "null" : this.WelcomeEmailSent.ToString())}");
            toStringOutput.Add($"this.IsDeleted = {(this.IsDeleted == null ? "null" : this.IsDeleted.ToString())}");
            toStringOutput.Add($"this.IsHidden = {(this.IsHidden == null ? "null" : this.IsHidden.ToString())}");
            toStringOutput.Add($"this.IsExternal = {(this.IsExternal == null ? "null" : this.IsExternal.ToString())}");
            toStringOutput.Add($"this.IsDeprecated = {(this.IsDeprecated == null ? "null" : this.IsDeprecated.ToString())}");
            toStringOutput.Add($"this.Complete = {(this.Complete == null ? "null" : this.Complete.ToString())}");
            toStringOutput.Add($"this.IsSuperUser = {(this.IsSuperUser == null ? "null" : this.IsSuperUser.ToString())}");
            toStringOutput.Add($"this.IsSystemPrincipal = {(this.IsSystemPrincipal == null ? "null" : this.IsSystemPrincipal.ToString())}");
            toStringOutput.Add($"this.Type = {(this.Type == null ? "null" : this.Type == string.Empty ? "" : this.Type)}");
            toStringOutput.Add($"this.Parenttype = {(this.Parenttype == null ? "null" : this.Parenttype == string.Empty ? "" : this.Parenttype)}");
            toStringOutput.Add($"this.TenantId = {(this.TenantId == null ? "null" : this.TenantId == string.Empty ? "" : this.TenantId)}");
            toStringOutput.Add($"this.IndexVersion = {(this.IndexVersion == null ? "null" : this.IndexVersion.ToString())}");
            toStringOutput.Add($"this.GenerationNum = {(this.GenerationNum == null ? "null" : this.GenerationNum.ToString())}");
            toStringOutput.Add($"this.Created = {(this.Created == null ? "null" : this.Created.ToString())}");
            toStringOutput.Add($"this.Modified = {(this.Modified == null ? "null" : this.Modified.ToString())}");
            toStringOutput.Add($"this.Author = {(this.Author == null ? "null" : this.Author.ToString())}");
            toStringOutput.Add($"this.ModifiedBy = {(this.ModifiedBy == null ? "null" : this.ModifiedBy.ToString())}");
            toStringOutput.Add($"this.Owner = {(this.Owner == null ? "null" : this.Owner.ToString())}");
        }
    }
}