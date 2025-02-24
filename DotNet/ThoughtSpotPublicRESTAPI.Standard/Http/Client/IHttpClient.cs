// <copyright file="IHttpClient.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace ThoughtSpotPublicRESTAPI.Standard.Http.Client
{
    using System;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using ThoughtSpotPublicRESTAPI.Standard.Http.Request;
    using ThoughtSpotPublicRESTAPI.Standard.Http.Request.Configuration;
    using ThoughtSpotPublicRESTAPI.Standard.Http.Response;

    /// <summary>
    /// IHttpClient.
    /// </summary>
    internal interface IHttpClient
    {
        /// <summary>
        /// Event raised before an Http request is sent over the network
        /// This event can be used for logging, request modification, appending
        /// additional headers etc.
        /// </summary>
        event OnBeforeHttpRequestEventHandler OnBeforeHttpRequestEvent;

        /// <summary>
        /// Event raised after an Http response is recieved from the network.
        /// This event can be used for logging, response modification, extracting
        /// additional information etc.
        /// </summary>
        event OnAfterHttpResponseEventHandler OnAfterHttpResponseEvent;

        /// <summary>
        /// Execute a given HttpRequest to get string response back.
        /// </summary>
        /// <param name="request">The given HttpRequest to execute.</param>
        /// <param name="retryConfiguration">The <see cref="RetryConfiguration"/> for request.</param>
        /// <returns> HttpResponse containing raw information.</returns>
        HttpStringResponse ExecuteAsString(HttpRequest request, RetryConfiguration retryConfiguration = null);

        /// <summary>
        /// Execute a given HttpRequest to get binary response back.
        /// </summary>
        /// <param name="request">The given HttpRequest to execute.</param>
        /// <param name="retryConfiguration">The <see cref="RetryConfiguration"/> for request.</param>
        /// <returns> HttpResponse containing raw information.</returns>
        HttpResponse ExecuteAsBinary(HttpRequest request, RetryConfiguration retryConfiguration = null);

        /// <summary>
        /// Execute a given HttpRequest to get async string response back.
        /// </summary>
        /// <param name="request">The given HttpRequest to execute.</param>
        /// <param name="cancellationToken">CancellationToken.</param>
        /// <param name="retryConfiguration">The <see cref="RetryConfiguration"/> for request.</param>
        /// <returns> HttpResponse containing raw information.</returns>
        Task<HttpStringResponse> ExecuteAsStringAsync(HttpRequest request, RetryConfiguration retryConfiguration = null, CancellationToken cancellationToken = default);

        /// <summary>
        /// Execute a given HttpRequest to get async binary response back.
        /// </summary>
        /// <param name="request">The given HttpRequest to execute.</param>
        /// <param name="cancellationToken">CancellationToken.</param>
        /// <param name="retryConfiguration">The <see cref="RetryConfiguration"/> for request.</param>
        /// <returns> HttpResponse containing raw information.</returns>
        Task<HttpResponse> ExecuteAsBinaryAsync(HttpRequest request, RetryConfiguration retryConfiguration = null, CancellationToken cancellationToken = default);

        /// <summary>
        /// Create a simple HTTP GET request given the URL.
        /// </summary>
        /// <param name="queryUrl">Url the request should be sent to.</param>
        /// <returns>HttpRequest initialised with the url specified.</returns>
        HttpRequest Get(string queryUrl);

        /// <summary>
        /// Create a simple HTTP POST request given the URL.
        /// </summary>
        /// <param name="queryUrl">Url the request should be sent to.</param>
        /// <returns> HttpRequest initialised with the url specified.</returns>
        HttpRequest Post(string queryUrl);

        /// <summary>
        /// Create a simple HTTP PUT request given the URL.
        /// </summary>
        /// <param name="queryUrl">Url the request should be sent to.</param>
        /// <returns> HttpRequest initialised with the url specified.</returns>
        HttpRequest Put(string queryUrl);

        /// <summary>
        /// Create a simple HTTP DELETE request given the URL.
        /// </summary>
        /// <param name="queryUrl">Url the request should be sent to.</param>
        /// <returns> HttpRequest initialised with the url specified.</returns>
        HttpRequest Delete(string queryUrl);

        /// <summary>
        /// Create a simple HTTP PATCH request given the URL.
        /// </summary>
        /// <param name="queryUrl">Url the request should be sent to.</param>
        /// <returns> HttpRequest initialised with the url specified.</returns>
        HttpRequest Patch(string queryUrl);

        /// <summary>
        /// Create a simple HTTP GET request given relavent parameters.
        /// </summary>
        /// <param name="queryUrl">Url the request should be sent to.</param>
        /// <param name="headers">HTTP headers that should be included.</param>
        /// <param name="queryParameters">Query parameters to be included.</param>
        /// <param name="username">Basic Auth username.</param>
        /// <param name="password">Basic Auth password.</param>
        /// <returns> HttpRequest initialised with the http parameters specified.</returns>
        HttpRequest Get(
            string queryUrl,
            Dictionary<string, string> headers,
            Dictionary<string, object> queryParameters = null,
            string username = null,
            string password = null);

        /// <summary>
        ///  Create a simple HTTP POST request given relavent parameters.
        /// </summary>
        /// <param name="queryUrl">Url the request should be sent to.</param>
        /// <param name="headers">HTTP headers that should be included.</param>
        /// <param name="formParameters">Form parameters to be included.</param>
        /// <param name="queryParameters">Query parameters to be included.</param>
        /// <param name="username">Basic Auth username.</param>
        /// <param name="password">Basic Auth password.</param>
        /// <returns> HttpRequest initialised with the http parameters specified.</returns>
        HttpRequest Post(
            string queryUrl,
            Dictionary<string, string> headers,
            List<KeyValuePair<string, object>> formParameters,
            Dictionary<string, object> queryParameters = null,
            string username = null,
            string password = null);

        /// <summary>
        /// Create a simple HTTP POST with a body request given relavent parameters.
        /// </summary>
        /// <param name="queryUrl">Url the request should be sent to.</param>
        /// <param name="headers">HTTP headers that should be included.</param>
        /// <param name="body">The body/payload of the response.</param>
        /// <param name="queryParameters">Query parameters to be included.</param>
        /// <param name="username">Basic Auth username.</param>
        /// <param name="password">Basic Auth password.</param>
        /// <returns> HttpRequest initialised with the http parameters specified.</returns>
        HttpRequest PostBody(
            string queryUrl,
            Dictionary<string,
            string> headers,
            object body,
            Dictionary<string, object> queryParameters = null,
            string username = null,
            string password = null);

        /// <summary>
        ///  Create a simple HTTP PUT request given relavent parameters.
        /// </summary>
        /// <param name="queryUrl">Url the request should be sent to.</param>
        /// <param name="headers">HTTP headers that should be included.</param>
        /// <param name="formParameters">Form parameters to be included.</param>
        /// <param name="queryParameters">Query parameters to be included.</param>
        /// <param name="username">Basic Auth username.</param>
        /// <param name="password">Basic Auth password.</param>
        /// <returns> HttpRequest initialised with the http parameters specified.</returns>
        HttpRequest Put(
            string queryUrl,
            Dictionary<string, string> headers,
            List<KeyValuePair<string, object>> formParameters,
            Dictionary<string, object> queryParameters = null,
            string username = null,
            string password = null);

        /// <summary>
        /// Create a simple HTTP PUT with a body request given relavent parameters.
        /// </summary>
        /// <param name="queryUrl">Url the request should be sent to.</param>
        /// <param name="headers">HTTP headers that should be included.</param>
        /// <param name="body">The body/payload of the response.</param>
        /// <param name="queryParameters">Query parameters to be included.</param>
        /// <param name="username">Basic Auth username.</param>
        /// <param name="password">Basic Auth password.</param>
        /// <returns> HttpRequest initialised with the http parameters specified.</returns>
        HttpRequest PutBody(
            string queryUrl,
            Dictionary<string, string> headers,
            object body,
            Dictionary<string, object> queryParameters = null,
            string username = null,
            string password = null);

        /// <summary>
        ///  Create a simple HTTP PATCH request given relavent parameters.
        /// </summary>
        /// <param name="queryUrl">Url the request should be sent to.</param>
        /// <param name="headers">HTTP headers that should be included.</param>
        /// <param name="formParameters">Form parameters to be included.</param>
        /// <param name="queryParameters">Query parameters to be included.</param>
        /// <param name="username">Basic Auth username.</param>
        /// <param name="password">Basic Auth password.</param>
        /// <returns> HttpRequest initialised with the http parameters specified.</returns>
        HttpRequest Patch(
            string queryUrl,
            Dictionary<string, string> headers,
            List<KeyValuePair<string, object>> formParameters,
            Dictionary<string, object> queryParameters = null,
            string username = null,
            string password = null);

        /// <summary>
        /// Create a simple HTTP Patch with a body request given relavent parameters.
        /// </summary>
        /// <param name="queryUrl">Url the request should be sent to.</param>
        /// <param name="headers">HTTP headers that should be included.</param>
        /// <param name="body">The body/payload of the response.</param>
        /// <param name="queryParameters">Query parameters to be included.</param>
        /// <param name="username">Basic Auth username.</param>
        /// <param name="password">Basic Auth password.</param>
        /// <returns> HttpRequest initialised with the http parameters specified.</returns>
        HttpRequest PatchBody(
            string queryUrl,
            Dictionary<string, string> headers,
            object body,
            Dictionary<string, object> queryParameters = null,
            string username = null,
            string password = null);

        /// <summary>
        ///  Create a simple HTTP DELETE request given relavent parameters.
        /// </summary>
        /// <param name="queryUrl">Url the request should be sent to.</param>
        /// <param name="headers">HTTP headers that should be included.</param>
        /// <param name="formParameters">Form parameters to be included.</param>
        /// <param name="queryParameters">Query parameters to be included.</param>
        /// <param name="username">Basic Auth username.</param>
        /// <param name="password">Basic Auth password.</param>
        /// <returns> HttpRequest initialised with the http parameters specified.</returns>
        HttpRequest Delete(
            string queryUrl,
            Dictionary<string, string> headers,
            List<KeyValuePair<string, object>> formParameters,
            Dictionary<string, object> queryParameters = null,
            string username = null,
            string password = null);

        /// <summary>
        /// Create a simple HTTP Delete with a body request given relavent parameters.
        /// </summary>
        /// <param name="queryUrl">Url the request should be sent to.</param>
        /// <param name="headers">HTTP headers that should be included.</param>
        /// <param name="body">The body/payload of the response.</param>
        /// <param name="queryParameters">Query parameters to be included.</param>
        /// <param name="username">Basic Auth username.</param>
        /// <param name="password">Basic Auth password.</param>
        /// <returns> HttpRequest initialised with the http parameters specified.</returns>
        HttpRequest DeleteBody(
            string queryUrl,
            Dictionary<string, string> headers,
            object body,
            Dictionary<string, object> queryParameters = null,
            string username = null,
            string password = null);
    }
}