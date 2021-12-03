/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for ImportPolicyEnum
 */
export enum ImportPolicyEnum {
  PARTIAL = 'PARTIAL',
  ALLORNONE = 'ALL_OR_NONE',
  VALIDATEONLY = 'VALIDATE_ONLY',
}

/**
 * Schema for ImportPolicyEnum
 */
export const importPolicyEnumSchema: Schema<ImportPolicyEnum> = stringEnum(ImportPolicyEnum);
