/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';

export interface GroupNameAndID {
  /** Name of the group */
  name?: string;
  /** GUID of the group */
  id?: string;
}

export const groupNameAndIDSchema: Schema<GroupNameAndID> = object({
  name: ['name', optional(string())],
  id: ['id', optional(string())],
});
