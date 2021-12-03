/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, lazy, object, optional, Schema, string } from '../schema';
import {
  AnalystOnboardingCompleteEnum,
  analystOnboardingCompleteEnumSchema,
} from './analystOnboardingCompleteEnum';
import {
  GroupNameAndIDInput,
  groupNameAndIDInputSchema,
} from './groupNameAndIDInput';
import {
  NotifyOnShareEnum,
  notifyOnShareEnumSchema,
} from './notifyOnShareEnum';
import { PrivilegeEnum, privilegeEnumSchema } from './privilegeEnum';
import { ShowWalkMeEnum, showWalkMeEnumSchema } from './showWalkMeEnum';
import { StateEnum, stateEnumSchema } from './stateEnum';
import { Type4Enum, type4EnumSchema } from './type4Enum';
import { Visibility2Enum, visibility2EnumSchema } from './visibility2Enum';

export interface ApiRestV2UserSearchRequest {
  /** Name of the user. */
  name?: string;
  /** The GUID of the user account to query */
  id?: string;
  /** A unique display name string for the user, usually their first and last name. */
  displayName?: string;
  /** Visibility of the user. The visibility attribute is set to DEFAULT when creating a user. The DEFAULT attribute makes a user visible to other users and user groups, and thus allows them to share objects. */
  visibility?: Visibility2Enum;
  /** email of the user account */
  mail?: string;
  /** A JSON array of group names or GUIDs or both. When both are given then id is considered */
  groups?: GroupNameAndIDInput[];
  /** A JSON array of privileges assigned to the user */
  privileges?: PrivilegeEnum[];
  /** Status of user account. acitve or inactive. */
  state?: StateEnum;
  /** User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards. */
  notifyOnShare?: NotifyOnShareEnum;
  /** The user preference for revisiting the onboarding experience. */
  showWalkMe?: ShowWalkMeEnum;
  /** ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly. The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI. */
  analystOnboardingComplete?: AnalystOnboardingCompleteEnum;
  /** Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system. */
  type?: Type4Enum;
}

export const apiRestV2UserSearchRequestSchema: Schema<ApiRestV2UserSearchRequest> = object(
  {
    name: ['name', optional(string())],
    id: ['id', optional(string())],
    displayName: ['displayName', optional(string())],
    visibility: ['visibility', optional(visibility2EnumSchema)],
    mail: ['mail', optional(string())],
    groups: ['groups', optional(array(lazy(() => groupNameAndIDInputSchema)))],
    privileges: ['privileges', optional(array(privilegeEnumSchema))],
    state: ['state', optional(stateEnumSchema)],
    notifyOnShare: ['notifyOnShare', optional(notifyOnShareEnumSchema)],
    showWalkMe: ['showWalkMe', optional(showWalkMeEnumSchema)],
    analystOnboardingComplete: [
      'analystOnboardingComplete',
      optional(analystOnboardingCompleteEnumSchema),
    ],
    type: ['type', optional(type4EnumSchema)],
  }
);
