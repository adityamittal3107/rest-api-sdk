/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, lazy, object, optional, Schema, string } from '../schema';
import { GroupPermission, groupPermissionSchema } from './groupPermission';

export interface DependentPermission {
  /** GUID of the object */
  id?: string;
  /** Name of the object */
  name?: string;
  /** Indicates the type of the object */
  type?: string;
  /** Indicates the permission which user or user group has on the object */
  permission?: string;
  /** Indicates the permission which user or user group has on the object through sharing of the object with this user or user group */
  sharedPermission?: string;
  /** An array of object with details of permission on the user groups to which the user or user group belongs */
  groupPermission?: GroupPermission[];
}

export const dependentPermissionSchema: Schema<DependentPermission> = object({
  id: ['id', optional(string())],
  name: ['name', optional(string())],
  type: ['type', optional(string())],
  permission: ['permission', optional(string())],
  sharedPermission: ['sharedPermission', optional(string())],
  groupPermission: [
    'groupPermission',
    optional(array(lazy(() => groupPermissionSchema))),
  ],
});
