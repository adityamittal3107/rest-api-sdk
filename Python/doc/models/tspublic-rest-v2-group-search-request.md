
# Tspublic Rest V2 Group Search Request

## Structure

`TspublicRestV2GroupSearchRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `output_fields` | `List of string` | Optional | Array of field names that need to be included in the response |
| `name` | `string` | Optional | Name of the user group |
| `id` | `string` | Optional | GUID of the group to update |
| `display_name` | `string` | Optional | A unique display name string for the user group, for example, Developer group. |
| `visibility` | `string` | Optional | Visibility of the user group. The visibility attribute is set to DEFAULT. The DEFAULT attribute makes the user group visible for other user groups and allows them to share objects. |
| `description` | `string` | Optional | Description text for the group. |
| `privileges` | [`List of PrivilegeEnum`](../../doc/models/privilege-enum.md) | Optional | A JSON array of privileges assigned to the group |
| `groups` | [`List of GroupNameAndIDInput`](../../doc/models/group-name-and-id-input.md) | Optional | Array of objects of groups that the user belong to. |
| `users` | [`List of UserNameAndIDInput`](../../doc/models/user-name-and-id-input.md) | Optional | Array of user name that associated with group. |
| `mtype` | `string` | Optional | Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system. |

## Example (as JSON)

```json
{
  "outputFields": null,
  "name": null,
  "id": null,
  "displayName": null,
  "visibility": null,
  "description": null,
  "privileges": null,
  "groups": null,
  "users": null,
  "type": null
}
```

