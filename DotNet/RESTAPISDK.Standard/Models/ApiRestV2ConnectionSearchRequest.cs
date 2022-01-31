// <copyright file="ApiRestV2ConnectionSearchRequest.cs" company="APIMatic">
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
    /// ApiRestV2ConnectionSearchRequest.
    /// </summary>
    public class ApiRestV2ConnectionSearchRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2ConnectionSearchRequest"/> class.
        /// </summary>
        public ApiRestV2ConnectionSearchRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiRestV2ConnectionSearchRequest"/> class.
        /// </summary>
        /// <param name="type">type.</param>
        /// <param name="offset">offset.</param>
        /// <param name="batchNumber">batchNumber.</param>
        /// <param name="batchSize">batchSize.</param>
        /// <param name="sortBy">sortBy.</param>
        /// <param name="sortOrder">sortOrder.</param>
        /// <param name="namePattern">namePattern.</param>
        /// <param name="fetchId">fetchId.</param>
        /// <param name="skipId">skipId.</param>
        /// <param name="tag">tag.</param>
        public ApiRestV2ConnectionSearchRequest(
            Models.Type14Enum type,
            int? offset = 0,
            int? batchNumber = null,
            int? batchSize = null,
            Models.SortByEnum? sortBy = Models.SortByEnum.DEFAULT,
            Models.SortOrderEnum? sortOrder = Models.SortOrderEnum.DEFAULT,
            string namePattern = null,
            List<string> fetchId = null,
            List<string> skipId = null,
            List<Models.TagNameAndIdInput> tag = null)
        {
            this.Offset = offset;
            this.BatchNumber = batchNumber;
            this.BatchSize = batchSize;
            this.SortBy = sortBy;
            this.SortOrder = sortOrder;
            this.Type = type;
            this.NamePattern = namePattern;
            this.FetchId = fetchId;
            this.SkipId = skipId;
            this.Tag = tag;
        }

        /// <summary>
        /// The offset point, starting from where the records should be included in the response.
        ///  If no input is provided then offset starts from 0.
        /// </summary>
        [JsonProperty("offset", NullValueHandling = NullValueHandling.Ignore)]
        public int? Offset { get; set; }

        /// <summary>
        /// An alternate way to set offset for the starting point of the response.
        ///  The value in offset field will not be considered if batchNumber field has value greater than 0.
        ///  Offset value will be calculated as (batchNumber - 1) * batchSize.
        ///  It is mandatory to provide a value for batchSize with batchNumber.
        /// </summary>
        [JsonProperty("batchNumber", NullValueHandling = NullValueHandling.Ignore)]
        public int? BatchNumber { get; set; }

        /// <summary>
        /// The number of records that should be included in the response starting from offset position. If no input is provided, then all records starting from the value provided in offset is included in the response.
        /// </summary>
        [JsonProperty("batchSize", NullValueHandling = NullValueHandling.Ignore)]
        public int? BatchSize { get; set; }

        /// <summary>
        /// Field based on which the response needs to be ordered.
        /// </summary>
        [JsonProperty("sortBy", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.SortByEnum? SortBy { get; set; }

        /// <summary>
        /// Order in which sortBy should be applied.
        /// </summary>
        [JsonProperty("sortOrder", ItemConverterType = typeof(StringEnumConverter), NullValueHandling = NullValueHandling.Ignore)]
        public Models.SortOrderEnum? SortOrder { get; set; }

        /// <summary>
        /// Type of the connect being searched. Valid values:
        /// </summary>
        [JsonProperty("type", ItemConverterType = typeof(StringEnumConverter))]
        public Models.Type14Enum Type { get; set; }

        /// <summary>
        /// A pattern to match the name of the connection. This parameter supports matching case-insensitive strings. For a wildcard match, use %.
        /// </summary>
        [JsonProperty("namePattern", NullValueHandling = NullValueHandling.Ignore)]
        public string NamePattern { get; set; }

        /// <summary>
        /// A JSON array containing the GUIDs of the connections that you want to fetch.
        /// </summary>
        [JsonProperty("fetchId", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> FetchId { get; set; }

        /// <summary>
        /// A JSON array containing the GUIDs of the connections that you want to skip.
        /// </summary>
        [JsonProperty("skipId", NullValueHandling = NullValueHandling.Ignore)]
        public List<string> SkipId { get; set; }

        /// <summary>
        /// A JSON array of name or GUID of tags or both. When both are given then id is considered
        /// </summary>
        [JsonProperty("tag", NullValueHandling = NullValueHandling.Ignore)]
        public List<Models.TagNameAndIdInput> Tag { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"ApiRestV2ConnectionSearchRequest : ({string.Join(", ", toStringOutput)})";
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

            return obj is ApiRestV2ConnectionSearchRequest other &&
                ((this.Offset == null && other.Offset == null) || (this.Offset?.Equals(other.Offset) == true)) &&
                ((this.BatchNumber == null && other.BatchNumber == null) || (this.BatchNumber?.Equals(other.BatchNumber) == true)) &&
                ((this.BatchSize == null && other.BatchSize == null) || (this.BatchSize?.Equals(other.BatchSize) == true)) &&
                ((this.SortBy == null && other.SortBy == null) || (this.SortBy?.Equals(other.SortBy) == true)) &&
                ((this.SortOrder == null && other.SortOrder == null) || (this.SortOrder?.Equals(other.SortOrder) == true)) &&
                this.Type.Equals(other.Type) &&
                ((this.NamePattern == null && other.NamePattern == null) || (this.NamePattern?.Equals(other.NamePattern) == true)) &&
                ((this.FetchId == null && other.FetchId == null) || (this.FetchId?.Equals(other.FetchId) == true)) &&
                ((this.SkipId == null && other.SkipId == null) || (this.SkipId?.Equals(other.SkipId) == true)) &&
                ((this.Tag == null && other.Tag == null) || (this.Tag?.Equals(other.Tag) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Offset = {(this.Offset == null ? "null" : this.Offset.ToString())}");
            toStringOutput.Add($"this.BatchNumber = {(this.BatchNumber == null ? "null" : this.BatchNumber.ToString())}");
            toStringOutput.Add($"this.BatchSize = {(this.BatchSize == null ? "null" : this.BatchSize.ToString())}");
            toStringOutput.Add($"this.SortBy = {(this.SortBy == null ? "null" : this.SortBy.ToString())}");
            toStringOutput.Add($"this.SortOrder = {(this.SortOrder == null ? "null" : this.SortOrder.ToString())}");
            toStringOutput.Add($"this.Type = {this.Type}");
            toStringOutput.Add($"this.NamePattern = {(this.NamePattern == null ? "null" : this.NamePattern == string.Empty ? "" : this.NamePattern)}");
            toStringOutput.Add($"this.FetchId = {(this.FetchId == null ? "null" : $"[{string.Join(", ", this.FetchId)} ]")}");
            toStringOutput.Add($"this.SkipId = {(this.SkipId == null ? "null" : $"[{string.Join(", ", this.SkipId)} ]")}");
            toStringOutput.Add($"this.Tag = {(this.Tag == null ? "null" : $"[{string.Join(", ", this.Tag)} ]")}");
        }
    }
}