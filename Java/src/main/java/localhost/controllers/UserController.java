/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import localhost.ApiHelper;
import localhost.AuthManager;
import localhost.Configuration;
import localhost.exceptions.ApiException;
import localhost.exceptions.ErrorResponseException;
import localhost.http.Headers;
import localhost.http.client.HttpCallback;
import localhost.http.client.HttpClient;
import localhost.http.client.HttpContext;
import localhost.http.request.HttpRequest;
import localhost.http.response.HttpResponse;
import localhost.http.response.HttpStringResponse;
import localhost.models.ApiRestV2UserAddgroupRequest;
import localhost.models.ApiRestV2UserCreateRequest;
import localhost.models.ApiRestV2UserRemovegroupRequest;
import localhost.models.ApiRestV2UserSearchRequest;
import localhost.models.ApiRestV2UserUpdateRequest;
import localhost.models.UserResponse;

/**
 * This class lists all the endpoints of the groups.
 */
public final class UserController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public UserController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }

    /**
     * Initializes the controller with HTTPCallback.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     * @param httpCallback    Callback to be called before and after the HTTP call.
     */
    public UserController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * To get the details of a specific user account by username or user id, use this endpoint. At
     * Least one value is needed. When both are given,then user id will be considered to fetch user
     * information.
     * @param  name  Optional parameter: Username of the user that you want to query
     * @param  id  Optional parameter: The GUID of the user account to query
     * @return    Returns the UserResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public UserResponse getUser(
            final String name,
            final String id) throws ApiException, IOException {
        HttpRequest request = buildGetUserRequest(name, id);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetUserResponse(context);
    }

    /**
     * To get the details of a specific user account by username or user id, use this endpoint. At
     * Least one value is needed. When both are given,then user id will be considered to fetch user
     * information.
     * @param  name  Optional parameter: Username of the user that you want to query
     * @param  id  Optional parameter: The GUID of the user account to query
     * @return    Returns the UserResponse response from the API call
     */
    public CompletableFuture<UserResponse> getUserAsync(
            final String name,
            final String id) {
        return makeHttpCallAsync(() -> buildGetUserRequest(name, id),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleGetUserResponse(context));
    }

    /**
     * Builds the HttpRequest object for getUser.
     */
    private HttpRequest buildGetUserRequest(
            final String name,
            final String id) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/api/rest/v2/user");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("name", name);
        queryParameters.put("id", id);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", config.getContentType());
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, queryParameters,
                null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for getUser.
     * @return An object of type UserResponse
     */
    private UserResponse handleGetUserResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 500) {
            throw new ErrorResponseException("Operation failed or unauthorized request", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        UserResponse result = ApiHelper.deserialize(responseBody,
                UserResponse.class);

        return result;
    }

    /**
     * To programmatically create a user account in the ThoughtSpot system, use this API endpoint.
     * Using this API, you can create a user and assign groups. To create a user, you require admin
     * user privileges. All users created in the ThoughtSpot system are added to ALL_GROUP.
     * @param  body  Required parameter: Example:
     * @return    Returns the UserResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public UserResponse createUser(
            final ApiRestV2UserCreateRequest body) throws ApiException, IOException {
        HttpRequest request = buildCreateUserRequest(body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleCreateUserResponse(context);
    }

    /**
     * To programmatically create a user account in the ThoughtSpot system, use this API endpoint.
     * Using this API, you can create a user and assign groups. To create a user, you require admin
     * user privileges. All users created in the ThoughtSpot system are added to ALL_GROUP.
     * @param  body  Required parameter: Example:
     * @return    Returns the UserResponse response from the API call
     */
    public CompletableFuture<UserResponse> createUserAsync(
            final ApiRestV2UserCreateRequest body) {
        return makeHttpCallAsync(() -> buildCreateUserRequest(body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleCreateUserResponse(context));
    }

    /**
     * Builds the HttpRequest object for createUser.
     */
    private HttpRequest buildCreateUserRequest(
            final ApiRestV2UserCreateRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/api/rest/v2/user/create");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for createUser.
     * @return An object of type UserResponse
     */
    private UserResponse handleCreateUserResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 500) {
            throw new ErrorResponseException("Operation failed or unauthorized request", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        UserResponse result = ApiHelper.deserialize(responseBody,
                UserResponse.class);

        return result;
    }

    /**
     * You can use this endpoint to programmatically modify an existing user account. To modify a
     * user, you require admin user privileges. At least one of User Id or username is mandatory.
     * When both are given, then user id will be considered and username will be updated.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean updateUser(
            final ApiRestV2UserUpdateRequest body) throws ApiException, IOException {
        HttpRequest request = buildUpdateUserRequest(body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUpdateUserResponse(context);
    }

    /**
     * You can use this endpoint to programmatically modify an existing user account. To modify a
     * user, you require admin user privileges. At least one of User Id or username is mandatory.
     * When both are given, then user id will be considered and username will be updated.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> updateUserAsync(
            final ApiRestV2UserUpdateRequest body) {
        return makeHttpCallAsync(() -> buildUpdateUserRequest(body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleUpdateUserResponse(context));
    }

    /**
     * Builds the HttpRequest object for updateUser.
     */
    private HttpRequest buildUpdateUserRequest(
            final ApiRestV2UserUpdateRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/api/rest/v2/user/update");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().putBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for updateUser.
     * @return An object of type boolean
     */
    private Boolean handleUpdateUserResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 500) {
            throw new ErrorResponseException("Operation failed or unauthorized request", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        boolean result = Boolean.parseBoolean(responseBody);

        return result;
    }

    /**
     * To remove a user from the ThoughtSpot system, use this endpoint. At least one value is
     * needed. When both are given, then user id will be considered to delete user.
     * @param  name  Optional parameter: Username of the user account
     * @param  id  Optional parameter: The GUID of the user account
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean deleteUser(
            final String name,
            final String id) throws ApiException, IOException {
        HttpRequest request = buildDeleteUserRequest(name, id);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleDeleteUserResponse(context);
    }

    /**
     * To remove a user from the ThoughtSpot system, use this endpoint. At least one value is
     * needed. When both are given, then user id will be considered to delete user.
     * @param  name  Optional parameter: Username of the user account
     * @param  id  Optional parameter: The GUID of the user account
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> deleteUserAsync(
            final String name,
            final String id) {
        return makeHttpCallAsync(() -> buildDeleteUserRequest(name, id),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleDeleteUserResponse(context));
    }

    /**
     * Builds the HttpRequest object for deleteUser.
     */
    private HttpRequest buildDeleteUserRequest(
            final String name,
            final String id) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/api/rest/v2/user/delete");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("name", name);
        queryParameters.put("id", id);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", config.getContentType());
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().delete(queryBuilder, headers, queryParameters,
                null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for deleteUser.
     * @return An object of type boolean
     */
    private Boolean handleDeleteUserResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 500) {
            throw new ErrorResponseException("Operation failed or unauthorized request", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        boolean result = Boolean.parseBoolean(responseBody);

        return result;
    }

    /**
     * To programmatically add groups to an existing ThoughtSpot user, use this endpoint. When you
     * assign groups to a user, the user inherits the privileges assigned to those groups. At least
     * one of user Id or username is mandatory. When both are given, then user id will be
     * considered.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean addGroupsToUser(
            final ApiRestV2UserAddgroupRequest body) throws ApiException, IOException {
        HttpRequest request = buildAddGroupsToUserRequest(body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleAddGroupsToUserResponse(context);
    }

    /**
     * To programmatically add groups to an existing ThoughtSpot user, use this endpoint. When you
     * assign groups to a user, the user inherits the privileges assigned to those groups. At least
     * one of user Id or username is mandatory. When both are given, then user id will be
     * considered.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> addGroupsToUserAsync(
            final ApiRestV2UserAddgroupRequest body) {
        return makeHttpCallAsync(() -> buildAddGroupsToUserRequest(body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleAddGroupsToUserResponse(context));
    }

    /**
     * Builds the HttpRequest object for addGroupsToUser.
     */
    private HttpRequest buildAddGroupsToUserRequest(
            final ApiRestV2UserAddgroupRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/api/rest/v2/user/addgroup");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().putBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for addGroupsToUser.
     * @return An object of type boolean
     */
    private Boolean handleAddGroupsToUserResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 500) {
            throw new ErrorResponseException("Operation failed or unauthorized request", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        boolean result = Boolean.parseBoolean(responseBody);

        return result;
    }

    /**
     * To programmatically remove groups from an existing ThoughtSpot user, use this API endpoint.
     * The API removes only the user association. It does not delete the user or group from the
     * Thoughtspot system. At least one of user id or username is mandatory. When both are given,
     * then user id will be considered.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean removeGroupsFromUser(
            final ApiRestV2UserRemovegroupRequest body) throws ApiException, IOException {
        HttpRequest request = buildRemoveGroupsFromUserRequest(body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRemoveGroupsFromUserResponse(context);
    }

    /**
     * To programmatically remove groups from an existing ThoughtSpot user, use this API endpoint.
     * The API removes only the user association. It does not delete the user or group from the
     * Thoughtspot system. At least one of user id or username is mandatory. When both are given,
     * then user id will be considered.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> removeGroupsFromUserAsync(
            final ApiRestV2UserRemovegroupRequest body) {
        return makeHttpCallAsync(() -> buildRemoveGroupsFromUserRequest(body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleRemoveGroupsFromUserResponse(context));
    }

    /**
     * Builds the HttpRequest object for removeGroupsFromUser.
     */
    private HttpRequest buildRemoveGroupsFromUserRequest(
            final ApiRestV2UserRemovegroupRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/api/rest/v2/user/removegroup");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().putBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for removeGroupsFromUser.
     * @return An object of type boolean
     */
    private Boolean handleRemoveGroupsFromUserResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 500) {
            throw new ErrorResponseException("Operation failed or unauthorized request", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        boolean result = Boolean.parseBoolean(responseBody);

        return result;
    }

    /**
     * To get the details of a specific user account or all users in the ThoughtSpot system, use
     * this endpoint. If no input is provided, then all user are included in the response.
     * @param  body  Required parameter: Example:
     * @return    Returns the List of UserResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<UserResponse> searchUsers(
            final ApiRestV2UserSearchRequest body) throws ApiException, IOException {
        HttpRequest request = buildSearchUsersRequest(body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSearchUsersResponse(context);
    }

    /**
     * To get the details of a specific user account or all users in the ThoughtSpot system, use
     * this endpoint. If no input is provided, then all user are included in the response.
     * @param  body  Required parameter: Example:
     * @return    Returns the List of UserResponse response from the API call
     */
    public CompletableFuture<List<UserResponse>> searchUsersAsync(
            final ApiRestV2UserSearchRequest body) {
        return makeHttpCallAsync(() -> buildSearchUsersRequest(body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleSearchUsersResponse(context));
    }

    /**
     * Builds the HttpRequest object for searchUsers.
     */
    private HttpRequest buildSearchUsersRequest(
            final ApiRestV2UserSearchRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/api/rest/v2/user/search");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for searchUsers.
     * @return An object of type List of UserResponse
     */
    private List<UserResponse> handleSearchUsersResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 500) {
            throw new ErrorResponseException("Operation failed or unauthorized request", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        List<UserResponse> result = ApiHelper.deserializeArray(responseBody,
                UserResponse[].class);
        return result;
    }

}