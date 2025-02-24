/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, object, Schema, string } from '../schema';

export interface TspublicRestV2DatabaseTableRunqueryRequest {
  /** A JSON array of TQL statements separated by semi-colon (;). Each TQL statement should end with semi-colon (;). The TQL operations that can be run through this API are restricted to create database and schema, alter table, delete and update table rows. If a TQL statement fails, then the subsequent statements in the array are not run. Example: ["alter table test_db.test_schema.test_table drop contraint primary key;";"alter table test_db.test_schema.test_table add column test_col4 varchar(10) DEFAULT '';"] */
  statement: string[];
}

export const tspublicRestV2DatabaseTableRunqueryRequestSchema: Schema<TspublicRestV2DatabaseTableRunqueryRequest> = object(
  { statement: ['statement', array(string())] }
);
