/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for SortOrderEnum
 */
export enum SortOrderEnum {
  DEFAULT = 'DEFAULT',
  ASC = 'ASC',
  DESC = 'DESC',
}

/**
 * Schema for SortOrderEnum
 */
export const sortOrderEnumSchema: Schema<SortOrderEnum> = stringEnum(SortOrderEnum);
