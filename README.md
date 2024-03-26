<div align="center">

[![Visit Lambda](./header.png)](https://lambdalabs.com)

# [Lambda](https://lambdalabs.com)

API for interacting with the Lambda GPU Cloud

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Lambda&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>lambda-java-sdk</artifactId>
  <version>1.5.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:lambda-java-sdk:1.5.1"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/lambda-java-sdk-1.5.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lambda;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileSystemApi;
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
      FileSystemGetListResponse result = client
              .fileSystem
              .getList()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileSystemApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileSystemGetListResponse> response = client
              .fileSystem
              .getList()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileSystemApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://cloud.lambdalabs.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FileSystemApi* | [**getList**](docs/FileSystemApi.md#getList) | **GET** /file-systems | List file systems
*InstanceApi* | [**createInstances**](docs/InstanceApi.md#createInstances) | **POST** /instance-operations/launch | Launch instances
*InstanceApi* | [**getDetails**](docs/InstanceApi.md#getDetails) | **GET** /instances/{id} | List details of a specific instance
*InstanceApi* | [**listRunningInstances**](docs/InstanceApi.md#listRunningInstances) | **GET** /instances | List running instances
*InstanceApi* | [**restartInstances**](docs/InstanceApi.md#restartInstances) | **POST** /instance-operations/restart | Restart instances
*InstanceApi* | [**terminateInstance**](docs/InstanceApi.md#terminateInstance) | **POST** /instance-operations/terminate | Terminate an instance
*InstanceTypeApi* | [**getList**](docs/InstanceTypeApi.md#getList) | **GET** /instance-types | Retrieve list of offered instance types
*KeyApi* | [**addSshKey**](docs/KeyApi.md#addSshKey) | **POST** /ssh-keys | Add SSH key
*KeyApi* | [**getList**](docs/KeyApi.md#getList) | **GET** /ssh-keys | List SSH keys
*SshKeyApi* | [**remove**](docs/SshKeyApi.md#remove) | **DELETE** /ssh-keys/{id} | Delete SSH key


## Documentation for Models

 - [Error](docs/Error.md)
 - [ErrorCode](docs/ErrorCode.md)
 - [FileSystem](docs/FileSystem.md)
 - [FileSystemGetListResponse](docs/FileSystemGetListResponse.md)
 - [Instance](docs/Instance.md)
 - [InstanceCreateInstancesRequest](docs/InstanceCreateInstancesRequest.md)
 - [InstanceCreateInstancesResponse](docs/InstanceCreateInstancesResponse.md)
 - [InstanceCreateInstancesResponseData](docs/InstanceCreateInstancesResponseData.md)
 - [InstanceGetDetailsResponse](docs/InstanceGetDetailsResponse.md)
 - [InstanceListRunningInstancesResponse](docs/InstanceListRunningInstancesResponse.md)
 - [InstanceRestartInstancesRequest](docs/InstanceRestartInstancesRequest.md)
 - [InstanceRestartInstancesResponse](docs/InstanceRestartInstancesResponse.md)
 - [InstanceRestartInstancesResponseData](docs/InstanceRestartInstancesResponseData.md)
 - [InstanceTerminateInstanceRequest](docs/InstanceTerminateInstanceRequest.md)
 - [InstanceTerminateInstanceResponse](docs/InstanceTerminateInstanceResponse.md)
 - [InstanceTerminateInstanceResponseData](docs/InstanceTerminateInstanceResponseData.md)
 - [InstanceType](docs/InstanceType.md)
 - [InstanceTypeGetListResponse](docs/InstanceTypeGetListResponse.md)
 - [InstanceTypeGetListResponseDataValue](docs/InstanceTypeGetListResponseDataValue.md)
 - [InstanceTypeSpecs](docs/InstanceTypeSpecs.md)
 - [KeyAddSshKeyRequest](docs/KeyAddSshKeyRequest.md)
 - [KeyAddSshKeyResponse](docs/KeyAddSshKeyResponse.md)
 - [KeyGetListResponse](docs/KeyGetListResponse.md)
 - [Region](docs/Region.md)
 - [SshKey](docs/SshKey.md)
 - [User](docs/User.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
