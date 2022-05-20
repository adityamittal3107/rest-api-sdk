/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for SearchObjectHeaderAutoCreatedEnum
 */
export enum SearchObjectHeaderAutoCreatedEnum {
  True = 'true',
  False = 'false',
}

/**
 * Schema for SearchObjectHeaderAutoCreatedEnum
 */
export const searchObjectHeaderAutoCreatedEnumSchema: Schema<SearchObjectHeaderAutoCreatedEnum> = stringEnum(SearchObjectHeaderAutoCreatedEnum);
