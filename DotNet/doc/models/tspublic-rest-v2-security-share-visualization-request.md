
# Tspublic Rest V2 Security Share Visualization Request

## Structure

`TspublicRestV2SecurityShareVisualizationRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Id` | `string` | Required | A JSON array of the GUIDs of the objects to be shared |
| `VizId` | `string` | Required | The GUID of visualization |
| `PrincipalId` | `List<string>` | Required | The GUID of the users and user groups with which you want to share the visualization |
| `EmailId` | `List<string>` | Optional | The email addresses that should ne notified when the objects are shared |
| `Notify` | `bool?` | Optional | When set to true, a notification is sent to the users after an object is shared.<br>**Default**: `true` |
| `Message` | `string` | Optional | The message text to send in the notification email. |
| `IncludeCustomEmbedUrl` | `bool?` | Optional | When set to true, ThoughtSpot sends a link with the host application context to allow users to access the shared object from their ThoughtSpot embedded instance.<br>**Default**: `false` |

## Example (as JSON)

```json
{
  "id": "id0",
  "vizId": "vizId2",
  "principalId": [
    "principalId8",
    "principalId9",
    "principalId0"
  ],
  "emailId": null,
  "notify": null,
  "message": null,
  "includeCustomEmbedUrl": null
}
```

