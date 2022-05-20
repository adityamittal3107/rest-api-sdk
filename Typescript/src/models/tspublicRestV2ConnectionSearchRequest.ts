/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import {
  array,
  lazy,
  number,
  object,
  optional,
  Schema,
  string,
} from '../schema';
import {
  SearchConnectionSortByEnum,
  searchConnectionSortByEnumSchema,
} from './searchConnectionSortByEnum';
import {
  SearchConnectionSortOrderEnum,
  searchConnectionSortOrderEnumSchema,
} from './searchConnectionSortOrderEnum';
import {
  SearchConnectionTypeEnum,
  searchConnectionTypeEnumSchema,
} from './searchConnectionTypeEnum';
import {
  TagNameAndIdInput,
  tagNameAndIdInputSchema,
} from './tagNameAndIdInput';

export interface TspublicRestV2ConnectionSearchRequest {
  /**
   * The offset point, starting from where the records should be included in the response.
   *  If no input is provided then offset starts from 0.
   */
  offset?: number;
  /**
   * An alternate way to set offset for the starting point of the response.
   *  The value in offset field will not be considered if batchNumber field has value greater than 0.
   *  Offset value will be calculated as (batchNumber - 1) * batchSize.
   *  It is mandatory to provide a value for batchSize with batchNumber.
   */
  batchNumber?: number;
  /** The number of records that should be included in the response starting from offset position. If no input is provided, then all records starting from the value provided in offset is included in the response. */
  batchSize?: number;
  /** Field based on which the response needs to be ordered. */
  sortBy?: SearchConnectionSortByEnum;
  /** Order in which sortBy should be applied. */
  sortOrder?: SearchConnectionSortOrderEnum;
  /** Type of the connect being searched. Valid values: */
  type: SearchConnectionTypeEnum;
  /** A pattern to match the name of the connection. This parameter supports matching case-insensitive strings. For a wildcard match, use %. */
  namePattern?: string;
  /** A JSON array containing the GUIDs of the connections that you want to fetch. */
  fetchId?: string[];
  /** A JSON array containing the GUIDs of the connections that you want to skip. */
  skipId?: string[];
  /** A JSON array of name or GUID of tags or both. When both are given then id is considered */
  tag?: TagNameAndIdInput[];
}

export const tspublicRestV2ConnectionSearchRequestSchema: Schema<TspublicRestV2ConnectionSearchRequest> = object(
  {
    offset: ['offset', optional(number())],
    batchNumber: ['batchNumber', optional(number())],
    batchSize: ['batchSize', optional(number())],
    sortBy: ['sortBy', optional(searchConnectionSortByEnumSchema)],
    sortOrder: ['sortOrder', optional(searchConnectionSortOrderEnumSchema)],
    type: ['type', searchConnectionTypeEnumSchema],
    namePattern: ['namePattern', optional(string())],
    fetchId: ['fetchId', optional(array(string()))],
    skipId: ['skipId', optional(array(string()))],
    tag: ['tag', optional(array(lazy(() => tagNameAndIdInputSchema)))],
  }
);
