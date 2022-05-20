/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';

export interface TspublicRestV2MetadataHomeliveboardUnassignRequest {
  /** Name of the user */
  userName?: string;
  /** The GUID of the user */
  userId?: string;
}

export const tspublicRestV2MetadataHomeliveboardUnassignRequestSchema: Schema<TspublicRestV2MetadataHomeliveboardUnassignRequest> = object(
  {
    userName: ['userName', optional(string())],
    userId: ['userId', optional(string())],
  }
);
