/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';

export interface TspublicRestV2AdminConfigurationUpdateRequest {
  /**
   * A JSON file with the key-value pair of configuration attributes to be updated.
   * Example: {"defaultChartDataSize": 5000}
   */
  configuration?: string;
}

export const tspublicRestV2AdminConfigurationUpdateRequestSchema: Schema<TspublicRestV2AdminConfigurationUpdateRequest> = object(
  { configuration: ['configuration', optional(string())] }
);
