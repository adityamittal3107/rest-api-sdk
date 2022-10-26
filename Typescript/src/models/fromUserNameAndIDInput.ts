/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';

/**
 * A JSON object of name or GUIDs of the current owner of the objects. When both are given then id is considered.
 * If a list of object ids are provided as input for TsObjectId, then only for those ids that have owner as the value provided in fromUser, the owner will be changed.
 * Provide either name or id as input. When both are given user id will be considered.
 */
export interface FromUserNameAndIDInput {
  /** Username of the user */
  name?: string;
  /** GUID of the user */
  id?: string;
}

export const fromUserNameAndIDInputSchema: Schema<FromUserNameAndIDInput> = object(
  { name: ['name', optional(string())], id: ['id', optional(string())] }
);
