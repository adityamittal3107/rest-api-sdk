/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';

export interface LiveboardNameAndID {
  /** Name of the liveboard */
  name?: string;
  /** GUID of the liveboard */
  id?: string;
}

export const liveboardNameAndIDSchema: Schema<LiveboardNameAndID> = object({
  name: ['name', optional(string())],
  id: ['id', optional(string())],
});
