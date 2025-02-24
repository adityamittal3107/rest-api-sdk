// <copyright file="TspublicRestV2AdminResetpasswordRequest.cs" company="APIMatic">
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
    /// TspublicRestV2AdminResetpasswordRequest.
    /// </summary>
    public class TspublicRestV2AdminResetpasswordRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2AdminResetpasswordRequest"/> class.
        /// </summary>
        public TspublicRestV2AdminResetpasswordRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2AdminResetpasswordRequest"/> class.
        /// </summary>
        /// <param name="newPassword">newPassword.</param>
        /// <param name="name">name.</param>
        /// <param name="id">id.</param>
        public TspublicRestV2AdminResetpasswordRequest(
            string newPassword,
            string name = null,
            string id = null)
        {
            this.Name = name;
            this.Id = id;
            this.NewPassword = newPassword;
        }

        /// <summary>
        /// User name of the user account
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// The GUID of the user account to query.
        /// </summary>
        [JsonProperty("id", NullValueHandling = NullValueHandling.Ignore)]
        public string Id { get; set; }

        /// <summary>
        /// A new password for the user.
        /// </summary>
        [JsonProperty("newPassword")]
        public string NewPassword { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2AdminResetpasswordRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is TspublicRestV2AdminResetpasswordRequest other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.NewPassword == null && other.NewPassword == null) || (this.NewPassword?.Equals(other.NewPassword) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.NewPassword = {(this.NewPassword == null ? "null" : this.NewPassword == string.Empty ? "" : this.NewPassword)}");
        }
    }
}