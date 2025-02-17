// <copyright file="ArrayDeserialization.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace ThoughtSpotPublicRESTAPI.Standard.Utilities
{
    using Newtonsoft.Json.Converters;

    /// <summary>
    /// This enumeration has ArrayDeserialization format.
    /// </summary>
    public enum ArrayDeserialization
    {
        /// <summary>
        /// Example: variableName[0] = value1
        /// </summary>
        Indexed = 0,

        /// <summary>
        /// Example: variableName[] = value1
        /// </summary>
        UnIndexed = 1,

        /// <summary>
        /// Example: variableName = value1, variableName = value 2
        /// </summary>
        Plain = 2,

        /// <summary>
        /// Example: variableName = value1,value2
        /// </summary>
        Csv = 3,

        /// <summary>
        /// Example: variableName = value1\tvalue2
        /// </summary>
        Tsv = 4,

        /// <summary>
        /// Example: variableName = value1|value2
        /// </summary>
        Psv = 5,

        /// <summary>
        /// Example: Ignore format
        /// </summary>
        None = 6,
    }
}