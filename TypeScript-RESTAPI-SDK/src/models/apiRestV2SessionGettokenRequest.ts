/**
 * TS Public RestAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';

export interface ApiRestV2SessionGettokenRequest {
  /** Username of the user account */
  userName: string;
  /** The password of the user account */
  password: string;
  /** Provide the time duration in milliseconds to expire the token. If no input is provided then the value set at cluster level will be considered */
  expiryTimeMs?: string;
}

export const apiRestV2SessionGettokenRequestSchema: Schema<ApiRestV2SessionGettokenRequest> = object(
  {
    userName: ['userName', string()],
    password: ['password', string()],
    expiryTimeMs: ['expiryTimeMs', optional(string())],
  }
);
