

# InstanceCreateInstancesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**regionName** | **String** | Short name of a region |  |
|**instanceTypeName** | **String** | Name of an instance type |  |
|**sshKeyNames** | **List&lt;String&gt;** | Names of the SSH keys to allow access to the instances. Currently, exactly one SSH key must be specified. |  |
|**fileSystemNames** | **List&lt;String&gt;** | Names of the file systems to attach to the instances. Currently, only one (if any) file system may be specified. |  [optional] |
|**quantity** | **Integer** | Number of instances to launch |  [optional] |
|**name** | **String** | User-provided name for the instance |  [optional] |



