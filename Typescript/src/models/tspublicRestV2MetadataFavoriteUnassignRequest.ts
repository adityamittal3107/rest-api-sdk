/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, lazy, object, optional, Schema, string } from '../schema';
import { TsObjectInput, tsObjectInputSchema } from './tsObjectInput';

export interface TspublicRestV2MetadataFavoriteUnassignRequest {
  /** Name of the user */
  userName?: string;
  /** The GUID of the user */
  userId?: string;
  /** A JSON Array of GUIDs and type of metadata object. */
  tsObject: TsObjectInput[];
}

export const tspublicRestV2MetadataFavoriteUnassignRequestSchema: Schema<TspublicRestV2MetadataFavoriteUnassignRequest> = object(
  {
    userName: ['userName', optional(string())],
    userId: ['userId', optional(string())],
    tsObject: ['tsObject', array(lazy(() => tsObjectInputSchema))],
  }
);
