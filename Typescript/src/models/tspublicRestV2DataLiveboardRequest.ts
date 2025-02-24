/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, number, object, optional, Schema, string } from '../schema';
import { FormatTypeEnum, formatTypeEnumSchema } from './formatTypeEnum';

export interface TspublicRestV2DataLiveboardRequest {
  /**
   * The offset point, starting from where the records should be included in the response.
   * If no input is provided then offset starts from 0.
   */
  offset?: number;
  /**
   * An alternate way to set offset for the starting point of the response.
   * The value in offset field will not be considered if batchNumber field has value greater than 0.
   * Offset value will be calculated as (batchNumber - 1) * batchSize.
   * It is mandatory to provide a value for batchSize with batchNumber.
   * Example:
   * Assume response has 100 records. Now,  batchNumber is set as 2 and batchSize as 10, then offset value will be 10. So, 10 records starting from 11th record will be considered.
   */
  batchNumber?: number;
  /**
   * The number of records that should be included in the response starting from offset position.
   * If no input is provided, then all records starting from the value provided in offset is included in the response
   */
  batchSize?: number;
  /** The GUID of the Liveboard */
  id?: string;
  /** If you have embedded ThoughtSpot in your host application, and you want to download Liveboard data with unsaved changes then, pass the transient content from the browser fetch request, using the getExportRequestForCurrentPinboard method. For more information, see https://developers.thoughtspot.com/docs/?pageid=liveboard-export-api#transient-pinboard . If value for this field is provided, then id will not be considered. */
  transientContent?: string;
  /** A JSON array of GUIDs of the visualizations in the Liveboard. */
  vizId?: string[];
  /**
   * JSON object which contains filter condition to filter the data at the time of data retrieval.
   * Example: {"col1":"region","op1":"EQ","val1":"northeast","col2":"date","op2":"BET","val2":["1625126400000","1625126400000"]}
   * For more information, see https://developers.thoughtspot.com/docs/?pageid=runtime-filters
   */
  runtimeFilter?: string;
  /**
   * JSON object which provides columns to sort the data at the time of data retrieval.
   * Example: {"sortCol1":"region","asc1":true,"sortCol2":"date"}
   * For more information, see https://developers.thoughtspot.com/docs/?pageid=runtime-filters.
   */
  runtimeSort?: string;
  /**
   * The format of the data in the response.
   * FULL: The response comes in "column":"value" format.
   * COMPACT: The response includes only the value of the columns.
   */
  formatType?: FormatTypeEnum;
}

export const tspublicRestV2DataLiveboardRequestSchema: Schema<TspublicRestV2DataLiveboardRequest> = object(
  {
    offset: ['offset', optional(number())],
    batchNumber: ['batchNumber', optional(number())],
    batchSize: ['batchSize', optional(number())],
    id: ['id', optional(string())],
    transientContent: ['transientContent', optional(string())],
    vizId: ['vizId', optional(array(string()))],
    runtimeFilter: ['runtimeFilter', optional(string())],
    runtimeSort: ['runtimeSort', optional(string())],
    formatType: ['formatType', optional(formatTypeEnumSchema)],
  }
);
