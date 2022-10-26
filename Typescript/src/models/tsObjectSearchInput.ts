/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, object, Schema, string } from '../schema';
import { Type2Enum, type2EnumSchema } from './type2Enum';

export interface TsObjectSearchInput {
  /** Type of the metadata objec */
  type: Type2Enum;
  /** A JSON Array of GUIDs of the metadata object */
  id: string[];
}

export const tsObjectSearchInputSchema: Schema<TsObjectSearchInput> = object({
  type: ['type', type2EnumSchema],
  id: ['id', array(string())],
});
