/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';

export interface UserNameAndIDInput {
  /** Username of the user */
  name?: string;
  /** GUID of the user */
  id?: string;
}

export const userNameAndIDInputSchema: Schema<UserNameAndIDInput> = object({
  name: ['name', optional(string())],
  id: ['id', optional(string())],
});
