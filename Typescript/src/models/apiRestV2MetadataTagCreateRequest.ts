/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';

export interface ApiRestV2MetadataTagCreateRequest {
  /** Name of the tag */
  name: string;
  /** Hex color code to be assigned to the tag */
  color?: string;
}

export const apiRestV2MetadataTagCreateRequestSchema: Schema<ApiRestV2MetadataTagCreateRequest> = object(
  { name: ['name', string()], color: ['color', optional(string())] }
);
