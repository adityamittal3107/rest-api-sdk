/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { ApiResponse, RequestOptions } from '../core';
import { ErrorResponseError } from '../errors/errorResponseError';
import {
  AccessLevelEnum,
  accessLevelEnumSchema,
} from '../models/accessLevelEnum';
import {
  SessionLoginResponse,
  sessionLoginResponseSchema,
} from '../models/sessionLoginResponse';
import { boolean, optional, string } from '../schema';
import { BaseController } from './baseController';

export class SessionController extends BaseController {
  /**
   * You can programmatically create login session for a user in ThoughtSpot using this endpoint.
   *
   * You can create session by either providing userName and password as inputs in this request body or
   * by including "Authorization" header with the token generated through the endpoint
   * /tspublic/rest/v2/session/gettoken.
   *
   * userName and password input is given precedence over "Authorization" header, when both are included
   * in the request.
   *
   * @param userName   Username of the user account
   * @param password   The password of the user account
   * @param rememberMe A flag to remember the user session. When set to true, sets a session cookie that
   *                              persists in subsequent API calls.
   * @return Response from the API call
   */
  async restapiV2Login(
    userName?: string,
    password?: string,
    rememberMe?: boolean,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<SessionLoginResponse>> {
    const req = this.createRequest('GET', '/tspublic/rest/v2/session/login');
    const mapped = req.prepareArgs({
      userName: [userName, optional(string())],
      password: [password, optional(string())],
      rememberMe: [rememberMe, optional(boolean())],
    });
    req.query('userName', mapped.userName);
    req.query('password', mapped.password);
    req.query('rememberMe', mapped.rememberMe);
    req.throwOn(500, ErrorResponseError, 'Operation failed');
    return req.callAsJson(sessionLoginResponseSchema, requestOptions);
  }

  /**
   * To programmatically create session token for a user in ThoughtSpot, use this endpoint.
   *
   * You can generate the token for a user by providing password or secret key from the cluster.
   *
   * You need to enable trusted authentication to generate secret key. To generate secret key, follow
   * below steps.
   *
   *
   * 1. Click the Develop tab.
   *
   *
   * 2. Under Customizations, click Settings.
   *
   *
   * 3. To enable trusted authentication, turn on the toggle.
   *
   *
   * 4. A secret_key for trusted authentication is generated.
   *
   *
   * 5. Click the clipboard icon to copy the token.
   *
   *
   *
   *
   * Password is given precedence over secretKey input, when both are included in the request.
   *
   * @param userName            Username of the user account
   * @param password            The password of the user account
   * @param secretKey           The secret key string provided by the ThoughtSpot application
   *                                               server. ThoughtSpot generates this secret key when you enable
   *                                               trusted authentication.
   * @param accessLevel         User access privilege.   FULL - Creates a session with full access.
   *                                               REPORT_BOOK_VIEW - Allow view access to the specified
   *                                               visualizations.
   * @param tsObjectId          GUID of the ThoughtSpot object. If you have set the accessLevel
   *                                               attribute to REPORT_BOOK_VIEW, specify the GUID of the Liveboard or
   *                                               visualization object.
   * @param tokenExpiryDuration Duration in seconds after which the token expires
   * @param orgId               Id of the organization to be associated with the user login. If no
   *                                               input is provided then last logged in organization will be
   *                                               considered
   * @return Response from the API call
   */
  async restapiV2GetToken(
    userName: string,
    password?: string,
    secretKey?: string,
    accessLevel?: AccessLevelEnum,
    tsObjectId?: string,
    tokenExpiryDuration?: string,
    orgId?: string,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<SessionLoginResponse>> {
    const req = this.createRequest('GET', '/tspublic/rest/v2/session/gettoken');
    const mapped = req.prepareArgs({
      userName: [userName, string()],
      password: [password, optional(string())],
      secretKey: [secretKey, optional(string())],
      accessLevel: [accessLevel, optional(accessLevelEnumSchema)],
      tsObjectId: [tsObjectId, optional(string())],
      tokenExpiryDuration: [tokenExpiryDuration, optional(string())],
      orgId: [orgId, optional(string())],
    });
    req.query('userName', mapped.userName);
    req.query('password', mapped.password);
    req.query('secretKey', mapped.secretKey);
    req.query('accessLevel', mapped.accessLevel);
    req.query('tsObjectId', mapped.tsObjectId);
    req.query('tokenExpiryDuration', mapped.tokenExpiryDuration);
    req.query('orgId', mapped.orgId);
    req.throwOn(500, ErrorResponseError, 'Operation failed');
    return req.callAsJson(sessionLoginResponseSchema, requestOptions);
  }
}
