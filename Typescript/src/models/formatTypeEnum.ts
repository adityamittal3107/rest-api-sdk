/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for FormatTypeEnum
 */
export enum FormatTypeEnum {
  YAML = 'YAML',
  JSON = 'JSON',
}

/**
 * Schema for FormatTypeEnum
 */
export const formatTypeEnumSchema: Schema<FormatTypeEnum> = stringEnum(FormatTypeEnum);
