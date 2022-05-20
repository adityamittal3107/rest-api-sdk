/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for PdfOptionsInputIncludePageNumberEnum
 */
export enum PdfOptionsInputIncludePageNumberEnum {
  True = 'true',
  False = 'false',
}

/**
 * Schema for PdfOptionsInputIncludePageNumberEnum
 */
export const pdfOptionsInputIncludePageNumberEnumSchema: Schema<PdfOptionsInputIncludePageNumberEnum> = stringEnum(PdfOptionsInputIncludePageNumberEnum);
