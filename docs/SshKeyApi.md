# SshKeyApi

All URIs are relative to *https://cloud.lambdalabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**remove**](SshKeyApi.md#remove) | **DELETE** /ssh-keys/{id} | Delete SSH key |


<a name="remove"></a>
# **remove**
> remove(id).execute();

Delete SSH key

Delete an SSH key.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lambda;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SshKeyApi;
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
    String id = "id_example"; // The unique identifier (ID) of the SSH key
    try {
      client
              .sshKey
              .remove(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SshKeyApi#remove");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .sshKey
              .remove(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SshKeyApi#remove");
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
| **id** | **String**| The unique identifier (ID) of the SSH key | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deletion successful |  -  |

