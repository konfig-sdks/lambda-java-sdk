# KeyApi

All URIs are relative to *https://cloud.lambdalabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSshKey**](KeyApi.md#addSshKey) | **POST** /ssh-keys | Add SSH key |
| [**getList**](KeyApi.md#getList) | **GET** /ssh-keys | List SSH keys |


<a name="addSshKey"></a>
# **addSshKey**
> KeyAddSshKeyResponse addSshKey(keyAddSshKeyRequest).execute();

Add SSH key

Add an SSH key  To use an existing key pair, enter the public key for the &#x60;public_key&#x60; property of the request body.  To generate a new key pair, omit the &#x60;public_key&#x60; property from the request body. Save the &#x60;private_key&#x60; from the response somewhere secure. For example, with curl:  &#x60;&#x60;&#x60; curl https://cloud.lambdalabs.com/api/v1/ssh-keys \\   --fail \\   -u ${LAMBDA_API_KEY}: \\   -X POST \\   -d &#39;{\&quot;name\&quot;: \&quot;new key\&quot;}&#39; \\   | jq -r &#39;.data.private_key&#39; &gt; key.pem  chmod 400 key.pem &#x60;&#x60;&#x60;  Then, after you launch an instance with &#x60;new key&#x60; attached to it: &#x60;&#x60;&#x60; ssh -i key.pem &lt;instance IP&gt; &#x60;&#x60;&#x60; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lambda;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KeyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.lambdalabs.com/api/v1";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Lambda client = new Lambda(configuration);
    String name = "name_example"; // Name of the SSH key
    String publicKey = "publicKey_example"; // Public key for the SSH key
    try {
      KeyAddSshKeyResponse result = client
              .key
              .addSshKey(name)
              .publicKey(publicKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyApi#addSshKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<KeyAddSshKeyResponse> response = client
              .key
              .addSshKey(name)
              .publicKey(publicKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyApi#addSshKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **keyAddSshKeyRequest** | [**KeyAddSshKeyRequest**](KeyAddSshKeyRequest.md)|  | |

### Return type

[**KeyAddSshKeyResponse**](KeyAddSshKeyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getList"></a>
# **getList**
> KeyGetListResponse getList().execute();

List SSH keys

Retrieve the list of SSH keys

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lambda;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KeyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.lambdalabs.com/api/v1";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Lambda client = new Lambda(configuration);
    try {
      KeyGetListResponse result = client
              .key
              .getList()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<KeyGetListResponse> response = client
              .key
              .getList()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**KeyGetListResponse**](KeyGetListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

