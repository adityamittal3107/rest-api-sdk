/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, number, object, optional, Schema, string } from '../schema';
import { Type12Enum, type12EnumSchema } from './type12Enum';

export interface ApiRestV2MetadataDependencyRequest {
  /** Type of the data object */
  type: Type12Enum;
  /** A JSON array of GUIDs of the objects */
  id: string[];
  /**
   * The maximum number of batches to fetch in a query.
   *  If this attribute is not defined, then the list of all dependent objects is included in the response
   */
  batchSize?: number;
}

export const apiRestV2MetadataDependencyRequestSchema: Schema<ApiRestV2MetadataDependencyRequest> = object(
  {
    type: ['type', type12EnumSchema],
    id: ['id', array(string())],
    batchSize: ['batchSize', optional(number())],
  }
);
