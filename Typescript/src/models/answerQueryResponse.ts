/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';

export interface AnswerQueryResponse {
  /** The name of the saved Answer */
  name?: string;
  /** The GUID of the saved Answer */
  id?: string;
  /** SQL query associated with the saved Answer */
  querySql?: string;
}

export const answerQueryResponseSchema: Schema<AnswerQueryResponse> = object({
  name: ['name', optional(string())],
  id: ['id', optional(string())],
  querySql: ['querySql', optional(string())],
});
