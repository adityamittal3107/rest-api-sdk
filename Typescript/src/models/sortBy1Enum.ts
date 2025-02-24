/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for SortBy1Enum
 */
export enum SortBy1Enum {
  DEFAULT = 'DEFAULT',
  NAME = 'NAME',
  DISPLAYNAME = 'DISPLAY_NAME',
  AUTHOR = 'AUTHOR',
  CREATED = 'CREATED',
  MODIFIED = 'MODIFIED',
  LASTACCESSED = 'LAST_ACCESSED',
  SYNCED = 'SYNCED',
  VIEWS = 'VIEWS',
  NONE = 'NONE',
  USERSTATE = 'USER_STATE',
  ROWCOUNT = 'ROW_COUNT',
}

/**
 * Schema for SortBy1Enum
 */
export const sortBy1EnumSchema: Schema<SortBy1Enum> = stringEnum(SortBy1Enum);
