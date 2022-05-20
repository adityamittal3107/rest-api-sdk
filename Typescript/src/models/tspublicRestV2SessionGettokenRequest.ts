/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';
import {
  GetTokenAccessLevelEnum,
  getTokenAccessLevelEnumSchema,
} from './getTokenAccessLevelEnum';

export interface TspublicRestV2SessionGettokenRequest {
  /** Username of the user account */
  userName: string;
  /** The password of the user account */
  password?: string;
  /** The secret key string provided by the ThoughtSpot application server. ThoughtSpot generates this secret key when you enable trusted authentication. */
  secretKey?: string;
  /**
   * User access privilege.
   *  FULL - Creates a session with full access.
   *  REPORT_BOOK_VIEW - Allow view access to the specified visualizations.
   */
  accessLevel?: GetTokenAccessLevelEnum;
  /** GUID of the ThoughtSpot object. If you have set the accessLevel attribute to REPORT_BOOK_VIEW, specify the GUID of the Liveboard or visualization object. */
  tsObjectId?: string;
  /** Provide duration in seconds after which the token should expire */
  tokenExpiryDuration?: string;
}

export const tspublicRestV2SessionGettokenRequestSchema: Schema<TspublicRestV2SessionGettokenRequest> = object(
  {
    userName: ['userName', string()],
    password: ['password', optional(string())],
    secretKey: ['secretKey', optional(string())],
    accessLevel: ['accessLevel', optional(getTokenAccessLevelEnumSchema)],
    tsObjectId: ['tsObjectId', optional(string())],
    tokenExpiryDuration: ['tokenExpiryDuration', optional(string())],
  }
);
