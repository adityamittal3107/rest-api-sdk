/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for RemovePrivilegesFromGroupPrivilegesEnum
 */
export enum RemovePrivilegesFromGroupPrivilegesEnum {
  ADMINISTRATION = 'ADMINISTRATION',
  AUTHORING = 'AUTHORING',
  DEVELOPER = 'DEVELOPER',
  USERDATAUPLOADING = 'USERDATAUPLOADING',
  DATADOWNLOADING = 'DATADOWNLOADING',
  DATAMANAGEMENT = 'DATAMANAGEMENT',
  SHAREWITHALL = 'SHAREWITHALL',
  EXPERIMENTALFEATUREPRIVILEGE = 'EXPERIMENTALFEATUREPRIVILEGE',
  JOBSCHEDULING = 'JOBSCHEDULING',
  RANALYSIS = 'RANALYSIS',
  A3ANALYSIS = 'A3ANALYSIS',
  BYPASSRLS = 'BYPASSRLS',
}

/**
 * Schema for RemovePrivilegesFromGroupPrivilegesEnum
 */
export const removePrivilegesFromGroupPrivilegesEnumSchema: Schema<RemovePrivilegesFromGroupPrivilegesEnum> = stringEnum(RemovePrivilegesFromGroupPrivilegesEnum);
