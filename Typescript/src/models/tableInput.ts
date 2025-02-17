/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';

export interface TableInput {
  /** Name of the table */
  name?: string;
  /** GUID of the Table */
  id?: string;
}

export const tableInputSchema: Schema<TableInput> = object({
  name: ['name', optional(string())],
  id: ['id', optional(string())],
});
