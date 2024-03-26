

# FileSystem

Information about a shared file system

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier (ID) of a file system |  |
|**name** | **String** | Name of a file system |  |
|**created** | **String** | A date and time, formatted as an ISO 8601 time stamp |  |
|**createdBy** | [**User**](User.md) |  |  |
|**mountPoint** | **String** | Absolute path indicating where on instances the file system will be mounted |  |
|**region** | [**Region**](Region.md) |  |  |
|**isInUse** | **Boolean** | Whether the file system is currently in use by an instance. File systems that are in use cannot be deleted. |  |
|**bytesUsed** | **Integer** | Approximate amount of storage used by the file system, in bytes. This value is an estimate that is updated every several hours. |  [optional] |



