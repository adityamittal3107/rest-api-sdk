/**
 * TS Public RestAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for StateEnum
 */
export enum StateEnum {
  ACTIVE = 'ACTIVE',
  INACTIVE = 'INACTIVE',
  EXPIRED = 'EXPIRED',
  LOCKED = 'LOCKED',
  PENDING = 'PENDING',
}

/**
 * Schema for StateEnum
 */
export const stateEnumSchema: Schema<StateEnum> = stringEnum(StateEnum);
