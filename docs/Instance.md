

# Instance

Virtual machine (VM) in Lambda Cloud

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier (ID) of an instance |  |
|**name** | **String** | User-provided name for the instance |  [optional] |
|**ip** | **String** | IPv4 address of the instance |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the instance |  |
|**sshKeyNames** | **List&lt;String&gt;** | Names of the SSH keys allowed to access the instance |  |
|**fileSystemNames** | **List&lt;String&gt;** | Names of the file systems, if any, attached to the instance |  |
|**region** | [**Region**](Region.md) |  |  [optional] |
|**instanceType** | [**InstanceType**](InstanceType.md) |  |  [optional] |
|**hostname** | **String** | Hostname assigned to this instance, which resolves to the instance&#39;s IP. |  [optional] |
|**jupyterToken** | **String** | Secret token used to log into the jupyter lab server hosted on the instance. |  [optional] |
|**jupyterUrl** | **String** | URL that opens a jupyter lab notebook on the instance. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| BOOTING | &quot;booting&quot; |
| UNHEALTHY | &quot;unhealthy&quot; |
| TERMINATING | &quot;terminating&quot; |
| TERMINATED | &quot;terminated&quot; |



