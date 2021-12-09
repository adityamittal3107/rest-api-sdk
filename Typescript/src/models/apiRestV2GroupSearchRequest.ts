/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, lazy, object, optional, Schema, string } from '../schema';
import {
  GroupNameAndIDInput,
  groupNameAndIDInputSchema,
} from './groupNameAndIDInput';
import { PrivilegeEnum, privilegeEnumSchema } from './privilegeEnum';
import { Type5Enum, type5EnumSchema } from './type5Enum';
import {
  UserNameAndIDInput,
  userNameAndIDInputSchema,
} from './userNameAndIDInput';
import { Visibility3Enum, visibility3EnumSchema } from './visibility3Enum';

export interface ApiRestV2GroupSearchRequest {
  /** Name of the user group */
  name?: string;
  /** GUID of the group to update */
  id?: string;
  /** A unique display name string for the user group, for example, Developer group. */
  displayName?: string;
  /** The visibility attribute is set to DEFAULT when creating a group. Setting this to DEFAULT makes a group visible to other users and user groups, and thus allows them to share objects */
  visibility?: Visibility3Enum;
  /** Description text for the group. */
  description?: string;
  /** A JSON array of privileges assigned to the group */
  privileges?: PrivilegeEnum[];
  /** A JSON array of group names or GUIDs or both. When both are given then id is considered */
  groups?: GroupNameAndIDInput[];
  /** A JSON array of name of users or GUIDs of users or both. When both are given then id is considered */
  users?: UserNameAndIDInput[];
  /** Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system. */
  type?: Type5Enum;
}

export const apiRestV2GroupSearchRequestSchema: Schema<ApiRestV2GroupSearchRequest> = object(
  {
    name: ['name', optional(string())],
    id: ['id', optional(string())],
    displayName: ['displayName', optional(string())],
    visibility: ['visibility', optional(visibility3EnumSchema)],
    description: ['description', optional(string())],
    privileges: ['privileges', optional(array(privilegeEnumSchema))],
    groups: ['groups', optional(array(lazy(() => groupNameAndIDInputSchema)))],
    users: ['users', optional(array(lazy(() => userNameAndIDInputSchema)))],
    type: ['type', optional(type5EnumSchema)],
  }
);
