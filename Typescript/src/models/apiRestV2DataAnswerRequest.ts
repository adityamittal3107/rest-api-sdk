/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { number, object, optional, Schema, string } from '../schema';
import { FormatType1Enum, formatType1EnumSchema } from './formatType1Enum';

export interface ApiRestV2DataAnswerRequest {
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
   *  Example:
   *  Assume response has 100 records. Now,  batchNumber is set as 2 and batchSize as 10, then offset value will be 10. So, 10 records starting from 11th record will be considered.
   */
  batchNumber?: number;
  /**
   * The number of records that should be included in the response starting from offset position.
   *  If no input is provided, then all records starting from the value provided in offset is included in the response.
   */
  batchSize?: number;
  /** The GUID of the Answer */
  id: string;
  /**
   * The format of the data in the response.
   *  FULL: The response comes in "column":"value" format.
   *  COMPACT: The response includes only the value of the columns.
   */
  formatType?: FormatType1Enum;
}

export const apiRestV2DataAnswerRequestSchema: Schema<ApiRestV2DataAnswerRequest> = object(
  {
    offset: ['offset', optional(number())],
    batchNumber: ['batchNumber', optional(number())],
    batchSize: ['batchSize', optional(number())],
    id: ['id', string()],
    formatType: ['formatType', optional(formatType1EnumSchema)],
  }
);
