
# Tspublic Rest V2 Group Addprivilege Request

## Structure

`TspublicRestV2GroupAddprivilegeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the group | String getName() | setName(String name) |
| `Id` | `String` | Optional | The GUID of the group to query. | String getId() | setId(String id) |
| `Privileges` | [`List<PrivilegeEnum>`](../../doc/models/privilege-enum.md) | Optional | A JSON array of name of users or GUIDs of users or both. When both are given then id is considered | List<PrivilegeEnum> getPrivileges() | setPrivileges(List<PrivilegeEnum> privileges) |

## Example (as JSON)

```json
{
  "name": null,
  "id": null,
  "privileges": null
}
```

