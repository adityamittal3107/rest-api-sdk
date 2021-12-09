/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import {
  array,
  boolean,
  lazy,
  object,
  optional,
  Schema,
  string,
} from '../schema';
import {
  GroupNameAndIDInput,
  groupNameAndIDInputSchema,
} from './groupNameAndIDInput';
import { StateEnum, stateEnumSchema } from './stateEnum';
import { Type2Enum, type2EnumSchema } from './type2Enum';
import { VisibilityEnum, visibilityEnumSchema } from './visibilityEnum';

export interface ApiRestV2UserUpdateRequest {
  /** Name of the user account. The username string must be unique. */
  name?: string;
  /** The GUID of the user account */
  id?: string;
  /** A display name string for the user, usually their first and last name. */
  displayName?: string;
  /** Visibility of the user. The visibility attribute is set to DEFAULT when creating a user. Setting this to DEFAULT makes a user visible to other users and user groups, and thus allows them to share objects */
  visibility?: VisibilityEnum;
  /** Email id associated with the user account */
  mail?: string;
  /** Password for the user account. */
  password?: string;
  /** Status of user account. acitve or inactive. */
  state?: StateEnum;
  /** User preference for receiving email notifications when another ThoughtSpot user shares answers or pinboards. */
  notifyOnShare?: boolean;
  /** The user preference for revisiting the onboarding experience. */
  showWalkMe?: boolean;
  /** ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding experience leads users through a set of actions to help users get started and accomplish their tasks quickly. The users can turn off the Onboarding experience and access it again when they need assistance with the ThoughtSpot UI. */
  analystOnboardingComplete?: boolean;
  /** Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot system. */
  type?: Type2Enum;
  /** A JSON array of group names or GUIDs or both. When both are given then id is considered */
  groups?: GroupNameAndIDInput[];
}

export const apiRestV2UserUpdateRequestSchema: Schema<ApiRestV2UserUpdateRequest> = object(
  {
    name: ['name', optional(string())],
    id: ['id', optional(string())],
    displayName: ['displayName', optional(string())],
    visibility: ['visibility', optional(visibilityEnumSchema)],
    mail: ['mail', optional(string())],
    password: ['password', optional(string())],
    state: ['state', optional(stateEnumSchema)],
    notifyOnShare: ['notifyOnShare', optional(boolean())],
    showWalkMe: ['showWalkMe', optional(boolean())],
    analystOnboardingComplete: [
      'analystOnboardingComplete',
      optional(boolean()),
    ],
    type: ['type', optional(type2EnumSchema)],
    groups: ['groups', optional(array(lazy(() => groupNameAndIDInputSchema)))],
  }
);
