// <copyright file="AccessEnum.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace ThoughtSpotPublicRESTAPI.Standard.Models
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Runtime.Serialization;
    using Newtonsoft.Json;
    using Newtonsoft.Json.Converters;
    using ThoughtSpotPublicRESTAPI.Standard;
    using ThoughtSpotPublicRESTAPI.Standard.Utilities;

    /// <summary>
    /// AccessEnum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum AccessEnum
    {
        /// <summary>
        /// READONLY.
        /// </summary>
        [EnumMember(Value = "READ_ONLY")]
        READONLY,

        /// <summary>
        /// MODIFY.
        /// </summary>
        [EnumMember(Value = "MODIFY")]
        MODIFY
    }
}