/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, lazy, object, optional, Schema, string } from '../schema';
import {
  ConnectionTableColumnsInput,
  connectionTableColumnsInputSchema,
} from './connectionTableColumnsInput';

export interface TspublicRestV2ConnectionTablecoloumnRequest {
  /** The GUID of the connection */
  id: string;
  /**
   * A JSON object of the connection metadata. If this field is left empty, then the configuration saved in the connection is considered.
   * To get the tables based on a different configuration, include required attributes in the connection configuration JSON.
   * Example:
   *    Get tables from Snowflake with a different user account than specified in the connection: {"user":"test_user","password":"test_pwd","role":"test_role"}
   *    Get tables from Redshift for different database than specified in the connection: {"database":"test_db"}
   */
  configuration?: string;
  /** List of table details */
  table: ConnectionTableColumnsInput[];
}

export const tspublicRestV2ConnectionTablecoloumnRequestSchema: Schema<TspublicRestV2ConnectionTablecoloumnRequest> = object(
  {
    id: ['id', string()],
    configuration: ['configuration', optional(string())],
    table: ['table', array(lazy(() => connectionTableColumnsInputSchema))],
  }
);
