
# Tspublic Rest V2 Metadata Detail Search Request

## Structure

`TspublicRestV2MetadataDetailSearchRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | [`Type6Enum`](../../doc/models/type-6-enum.md) | Required | Type of the metadata object being searched. |
| `id` | `string[]` | Required | A JSON array of GUIDs of the objects. |
| `showHidden` | `boolean \| undefined` | Optional | When set to true, returns details of the hidden objects, such as a column in a worksheet or a table.<br>**Default**: `false` |
| `dropQuestionDetails` | `boolean \| undefined` | Optional | When set to true, the search assist data associated with a worksheet is not included in the API response. This attribute is applicable only for DATAOBJECT data type.<br>**Default**: `false` |
| `version` | `string \| undefined` | Optional | Specify the version to retrieve the objects from. By default, the API returns metadata for all versions of the object. |

## Example (as JSON)

```json
{
  "type": "DATAOBJECT",
  "id": [
    "id0"
  ],
  "showHidden": null,
  "dropQuestionDetails": null,
  "version": null
}
```

