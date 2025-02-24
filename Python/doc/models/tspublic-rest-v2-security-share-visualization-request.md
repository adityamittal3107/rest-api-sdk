
# Tspublic Rest V2 Security Share Visualization Request

## Structure

`TspublicRestV2SecurityShareVisualizationRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Required | A JSON array of the GUIDs of the objects to be shared |
| `viz_id` | `string` | Required | The GUID of visualization |
| `principal_id` | `List of string` | Required | The GUID of the users and user groups with which you want to share the visualization |
| `email_id` | `List of string` | Optional | The email addresses that should ne notified when the objects are shared |
| `notify` | `bool` | Optional | When set to true, a notification is sent to the users after an object is shared.<br>**Default**: `True` |
| `message` | `string` | Optional | The message text to send in the notification email. |
| `include_custom_embed_url` | `bool` | Optional | When set to true, ThoughtSpot sends a link with the host application context to allow users to access the shared object from their ThoughtSpot embedded instance.<br>**Default**: `False` |

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

