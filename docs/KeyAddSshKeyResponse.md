

# KeyAddSshKeyResponse

The added or generated SSH public key. If a new key pair was generated, the response body contains a `private_key` property that *must* be saved locally. Lambda Cloud does not store private keys.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | [**SshKey**](SshKey.md) |  |  |



