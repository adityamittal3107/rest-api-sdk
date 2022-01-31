/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';

export interface ApiRestV2ConnectionUpdateRequest {
  /** GUID of the connection */
  id: string;
  /** The text to update the name of the connection. */
  name?: string;
  /** The text to update the description of the connection. */
  description?: string;
  /**
   * A JSON object of the connection metadata. The metadata must include configuration attributes required to create the connection.
   *  Example:
   *  Snowflake: {"accountName":"testaccount","user":"test_user","password":"test_pwd","role":"test_role","warehouse":"test_wh","database":"test_db"}
   *   Redshift: {"host":"test_host","port":"1234","user":"test_user","password":"test_pwd","database":"test_db"}
   *  Google BigQuery: {"project_id":"test_project","oauth_pvt_key":"test_key"}
   *  Azure Synapse: {"host":"test_host","port":"1234","user":"test_user","password":"test_pwd","database":"test_db"}
   *  Teradata: {"host":"test_host","user":"test_user","password":"test_pwd","database":"test_db"}
   *  Oracle ADW: {"user":"test_user","password":"test_pwd","net_service_name":"test_srvc_name","tns_admin":"test_tns","schema":"test_schema"}
   *  Starburst: {"host":"test_host","user":"test_user","password":"test_pwd","database":"test_db"}
   *  Databricks: {"host":"test_host","http_path":"https://test ","user":"test_user","password":"test_pwd"}
   *  SAP HANA: {"host":"test_host","user":"test_user","password":"test_pwd","database":"test_db"}
   *  Denodo: {"host":"test_host","port":"1234","user":"test_user","password":"test_pwd"}
   */
  configuration: string;
}

export const apiRestV2ConnectionUpdateRequestSchema: Schema<ApiRestV2ConnectionUpdateRequest> = object(
  {
    id: ['id', string()],
    name: ['name', optional(string())],
    description: ['description', optional(string())],
    configuration: ['configuration', string()],
  }
);
