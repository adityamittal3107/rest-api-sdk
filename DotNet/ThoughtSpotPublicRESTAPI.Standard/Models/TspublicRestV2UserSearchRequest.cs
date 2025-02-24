// <copyright file="TspublicRestV2UserSearchRequest.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace ThoughtSpotPublicRESTAPI.Standard.Models
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
    using ThoughtSpotPublicRESTAPI.Standard;
    using ThoughtSpotPublicRESTAPI.Standard.Utilities;

    /// <summary>
    /// TspublicRestV2UserSearchRequest.
    /// </summary>
    public class TspublicRestV2UserSearchRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2UserSearchRequest"/> class.
        /// </summary>
        public TspublicRestV2UserSearchRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2UserSearchRequest"/> class.
        /// </summary>
        /// <param name="outputFields">outputFields.</param>
        /// <param name="name">name.</param>
        /// <param name="id">id.</param>
        /// <param name="displayName">displayName.</param>
        /// <param name="visibility">visibility.</param>
        /// <param name="mail">mail.</param>
        /// <param name="groups">groups.</param>
        /// <param name="privileges">privileges.</param>
        /// <param name="state">state.</param>
        /// <param name="notifyOnShare">notifyOnShare.</param>
        /// <param name="showWalkMe">showWalkMe.</param>
        /// <param name="analystOnboardingComplete">analystOnboardingComplete.</param>
        /// <param name="type">type.</param>
        public TspublicRestV2UserSearchRequest(
            List<string> outputFields = null,
            string name = null,
            string id = null,
            string displayName = null,
            string visibility = null,
            string mail = null,
            List<Models.GroupNameAndIDInput> groups = null,
            List<Models.PrivilegeEnum> privileges = null,
            string state = null,
            bool? notifyOnShare = null,
            bool? showWalkMe = null,
            bool? analystOnboardingComplete = null,
            string type = null)
        {
            this.OutputFields = outputFields;
            this.Name = name;
            this.Id = id;
            this.DisplayName = displayName;
            this.Visibility = visibility;
            this.Mail = mail;
            this.Groups = groups;
            this.Privileges = privileges;
            this.State = state;
            this.NotifyOnShare = notifyOnShare;
            this.ShowWalkMe = showWalkMe;
            this.AnalystOnboardingComplete = analystOnboardingComplete;
            this.Type = type;
        }

        /// <summary>
        /// Array of field names that need to be included in the response
        /// </summary>
        [JsonProperty("outputFields", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> OutputFields { get; set; }

        /// <summary>
        /// User name of the user account
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// The GUID of the user account
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// A unique display name string for the user, usually their first and last name.
        /// </summary>
        [JsonProperty("displayName", NullValueHandling = NullValueHandling.Ignore)]
        public string DisplayName { get; set; }

        /// <summary>
        /// Visibility of the user account. The visibility attribute is set to DEFAULT when creating a user. The DEFAULT attribute makes a user visible to other users and user groups, and thus allows them to share objects.
        /// </summary>
        [JsonProperty("visibility", NullValueHandling = NullValueHandling.Ignore)]
        public string Visibility { get; set; }

        /// <summary>
        /// email of the user.
        /// </summary>
        [JsonProperty("mail", NullValueHandling = NullValueHandling.Ignore)]
        public string Mail { get; set; }

        /// <summary>
        /// Array of objects of groups that the user belong to.
        /// </summary>
        [JsonProperty("groups", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.GroupNameAndIDInput> Groups { get; set; }

        /// <summary>
        /// Privileges assigned to user account
        /// </summary>
        [JsonProperty("privileges", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.PrivilegeEnum> Privileges { get; set; }

        /// <summary>
        /// Status of user account. acitve or inactive.
        /// </summary>
        [JsonProperty("state", NullValueHandling = NullValueHandling.Ignore)]
        public string State { get; set; }

        /// <summary>
        /// User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards.
        /// </summary>
        [JsonProperty("notifyOnShare", NullValueHandling = NullValueHandling.Ignore)]
        public bool? NotifyOnShare { get; set; }

        /// <summary>
        /// The user preference for revisiting the onboarding experience.
        /// </summary>
        [JsonProperty("showWalkMe", NullValueHandling = NullValueHandling.Ignore)]
        public bool? ShowWalkMe { get; set; }

        /// <summary>
        /// ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly. The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI.
        /// </summary>
        [JsonProperty("analystOnboardingComplete", NullValueHandling = NullValueHandling.Ignore)]
        public bool? AnalystOnboardingComplete { get; set; }

        /// <summary>
        /// Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system.
        /// </summary>
        [JsonProperty("type", NullValueHandling = NullValueHandling.Ignore)]
        public string Type { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2UserSearchRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2UserSearchRequest other &&
                ((this.OutputFields == null && other.OutputFields == null) || (this.OutputFields?.Equals(other.OutputFields) == true)) &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.DisplayName == null && other.DisplayName == null) || (this.DisplayName?.Equals(other.DisplayName) == true)) &&
                ((this.Visibility == null && other.Visibility == null) || (this.Visibility?.Equals(other.Visibility) == true)) &&
                ((this.Mail == null && other.Mail == null) || (this.Mail?.Equals(other.Mail) == true)) &&
                ((this.Groups == null && other.Groups == null) || (this.Groups?.Equals(other.Groups) == true)) &&
                ((this.Privileges == null && other.Privileges == null) || (this.Privileges?.Equals(other.Privileges) == true)) &&
                ((this.State == null && other.State == null) || (this.State?.Equals(other.State) == true)) &&
                ((this.NotifyOnShare == null && other.NotifyOnShare == null) || (this.NotifyOnShare?.Equals(other.NotifyOnShare) == true)) &&
                ((this.ShowWalkMe == null && other.ShowWalkMe == null) || (this.ShowWalkMe?.Equals(other.ShowWalkMe) == true)) &&
                ((this.AnalystOnboardingComplete == null && other.AnalystOnboardingComplete == null) || (this.AnalystOnboardingComplete?.Equals(other.AnalystOnboardingComplete) == true)) &&
                ((this.Type == null && other.Type == null) || (this.Type?.Equals(other.Type) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.OutputFields = {(this.OutputFields == null ? "null" : $"[{string.Join(", ", this.OutputFields)} ]")}");
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.DisplayName = {(this.DisplayName == null ? "null" : this.DisplayName == string.Empty ? "" : this.DisplayName)}");
            toStringOutput.Add($"this.Visibility = {(this.Visibility == null ? "null" : this.Visibility == string.Empty ? "" : this.Visibility)}");
            toStringOutput.Add($"this.Mail = {(this.Mail == null ? "null" : this.Mail == string.Empty ? "" : this.Mail)}");
            toStringOutput.Add($"this.Groups = {(this.Groups == null ? "null" : $"[{string.Join(", ", this.Groups)} ]")}");
            toStringOutput.Add($"this.Privileges = {(this.Privileges == null ? "null" : $"[{string.Join(", ", this.Privileges)} ]")}");
            toStringOutput.Add($"this.State = {(this.State == null ? "null" : this.State == string.Empty ? "" : this.State)}");
            toStringOutput.Add($"this.NotifyOnShare = {(this.NotifyOnShare == null ? "null" : this.NotifyOnShare.ToString())}");
            toStringOutput.Add($"this.ShowWalkMe = {(this.ShowWalkMe == null ? "null" : this.ShowWalkMe.ToString())}");
            toStringOutput.Add($"this.AnalystOnboardingComplete = {(this.AnalystOnboardingComplete == null ? "null" : this.AnalystOnboardingComplete.ToString())}");
            toStringOutput.Add($"this.Type = {(this.Type == null ? "null" : this.Type == string.Empty ? "" : this.Type)}");
        }
    }
}