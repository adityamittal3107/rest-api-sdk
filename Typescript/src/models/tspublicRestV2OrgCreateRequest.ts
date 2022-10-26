/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';

export interface TspublicRestV2OrgCreateRequest {
  /** Name of the organization. */
  name: string;
  /** Description text for the organization. */
  description?: string;
}

export const tspublicRestV2OrgCreateRequestSchema: Schema<TspublicRestV2OrgCreateRequest> = object(
  { name: ['name', string()], description: ['description', optional(string())] }
);
