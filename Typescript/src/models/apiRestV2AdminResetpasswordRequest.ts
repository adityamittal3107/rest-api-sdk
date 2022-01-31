/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';

export interface ApiRestV2AdminResetpasswordRequest {
  /** User name of the user account. */
  name?: string;
  /** The GUID of the user account to query. */
  id?: string;
  /** A new password for the user. */
  newPassword: string;
}

export const apiRestV2AdminResetpasswordRequestSchema: Schema<ApiRestV2AdminResetpasswordRequest> = object(
  {
    name: ['name', optional(string())],
    id: ['id', optional(string())],
    newPassword: ['newPassword', string()],
  }
);
