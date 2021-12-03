/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';

export interface ApiRestV2SessionGettokenRequest {
  /** Username of the user account */
  userName: string;
  /** The password of the user account */
  password: string;
  /** Provide duration in seconds after which the token should expire */
  tokenExpiryDuration?: string;
}

export const apiRestV2SessionGettokenRequestSchema: Schema<ApiRestV2SessionGettokenRequest> = object(
  {
    userName: ['userName', string()],
    password: ['password', string()],
    tokenExpiryDuration: ['tokenExpiryDuration', optional(string())],
  }
);
