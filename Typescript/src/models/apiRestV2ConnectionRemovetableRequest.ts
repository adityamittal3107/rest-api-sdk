/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, lazy, object, Schema, string } from '../schema';
import { TableInput, tableInputSchema } from './tableInput';

export interface ApiRestV2ConnectionRemovetableRequest {
  /** GUID of the connection */
  id: string;
  /**
   * A JSON array of name or GUIDs of the table or both.
   *  At least one input is required. Provide either table name or id. When both are given then id is considered
   */
  tables: TableInput[];
}

export const apiRestV2ConnectionRemovetableRequestSchema: Schema<ApiRestV2ConnectionRemovetableRequest> = object(
  {
    id: ['id', string()],
    tables: ['tables', array(lazy(() => tableInputSchema))],
  }
);
