# InstanceTypeApi

All URIs are relative to *https://cloud.lambdalabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getList**](InstanceTypeApi.md#getList) | **GET** /instance-types | Retrieve list of offered instance types |


<a name="getList"></a>
# **getList**
> InstanceTypeGetListResponse getList().execute();

Retrieve list of offered instance types

Returns a detailed list of the instance types offered by Lambda GPU Cloud. The details include the regions, if any, in which each instance type is currently available. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lambda;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InstanceTypeApi;
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
      InstanceTypeGetListResponse result = client
              .instanceType
              .getList()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceTypeApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InstanceTypeGetListResponse> response = client
              .instanceType
              .getList()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceTypeApi#getList");
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

[**InstanceTypeGetListResponse**](InstanceTypeGetListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

