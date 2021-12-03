/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for Visibility3Enum
 */
export enum Visibility3Enum {
  DEFAULT = 'DEFAULT',
  NONSHARABLE = 'NON_SHARABLE',
  SHARABLE = 'SHARABLE',
}

/**
 * Schema for Visibility3Enum
 */
export const visibility3EnumSchema: Schema<Visibility3Enum> = stringEnum(Visibility3Enum);
