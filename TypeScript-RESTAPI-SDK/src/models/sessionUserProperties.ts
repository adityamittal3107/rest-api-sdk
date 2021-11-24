/**
 * TS Public RestAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';

export interface SessionUserProperties {
  /** Persona of the user account */
  persona?: string;
  /** Email of the user account */
  mail?: string;
}

export const sessionUserPropertiesSchema: Schema<SessionUserProperties> = object(
  {
    persona: ['persona', optional(string())],
    mail: ['mail', optional(string())],
  }
);
