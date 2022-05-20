/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for TsObjectInputTypeEnum
 */
export enum TsObjectInputTypeEnum {
  ANSWER = 'ANSWER',
  LIVEBOARD = 'LIVEBOARD',
  DATAOBJECT = 'DATAOBJECT',
  CONNECTION = 'CONNECTION',
}

/**
 * Schema for TsObjectInputTypeEnum
 */
export const tsObjectInputTypeEnumSchema: Schema<TsObjectInputTypeEnum> = stringEnum(TsObjectInputTypeEnum);
