/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for FormatType1Enum
 */
export enum FormatType1Enum {
  COMPACT = 'COMPACT',
  FULL = 'FULL',
}

/**
 * Schema for FormatType1Enum
 */
export const formatType1EnumSchema: Schema<FormatType1Enum> = stringEnum(FormatType1Enum);
