/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for GetObjectDetailTypeEnum
 */
export enum GetObjectDetailTypeEnum {
  ANSWER = 'ANSWER',
  LIVEBOARD = 'LIVEBOARD',
  DATAOBJECT = 'DATAOBJECT',
  COLUMN = 'COLUMN',
  JOIN = 'JOIN',
  CONNECTION = 'CONNECTION',
  TAG = 'TAG',
  USER = 'USER',
  USERGROUP = 'USER_GROUP',
}

/**
 * Schema for GetObjectDetailTypeEnum
 */
export const getObjectDetailTypeEnumSchema: Schema<GetObjectDetailTypeEnum> = stringEnum(GetObjectDetailTypeEnum);
