/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { ApiResponse, RequestOptions } from '../core';
import { ErrorResponseError } from '../errors/errorResponseError';
import {
  TspublicRestV2UserAddgroupRequest,
  tspublicRestV2UserAddgroupRequestSchema,
} from '../models/tspublicRestV2UserAddgroupRequest';
import {
  TspublicRestV2UserChangepasswordRequest,
  tspublicRestV2UserChangepasswordRequestSchema,
} from '../models/tspublicRestV2UserChangepasswordRequest';
import {
  TspublicRestV2UserCreateRequest,
  tspublicRestV2UserCreateRequestSchema,
} from '../models/tspublicRestV2UserCreateRequest';
import {
  TspublicRestV2UserRemovegroupRequest,
  tspublicRestV2UserRemovegroupRequestSchema,
} from '../models/tspublicRestV2UserRemovegroupRequest';
import {
  TspublicRestV2UserSearchRequest,
  tspublicRestV2UserSearchRequestSchema,
} from '../models/tspublicRestV2UserSearchRequest';
import {
  TspublicRestV2UserUpdateRequest,
  tspublicRestV2UserUpdateRequestSchema,
} from '../models/tspublicRestV2UserUpdateRequest';
import { UserResponse, userResponseSchema } from '../models/userResponse';
import { boolean, optional, string, unknown } from '../schema';
import { BaseController } from './baseController';

export class UserController extends BaseController {
  /**
   * To get the details of a specific user account by username or user id, use this endpoint. At Least
   * one value is needed. When both are given,then user id will be considered to fetch user information
   *
   * Permission: Requires administration privilege
   *
   * @param name Username of the user that you want to query
   * @param id   The GUID of the user account to query
   * @return Response from the API call
   */
  async getUser(
    name?: string,
    id?: string,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<UserResponse>> {
    const req = this.createRequest('GET', '/tspublic/rest/v2/user');
    const mapped = req.prepareArgs({
      name: [name, optional(string())],
      id: [id, optional(string())],
    });
    req.query('name', mapped.name);
    req.query('id', mapped.id);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(userResponseSchema, requestOptions);
  }

  /**
   * To programmatically create a user account in the ThoughtSpot system, use this API endpoint.
   *
   * Using this API, you can create a user and assign groups. To create a user, you require admin user
   * privileges.
   *
   * All users created in the ThoughtSpot system are added to ALL_GROUP
   *
   * Permission: Requires administration privilege
   *
   * @param body
   * @return Response from the API call
   */
  async createUser(
    body: TspublicRestV2UserCreateRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<UserResponse>> {
    const req = this.createRequest('POST', '/tspublic/rest/v2/user/create');
    const mapped = req.prepareArgs({
      body: [body, tspublicRestV2UserCreateRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(userResponseSchema, requestOptions);
  }

  /**
   * You can use this endpoint to programmatically modify an existing user account.
   *
   * To modify a user, you require admin user privileges.
   *
   * At least one of User Id or username is mandatory. When both are given, then user id will be
   * considered and username will be updated
   *
   * Permission: Requires administration privilege
   *
   * @param body
   * @return Response from the API call
   */
  async updateUser(
    body: TspublicRestV2UserUpdateRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest('PUT', '/tspublic/rest/v2/user/update');
    const mapped = req.prepareArgs({
      body: [body, tspublicRestV2UserUpdateRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(boolean(), requestOptions);
  }

  /**
   * To remove a user from the ThoughtSpot system, use this endpoint.
   *
   * At least one value is needed. When both are given, then user id will be considered to delete user.
   *
   * Permission: Requires administration privilege
   *
   * @param name Username of the user account
   * @param id   The GUID of the user account
   * @return Response from the API call
   */
  async deleteUser(
    name?: string,
    id?: string,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest('DELETE', '/tspublic/rest/v2/user/delete');
    const mapped = req.prepareArgs({
      name: [name, optional(string())],
      id: [id, optional(string())],
    });
    req.query('name', mapped.name);
    req.query('id', mapped.id);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(boolean(), requestOptions);
  }

  /**
   * To programmatically add groups to an existing ThoughtSpot user, use this endpoint.
   *
   * When you assign groups to a user, the user inherits the privileges assigned to those groups.
   *
   * At least one of user Id or username is mandatory. When both are given, then user id will be
   * considered.
   *
   * Permission: Requires administration privilege
   *
   * @param body
   * @return Response from the API call
   */
  async addGroupsToUser(
    body: TspublicRestV2UserAddgroupRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest('PUT', '/tspublic/rest/v2/user/addgroup');
    const mapped = req.prepareArgs({
      body: [body, tspublicRestV2UserAddgroupRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(boolean(), requestOptions);
  }

  /**
   * To programmatically remove groups from an existing ThoughtSpot user, use this API endpoint.
   *
   * The API removes only the user association. It does not delete the user or group from the
   * Thoughtspot system.
   *
   * At least one of user id or username is mandatory. When both are given, then user id will be
   * considered.
   *
   * Permission: Requires administration privilege
   *
   * @param body
   * @return Response from the API call
   */
  async removeGroupsFromUser(
    body: TspublicRestV2UserRemovegroupRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest('PUT', '/tspublic/rest/v2/user/removegroup');
    const mapped = req.prepareArgs({
      body: [body, tspublicRestV2UserRemovegroupRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(boolean(), requestOptions);
  }

  /**
   * To change the password of a ThoughtSpot user account, use this endpoint.
   *
   * At least one of id or name of user is required. When both are given user id will be considered.
   *
   * Permission: Requires administration privilege
   *
   * @param body
   * @return Response from the API call
   */
  async changePasswordOfUser(
    body: TspublicRestV2UserChangepasswordRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest(
      'PUT',
      '/tspublic/rest/v2/user/changepassword'
    );
    const mapped = req.prepareArgs({
      body: [body, tspublicRestV2UserChangepasswordRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(boolean(), requestOptions);
  }

  /**
   * To get the details of a specific user account or all users in the ThoughtSpot system, use this
   * endpoint. If no input is provided, then all user are included in the response.
   *
   * Permission: Requires administration privilege
   *
   * @param body
   * @return Response from the API call
   */
  async searchUsers(
    body: TspublicRestV2UserSearchRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<unknown>> {
    const req = this.createRequest('POST', '/tspublic/rest/v2/user/search');
    const mapped = req.prepareArgs({
      body: [body, tspublicRestV2UserSearchRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(unknown(), requestOptions);
  }
}
