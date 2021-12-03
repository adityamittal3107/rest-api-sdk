/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for AnalystOnboardingCompleteEnum
 */
export enum AnalystOnboardingCompleteEnum {
  True = 'True',
  False = 'False',
}

/**
 * Schema for AnalystOnboardingCompleteEnum
 */
export const analystOnboardingCompleteEnumSchema: Schema<AnalystOnboardingCompleteEnum> = stringEnum(AnalystOnboardingCompleteEnum);
