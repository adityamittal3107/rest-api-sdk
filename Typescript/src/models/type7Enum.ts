/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for Type7Enum
 */
export enum Type7Enum {
  LIVEBOARD = 'LIVEBOARD',
  ANSWER = 'ANSWER',
  DATAOBJECT = 'DATAOBJECT',
  COLUMN = 'COLUMN',
}

/**
 * Schema for Type7Enum
 */
export const type7EnumSchema: Schema<Type7Enum> = stringEnum(Type7Enum);
