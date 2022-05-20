/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { ApiResponse, RequestOptions } from '../core';
import { ErrorResponseError } from '../errors/errorResponseError';
import {
  SessionLoginResponse,
  sessionLoginResponseSchema,
} from '../models/sessionLoginResponse';
import {
  TspublicRestV2SessionGettokenRequest,
  tspublicRestV2SessionGettokenRequestSchema,
} from '../models/tspublicRestV2SessionGettokenRequest';
import {
  TspublicRestV2SessionLoginRequest,
  tspublicRestV2SessionLoginRequestSchema,
} from '../models/tspublicRestV2SessionLoginRequest';
import { boolean, unknown } from '../schema';
import { BaseController } from './baseController';

export class SessionController extends BaseController {
  /**
   * To get session object information, use this endpoint
   *
   * @return Response from the API call
   */
  async getSessionInfo(
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<unknown>> {
    const req = this.createRequest('GET', '/tspublic/rest/v2/session');
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(unknown(), requestOptions);
  }

  /**
   * You can programmatically create login session for a user in ThoughtSpot using this endpoint.
   *
   * You can create session by either providing userName and password as inputs in this request body or
   * by including "Authorization" header with the token generated through the endpoint
   * /tspublic/rest/v2/session/getToken.
   *
   * userName and password input is given precedence over "Authorization" header, when both are included
   * in the request.
   *
   * @param body
   * @return Response from the API call
   */
  async login(
    body: TspublicRestV2SessionLoginRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<SessionLoginResponse>> {
    const req = this.createRequest('POST', '/tspublic/rest/v2/session/login');
    const mapped = req.prepareArgs({
      body: [body, tspublicRestV2SessionLoginRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(sessionLoginResponseSchema, requestOptions);
  }

  /**
   * To log a user out of the current session, use this endpoint
   *
   * @return Response from the API call
   */
  async logout(
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest('POST', '/tspublic/rest/v2/session/logout');
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    req.authenticate(false);
    return req.callAsJson(boolean(), requestOptions);
  }

  /**
   * To programmatically create session token for a user in ThoughtSpot, use this endpoint.
   *
   * You can generate the token for a user by providing password or secret key from the cluster.
   *
   * You need to enable trusted authentication to generate secret key. To generate secret key, follow
   * below steps.
   *
   * 1. Click the Develop tab.
   *
   * 2. Under Customizations, click Settings.
   *
   * 3. To enable trusted authentication, turn on the toggle.
   *
   * 4. A secret_key for trusted authentication is generated.
   *
   * 5. Click the clipboard icon to copy the token.
   *
   *
   *
   * Password is given precedence over secretKey input, when both are included in the request.
   *
   * @param body
   * @return Response from the API call
   */
  async getToken(
    body: TspublicRestV2SessionGettokenRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<SessionLoginResponse>> {
    const req = this.createRequest(
      'POST',
      '/tspublic/rest/v2/session/gettoken'
    );
    const mapped = req.prepareArgs({
      body: [body, tspublicRestV2SessionGettokenRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    req.authenticate(false);
    return req.callAsJson(sessionLoginResponseSchema, requestOptions);
  }

  /**
   * To expire or revoke a token for a user, use this endpoint
   *
   * @return Response from the API call
   */
  async revokeToken(
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest(
      'POST',
      '/tspublic/rest/v2/session/revoketoken'
    );
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(boolean(), requestOptions);
  }
}
