/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for SearchUsersShowWalkMeEnum
 */
export enum SearchUsersShowWalkMeEnum {
  True = 'true',
  False = 'false',
}

/**
 * Schema for SearchUsersShowWalkMeEnum
 */
export const searchUsersShowWalkMeEnumSchema: Schema<SearchUsersShowWalkMeEnum> = stringEnum(SearchUsersShowWalkMeEnum);
