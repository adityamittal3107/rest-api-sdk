/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, Schema, string } from '../schema';

export interface ColumnsInput {
  /** Name of the column */
  name: string;
  /** Datatype of the column */
  dataType: string;
}

export const columnsInputSchema: Schema<ColumnsInput> = object({
  name: ['name', string()],
  dataType: ['dataType', string()],
});
