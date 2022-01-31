// <copyright file="ApiRestV2ConnectionUpdateRequest.cs" company="APIMatic">
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
    /// ApiRestV2ConnectionUpdateRequest.
    /// </summary>
    public class ApiRestV2ConnectionUpdateRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2ConnectionUpdateRequest"/> class.
        /// </summary>
        public ApiRestV2ConnectionUpdateRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2ConnectionUpdateRequest"/> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="configuration">configuration.</param>
        /// <param name="name">name.</param>
        /// <param name="description">description.</param>
        public ApiRestV2ConnectionUpdateRequest(
            string id,
            string configuration,
            string name = null,
            string description = null)
        {
            this.Id = id;
            this.Name = name;
            this.Description = description;
            this.Configuration = configuration;
        }

        /// <summary>
        /// GUID of the connection
        /// </summary>
        [JsonProperty("id")]
        public string Id { get; set; }

        /// <summary>
        /// The text to update the name of the connection.
        /// </summary>
        [JsonProperty("name", NullValueHandling = NullValueHandling.Ignore)]
        public string Name { get; set; }

        /// <summary>
        /// The text to update the description of the connection.
        /// </summary>
        [JsonProperty("description", NullValueHandling = NullValueHandling.Ignore)]
        public string Description { get; set; }

        /// <summary>
        /// A JSON object of the connection metadata. The metadata must include configuration attributes required to create the connection.
        ///  Example:
        ///  Snowflake: {"accountName":"testaccount","user":"test_user","password":"test_pwd","role":"test_role","warehouse":"test_wh","database":"test_db"}
        ///   Redshift: {"host":"test_host","port":"1234","user":"test_user","password":"test_pwd","database":"test_db"}
        ///  Google BigQuery: {"project_id":"test_project","oauth_pvt_key":"test_key"}
        ///  Azure Synapse: {"host":"test_host","port":"1234","user":"test_user","password":"test_pwd","database":"test_db"}
        ///  Teradata: {"host":"test_host","user":"test_user","password":"test_pwd","database":"test_db"}
        ///  Oracle ADW: {"user":"test_user","password":"test_pwd","net_service_name":"test_srvc_name","tns_admin":"test_tns","schema":"test_schema"}
        ///  Starburst: {"host":"test_host","user":"test_user","password":"test_pwd","database":"test_db"}
        ///  Databricks: {"host":"test_host","http_path":"https://test ","user":"test_user","password":"test_pwd"}
        ///  SAP HANA: {"host":"test_host","user":"test_user","password":"test_pwd","database":"test_db"}
        ///  Denodo: {"host":"test_host","port":"1234","user":"test_user","password":"test_pwd"}
        /// </summary>
        [JsonProperty("configuration")]
        public string Configuration { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"ApiRestV2ConnectionUpdateRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is ApiRestV2ConnectionUpdateRequest other &&
                ((this.Id == null && other.Id == null) || (this.Id?.Equals(other.Id) == true)) &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Description == null && other.Description == null) || (this.Description?.Equals(other.Description) == true)) &&
                ((this.Configuration == null && other.Configuration == null) || (this.Configuration?.Equals(other.Configuration) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Id = {(this.Id == null ? "null" : this.Id == string.Empty ? "" : this.Id)}");
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Description = {(this.Description == null ? "null" : this.Description == string.Empty ? "" : this.Description)}");
            toStringOutput.Add($"this.Configuration = {(this.Configuration == null ? "null" : this.Configuration == string.Empty ? "" : this.Configuration)}");
        }
    }
}