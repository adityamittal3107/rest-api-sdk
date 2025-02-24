
# Tspublic Rest V2 Metadata Header Search Request

## Structure

`TspublicRestV2MetadataHeaderSearchRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OutputFields` | `List<String>` | Optional | Array of header field names that need to be included in the header response | List<String> getOutputFields() | setOutputFields(List<String> outputFields) |
| `Offset` | `Integer` | Optional | The batch offset, starting from where the records should be included in the response. If no input is provided then offset starts from 0. Default: 0<br>**Default**: `0` | Integer getOffset() | setOffset(Integer offset) |
| `BatchNumber` | `Integer` | Optional | An alternate way to set offset for the starting point of the response.<br><br>The value in offset field will not be considered if batchNumber field has value greater than 0.<br><br>Offset value will be calculated as (batchNumber - 1) * batchSize.<br><br>It is mandatory to provide a value for batchSize with batchNumber.<br><br>Example:<br><br>Assume response has 100 records. Now,  batchNumber is set as 2 and batchSize as 10, then offset value will be 10. So, 10 records starting from 11th record will be considered. | Integer getBatchNumber() | setBatchNumber(Integer batchNumber) |
| `BatchSize` | `Integer` | Optional | The number of records that should be included in the response starting from offset position. If no input is provided then first page is included in the response.<br>**Default**: `-1` | Integer getBatchSize() | setBatchSize(Integer batchSize) |
| `SortBy` | [`SortByEnum`](../../doc/models/sort-by-enum.md) | Optional | Field based on which the response needs to be ordered.<br>**Default**: `SortByEnum.DEFAULT` | SortByEnum getSortBy() | setSortBy(SortByEnum sortBy) |
| `SortOrder` | [`SortOrderEnum`](../../doc/models/sort-order-enum.md) | Optional | Order in which sortBy should be applied.<br>**Default**: `SortOrderEnum.DEFAULT` | SortOrderEnum getSortOrder() | setSortOrder(SortOrderEnum sortOrder) |
| `Type` | [`Type3Enum`](../../doc/models/type-3-enum.md) | Required | Type of the metadata object being searched. | Type3Enum getType() | setType(Type3Enum type) |
| `NamePattern` | `String` | Optional | A pattern to match the name of the metadata object. This parameter supports matching case-insensitive strings. For a wildcard match, use %. | String getNamePattern() | setNamePattern(String namePattern) |
| `FetchId` | `List<String>` | Optional | A JSON array containing the GUIDs of the metadata objects that you want to fetch. | List<String> getFetchId() | setFetchId(List<String> fetchId) |
| `SkipId` | `List<String>` | Optional | A JSON array containing the GUIDs of the metadata objects that you want to skip. | List<String> getSkipId() | setSkipId(List<String> skipId) |
| `ShowHidden` | `Boolean` | Optional | When set to true, returns details of the hidden objects, such as a column in a worksheet or a table.<br>**Default**: `false` | Boolean getShowHidden() | setShowHidden(Boolean showHidden) |
| `AutoCreated` | `Boolean` | Optional | A flag to indicate whether to list only the auto created objects. When no value is provided as input then all objects are returned. | Boolean getAutoCreated() | setAutoCreated(Boolean autoCreated) |
| `AccessLevel` | [`List<AccessLevelInput>`](../../doc/models/access-level-input.md) | Optional | A JSON array of objects with user details for which the metadata objects should be considered from the repository<br>If you specify ID or name of user and set the type parameter to USER, the API returns metadata objects associated with the user<br>If you specify ID or name of user group and set the type parameter to USER_GROUP, the API returns metadata objects for all the users mapped to the specified user group.<br>If the id or name parameter is not defined, but the type attribute is set to USER or USER_GROUP, then the API will not return and response.<br>If no input is provided for any field for this object, then the API returns headers for all users.<br>If both name and id is provided, then id will be considered. | List<AccessLevelInput> getAccessLevel() | setAccessLevel(List<AccessLevelInput> accessLevel) |
| `Tag` | [`List<TagNameAndIdInput>`](../../doc/models/tag-name-and-id-input.md) | Optional | A JSON array of name or GUID of tags or both. When both are given then id is considered. | List<TagNameAndIdInput> getTag() | setTag(List<TagNameAndIdInput> tag) |
| `FavoriteFor` | [`List<NameAndIdInput>`](../../doc/models/name-and-id-input.md) | Optional | A JSON array of name or GUID of the user or both for whom the object is assigned as favorite. When both are given then id is considered. | List<NameAndIdInput> getFavoriteFor() | setFavoriteFor(List<NameAndIdInput> favoriteFor) |
| `Author` | [`List<NameAndIdInput>`](../../doc/models/name-and-id-input.md) | Optional | A JSON array of name or GUID of the user or both who created the object. When both are given then id is considered | List<NameAndIdInput> getAuthor() | setAuthor(List<NameAndIdInput> author) |
| `LastModifiedBy` | [`List<NameAndIdInput>`](../../doc/models/name-and-id-input.md) | Optional | A JSON array of name or GUID of the user or both who last modified the object. When both are given then id is considered. | List<NameAndIdInput> getLastModifiedBy() | setLastModifiedBy(List<NameAndIdInput> lastModifiedBy) |

## Example (as JSON)

```json
{
  "outputFields": null,
  "offset": null,
  "batchNumber": null,
  "batchSize": null,
  "sortBy": null,
  "sortOrder": null,
  "type": "COLUMN_ALL",
  "namePattern": null,
  "fetchId": null,
  "skipId": null,
  "showHidden": null,
  "autoCreated": null,
  "accessLevel": null,
  "tag": null,
  "favoriteFor": null,
  "author": null,
  "lastModifiedBy": null
}
```

