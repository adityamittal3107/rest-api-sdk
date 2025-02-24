/*
 * ThoughtSpotPublicRESTAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import localhost.ApiHelper;
import localhost.Server;
import localhost.exceptions.ApiException;
import localhost.exceptions.ErrorResponseException;
import localhost.http.request.HttpMethod;
import localhost.models.GroupNameAndIDInput;
import localhost.models.StateEnum;
import localhost.models.TspublicRestV2UserAddgroupRequest;
import localhost.models.TspublicRestV2UserAddorgRequest;
import localhost.models.TspublicRestV2UserChangepasswordRequest;
import localhost.models.TspublicRestV2UserRemovegroupRequest;
import localhost.models.TspublicRestV2UserSearchRequest;
import localhost.models.TspublicRestV2UserUpdateRequest;
import localhost.models.Type8Enum;
import localhost.models.UserResponse;
import localhost.models.VisibilityEnum;

/**
 * This class lists all the endpoints of the groups.
 */
public final class UserController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public UserController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * To get the details of a specific user account by username or user id, use this endpoint. At
     * Least one value is needed. When both are given, user id will be considered to fetch user
     * information.
     * @param  name  Optional parameter: Username of the user that you want to query.
     * @param  id  Optional parameter: The GUID of the user account to query
     * @return    Returns the UserResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public UserResponse restapiV2GetUser(
            final String name,
            final String id) throws ApiException, IOException {
        return prepareRestapiV2GetUserRequest(name, id).execute();
    }

    /**
     * To get the details of a specific user account by username or user id, use this endpoint. At
     * Least one value is needed. When both are given, user id will be considered to fetch user
     * information.
     * @param  name  Optional parameter: Username of the user that you want to query.
     * @param  id  Optional parameter: The GUID of the user account to query
     * @return    Returns the UserResponse response from the API call
     */
    public CompletableFuture<UserResponse> restapiV2GetUserAsync(
            final String name,
            final String id) {
        try { 
            return prepareRestapiV2GetUserRequest(name, id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for restapiV2GetUser.
     */
    private ApiCall<UserResponse, ApiException> prepareRestapiV2GetUserRequest(
            final String name,
            final String id) throws IOException {
        return new ApiCall.Builder<UserResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/tspublic/rest/v2/user")
                        .queryParam(param -> param.key("name")
                                .value(name).isRequired(false))
                        .queryParam(param -> param.key("id")
                                .value(id).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, UserResponse.class))
                        .nullify404(false)
                        .localErrorCase("500",
                                 ErrorCase.create("Operation failed",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.PLAIN
))
                .build();
    }

    /**
     * To programmatically create a user account in the ThoughtSpot system use this API endpoint.
     * Using this API, you can create a user and assign groups. To create a user, you require admin
     * user privileges. All users created in the ThoughtSpot system are added to ALL_GROUP.
     * @param  name  Required parameter: Name of the user. The username string must be unique.
     * @param  displayName  Required parameter: A unique display name string for the user account,
     *         usually their first and last name
     * @param  password  Required parameter: Password for the user account.
     * @param  visibility  Optional parameter: Visibility of the user. The visibility attribute is
     *         set to DEFAULT when creating a user. The DEFAULT attribute makes a user visible to
     *         other users and user groups, and this allows them to share objects
     * @param  mail  Optional parameter: Email of the user account
     * @param  orgIds  Optional parameter: Array of org identifiers. If no value is provided then
     *         user will be created in the organization associated with the login session.
     * @param  groups  Optional parameter: Array of objects of groups that the user belong to.
     * @param  state  Optional parameter: Status of user account. acitve or inactive.
     * @param  notifyOnShare  Optional parameter: User preference for receiving email notifications
     *         when another ThoughtSpot user shares answers or pinboards.
     * @param  showWalkMe  Optional parameter: The user preference for revisiting the onboarding
     *         experience.
     * @param  analystOnboardingComplete  Optional parameter: ThoughtSpot provides an interactive
     *         guided walkthrough to onboard new users. The onboarding experience leads users
     *         through a set of actions to help users get started and accomplish their tasks
     *         quickly. The users can turn off the Onboarding experience and access it again when
     *         they need assistance with the ThoughtSpot UI.
     * @param  type  Optional parameter: Type of user. LOCAL_USER indicates that the user is created
     *         locally in the ThoughtSpot system.
     * @return    Returns the UserResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public UserResponse restapiV2CreateUser(
            final String name,
            final String displayName,
            final String password,
            final VisibilityEnum visibility,
            final String mail,
            final List<Integer> orgIds,
            final List<GroupNameAndIDInput> groups,
            final StateEnum state,
            final Boolean notifyOnShare,
            final Boolean showWalkMe,
            final Boolean analystOnboardingComplete,
            final Type8Enum type) throws ApiException, IOException {
        return prepareRestapiV2CreateUserRequest(name, displayName, password, visibility, mail,
                orgIds, groups, state, notifyOnShare, showWalkMe, analystOnboardingComplete,
                type).execute();
    }

    /**
     * To programmatically create a user account in the ThoughtSpot system use this API endpoint.
     * Using this API, you can create a user and assign groups. To create a user, you require admin
     * user privileges. All users created in the ThoughtSpot system are added to ALL_GROUP.
     * @param  name  Required parameter: Name of the user. The username string must be unique.
     * @param  displayName  Required parameter: A unique display name string for the user account,
     *         usually their first and last name
     * @param  password  Required parameter: Password for the user account.
     * @param  visibility  Optional parameter: Visibility of the user. The visibility attribute is
     *         set to DEFAULT when creating a user. The DEFAULT attribute makes a user visible to
     *         other users and user groups, and this allows them to share objects
     * @param  mail  Optional parameter: Email of the user account
     * @param  orgIds  Optional parameter: Array of org identifiers. If no value is provided then
     *         user will be created in the organization associated with the login session.
     * @param  groups  Optional parameter: Array of objects of groups that the user belong to.
     * @param  state  Optional parameter: Status of user account. acitve or inactive.
     * @param  notifyOnShare  Optional parameter: User preference for receiving email notifications
     *         when another ThoughtSpot user shares answers or pinboards.
     * @param  showWalkMe  Optional parameter: The user preference for revisiting the onboarding
     *         experience.
     * @param  analystOnboardingComplete  Optional parameter: ThoughtSpot provides an interactive
     *         guided walkthrough to onboard new users. The onboarding experience leads users
     *         through a set of actions to help users get started and accomplish their tasks
     *         quickly. The users can turn off the Onboarding experience and access it again when
     *         they need assistance with the ThoughtSpot UI.
     * @param  type  Optional parameter: Type of user. LOCAL_USER indicates that the user is created
     *         locally in the ThoughtSpot system.
     * @return    Returns the UserResponse response from the API call
     */
    public CompletableFuture<UserResponse> restapiV2CreateUserAsync(
            final String name,
            final String displayName,
            final String password,
            final VisibilityEnum visibility,
            final String mail,
            final List<Integer> orgIds,
            final List<GroupNameAndIDInput> groups,
            final StateEnum state,
            final Boolean notifyOnShare,
            final Boolean showWalkMe,
            final Boolean analystOnboardingComplete,
            final Type8Enum type) {
        try { 
            return prepareRestapiV2CreateUserRequest(name, displayName, password, visibility, mail, orgIds,
            groups, state, notifyOnShare, showWalkMe, analystOnboardingComplete,
            type).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for restapiV2CreateUser.
     */
    private ApiCall<UserResponse, ApiException> prepareRestapiV2CreateUserRequest(
            final String name,
            final String displayName,
            final String password,
            final VisibilityEnum visibility,
            final String mail,
            final List<Integer> orgIds,
            final List<GroupNameAndIDInput> groups,
            final StateEnum state,
            final Boolean notifyOnShare,
            final Boolean showWalkMe,
            final Boolean analystOnboardingComplete,
            final Type8Enum type) throws IOException {
        return new ApiCall.Builder<UserResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/tspublic/rest/v2/user/create")
                        .queryParam(param -> param.key("name")
                                .value(name))
                        .queryParam(param -> param.key("displayName")
                                .value(displayName))
                        .queryParam(param -> param.key("password")
                                .value(password))
                        .queryParam(param -> param.key("visibility")
                                .value((visibility != null) ? visibility.value() : null).isRequired(false))
                        .queryParam(param -> param.key("mail")
                                .value(mail).isRequired(false))
                        .queryParam(param -> param.key("orgIds")
                                .value(orgIds).isRequired(false))
                        .queryParam(param -> param.key("groups")
                                .value(groups).isRequired(false))
                        .queryParam(param -> param.key("state")
                                .value((state != null) ? state.value() : null).isRequired(false))
                        .queryParam(param -> param.key("notifyOnShare")
                                .value(notifyOnShare).isRequired(false))
                        .queryParam(param -> param.key("showWalkMe")
                                .value(showWalkMe).isRequired(false))
                        .queryParam(param -> param.key("analystOnboardingComplete")
                                .value(analystOnboardingComplete).isRequired(false))
                        .queryParam(param -> param.key("type")
                                .value((type != null) ? type.value() : null).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, UserResponse.class))
                        .nullify404(false)
                        .localErrorCase("500",
                                 ErrorCase.create("Operation failed",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.PLAIN
))
                .build();
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
    public Boolean restapiV2UpdateUser(
            final TspublicRestV2UserUpdateRequest body) throws ApiException, IOException {
        return prepareRestapiV2UpdateUserRequest(body).execute();
    }

    /**
     * You can use this endpoint to programmatically modify an existing user account. To modify a
     * user, you require admin user privileges. At least one of User Id or username is mandatory.
     * When both are given, then user id will be considered and username will be updated.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> restapiV2UpdateUserAsync(
            final TspublicRestV2UserUpdateRequest body) {
        try { 
            return prepareRestapiV2UpdateUserRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for restapiV2UpdateUser.
     */
    private ApiCall<Boolean, ApiException> prepareRestapiV2UpdateUserRequest(
            final TspublicRestV2UserUpdateRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Boolean, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/tspublic/rest/v2/user/update")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> Boolean.parseBoolean(response))
                        .nullify404(false)
                        .localErrorCase("500",
                                 ErrorCase.create("Operation failed",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.PLAIN
))
                .build();
    }

    /**
     * To remove a user from the ThoughtSpot system, use this endpoint. At Least one value needed.
     * When both are given user id will be considered to delete user.
     * @param  name  Optional parameter: Username of the user that you want to query.
     * @param  id  Optional parameter: The GUID of the user account to query
     * @param  orgId  Optional parameter: Unique identifier of the organization from which the user
     *         would be deleted. If no value is provided then user will be deleted from the
     *         organization associated with the login session.
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean restapiV2DeleteUser(
            final String name,
            final String id,
            final Integer orgId) throws ApiException, IOException {
        return prepareRestapiV2DeleteUserRequest(name, id, orgId).execute();
    }

    /**
     * To remove a user from the ThoughtSpot system, use this endpoint. At Least one value needed.
     * When both are given user id will be considered to delete user.
     * @param  name  Optional parameter: Username of the user that you want to query.
     * @param  id  Optional parameter: The GUID of the user account to query
     * @param  orgId  Optional parameter: Unique identifier of the organization from which the user
     *         would be deleted. If no value is provided then user will be deleted from the
     *         organization associated with the login session.
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> restapiV2DeleteUserAsync(
            final String name,
            final String id,
            final Integer orgId) {
        try { 
            return prepareRestapiV2DeleteUserRequest(name, id, orgId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for restapiV2DeleteUser.
     */
    private ApiCall<Boolean, ApiException> prepareRestapiV2DeleteUserRequest(
            final String name,
            final String id,
            final Integer orgId) throws IOException {
        return new ApiCall.Builder<Boolean, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/tspublic/rest/v2/user/delete")
                        .queryParam(param -> param.key("name")
                                .value(name).isRequired(false))
                        .queryParam(param -> param.key("id")
                                .value(id).isRequired(false))
                        .queryParam(param -> param.key("orgId")
                                .value(orgId).isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> Boolean.parseBoolean(response))
                        .nullify404(false)
                        .localErrorCase("500",
                                 ErrorCase.create("Operation failed",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.PLAIN
))
                .build();
    }

    /**
     * To programmatically add groups to an existing ThoughtSpot user use this endpoint. When you
     * assign groups to a user, the user inherits the privileges assigned to those groups. At least
     * one of User Id or username is mandatory. When both are given, then user id will be
     * considered.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean restapiV2AddUserToGroups(
            final TspublicRestV2UserAddgroupRequest body) throws ApiException, IOException {
        return prepareRestapiV2AddUserToGroupsRequest(body).execute();
    }

    /**
     * To programmatically add groups to an existing ThoughtSpot user use this endpoint. When you
     * assign groups to a user, the user inherits the privileges assigned to those groups. At least
     * one of User Id or username is mandatory. When both are given, then user id will be
     * considered.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> restapiV2AddUserToGroupsAsync(
            final TspublicRestV2UserAddgroupRequest body) {
        try { 
            return prepareRestapiV2AddUserToGroupsRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for restapiV2AddUserToGroups.
     */
    private ApiCall<Boolean, ApiException> prepareRestapiV2AddUserToGroupsRequest(
            final TspublicRestV2UserAddgroupRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Boolean, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/tspublic/rest/v2/user/addgroup")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> Boolean.parseBoolean(response))
                        .nullify404(false)
                        .localErrorCase("500",
                                 ErrorCase.create("Operation failed",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.PLAIN
))
                .build();
    }

    /**
     * To programmatically remove groups from an existing ThoughtSpot user, use this API endpoint.
     * The API removes only the user association. It does not delete the user or group from the
     * Thoughtspot system At least one of User Id or username is mandatory. When both are given,
     * then user id will be considered.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean restapiV2RemoveUserFromGroups(
            final TspublicRestV2UserRemovegroupRequest body) throws ApiException, IOException {
        return prepareRestapiV2RemoveUserFromGroupsRequest(body).execute();
    }

    /**
     * To programmatically remove groups from an existing ThoughtSpot user, use this API endpoint.
     * The API removes only the user association. It does not delete the user or group from the
     * Thoughtspot system At least one of User Id or username is mandatory. When both are given,
     * then user id will be considered.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> restapiV2RemoveUserFromGroupsAsync(
            final TspublicRestV2UserRemovegroupRequest body) {
        try { 
            return prepareRestapiV2RemoveUserFromGroupsRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for restapiV2RemoveUserFromGroups.
     */
    private ApiCall<Boolean, ApiException> prepareRestapiV2RemoveUserFromGroupsRequest(
            final TspublicRestV2UserRemovegroupRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Boolean, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/tspublic/rest/v2/user/removegroup")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> Boolean.parseBoolean(response))
                        .nullify404(false)
                        .localErrorCase("500",
                                 ErrorCase.create("Operation failed",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.PLAIN
))
                .build();
    }

    /**
     * To get the details of a specific user account or all users in the ThoughtSpot system use this
     * end point.
     * @param  body  Required parameter: Example:
     * @return    Returns the Object response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Object restapiV2SearchUsers(
            final TspublicRestV2UserSearchRequest body) throws ApiException, IOException {
        return prepareRestapiV2SearchUsersRequest(body).execute();
    }

    /**
     * To get the details of a specific user account or all users in the ThoughtSpot system use this
     * end point.
     * @param  body  Required parameter: Example:
     * @return    Returns the Object response from the API call
     */
    public CompletableFuture<Object> restapiV2SearchUsersAsync(
            final TspublicRestV2UserSearchRequest body) {
        try { 
            return prepareRestapiV2SearchUsersRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for restapiV2SearchUsers.
     */
    private ApiCall<Object, ApiException> prepareRestapiV2SearchUsersRequest(
            final TspublicRestV2UserSearchRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Object, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/tspublic/rest/v2/user/search")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> response)
                        .nullify404(false)
                        .localErrorCase("500",
                                 ErrorCase.create("Operation failed",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.PLAIN
))
                .build();
    }

    /**
     * To change the password of a ThoughtSpot user account, use this endpoint. At least one of id
     * or name of user is required. When both are given user id will be considered.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean restapiV2ChangePasswordOfUser(
            final TspublicRestV2UserChangepasswordRequest body) throws ApiException, IOException {
        return prepareRestapiV2ChangePasswordOfUserRequest(body).execute();
    }

    /**
     * To change the password of a ThoughtSpot user account, use this endpoint. At least one of id
     * or name of user is required. When both are given user id will be considered.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> restapiV2ChangePasswordOfUserAsync(
            final TspublicRestV2UserChangepasswordRequest body) {
        try { 
            return prepareRestapiV2ChangePasswordOfUserRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for restapiV2ChangePasswordOfUser.
     */
    private ApiCall<Boolean, ApiException> prepareRestapiV2ChangePasswordOfUserRequest(
            final TspublicRestV2UserChangepasswordRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Boolean, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/tspublic/rest/v2/user/changepassword")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> Boolean.parseBoolean(response))
                        .nullify404(false)
                        .localErrorCase("500",
                                 ErrorCase.create("Operation failed",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.PLAIN
))
                .build();
    }

    /**
     * To programmatically add existing ThoughtSpot users to an organization, use this API endpoint.
     * At least one of id or name of the organization is required. When both are given, then
     * organization id will be considered. Requires Administration access for the organization to
     * which users need to be added.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean restapiV2AddUserToOrgs(
            final TspublicRestV2UserAddorgRequest body) throws ApiException, IOException {
        return prepareRestapiV2AddUserToOrgsRequest(body).execute();
    }

    /**
     * To programmatically add existing ThoughtSpot users to an organization, use this API endpoint.
     * At least one of id or name of the organization is required. When both are given, then
     * organization id will be considered. Requires Administration access for the organization to
     * which users need to be added.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> restapiV2AddUserToOrgsAsync(
            final TspublicRestV2UserAddorgRequest body) {
        try { 
            return prepareRestapiV2AddUserToOrgsRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for restapiV2AddUserToOrgs.
     */
    private ApiCall<Boolean, ApiException> prepareRestapiV2AddUserToOrgsRequest(
            final TspublicRestV2UserAddorgRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Boolean, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/tspublic/rest/v2/user/addorg")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> Boolean.parseBoolean(response))
                        .nullify404(false)
                        .localErrorCase("500",
                                 ErrorCase.create("Operation failed",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.PLAIN
))
                .build();
    }
}