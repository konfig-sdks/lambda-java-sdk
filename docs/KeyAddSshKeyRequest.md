

# KeyAddSshKeyRequest

The name for the SSH key. Optionally, an existing public key can be supplied for the `public_key` property. If the `public_key` property is omitted, a new key pair is generated. The private key is returned in the response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the SSH key |  |
|**publicKey** | **String** | Public key for the SSH key |  [optional] |



