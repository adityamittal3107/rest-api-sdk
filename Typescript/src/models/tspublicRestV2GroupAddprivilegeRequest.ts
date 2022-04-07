/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, object, optional, Schema, string } from '../schema';
import { PrivilegeEnum, privilegeEnumSchema } from './privilegeEnum';

export interface TspublicRestV2GroupAddprivilegeRequest {
  /** Name of the group */
  name?: string;
  /** The GUID of the group to query. */
  id?: string;
  /** List of privileges */
  privileges?: PrivilegeEnum[];
}

export const tspublicRestV2GroupAddprivilegeRequestSchema: Schema<TspublicRestV2GroupAddprivilegeRequest> = object(
  {
    name: ['name', optional(string())],
    id: ['id', optional(string())],
    privileges: ['privileges', optional(array(privilegeEnumSchema))],
  }
);
