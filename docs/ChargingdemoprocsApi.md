# ChargingdemoprocsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCredit**](ChargingdemoprocsApi.md#addCredit) | **POST** /addCredit | Adds Credit
[**delUser**](ChargingdemoprocsApi.md#delUser) | **POST** /delUser | Delete User
[**getAndLockUser**](ChargingdemoprocsApi.md#getAndLockUser) | **POST** /GetAndLockUser | GetAndLockUser
[**getUser**](ChargingdemoprocsApi.md#getUser) | **POST** /getUser | GetUser
[**reportQuotaUsage**](ChargingdemoprocsApi.md#reportQuotaUsage) | **POST** /ReportQuotaUsage | Spends Credit
[**updateLockedUser**](ChargingdemoprocsApi.md#updateLockedUser) | **POST** /UpdateLockedUser | UpdateLockedUser
[**upsertUser**](ChargingdemoprocsApi.md#upsertUser) | **POST** /UpsertUser | UpsertUser

<a name="addCredit"></a>
# **addCredit**
> AddCreditUserStatus addCredit(userId, extraCredit, txnId)

Adds Credit

Adds Credit

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChargingdemoprocsApi;


ChargingdemoprocsApi apiInstance = new ChargingdemoprocsApi();
Long userId = 789L; // Long | User ID
Long extraCredit = 789L; // Long | Credit Delta
String txnId = "txnId_example"; // String | Transaction ID
try {
    AddCreditUserStatus result = apiInstance.addCredit(userId, extraCredit, txnId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargingdemoprocsApi#addCredit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User ID |
 **extraCredit** | **Long**| Credit Delta |
 **txnId** | **String**| Transaction ID |

### Return type

[**AddCreditUserStatus**](AddCreditUserStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset&#x3D;utf-8

<a name="delUser"></a>
# **delUser**
> String delUser(userId)

Delete User

Delete User

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChargingdemoprocsApi;


ChargingdemoprocsApi apiInstance = new ChargingdemoprocsApi();
Long userId = 789L; // Long | User ID
try {
    String result = apiInstance.delUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargingdemoprocsApi#delUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User ID |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset&#x3D;utf-8

<a name="getAndLockUser"></a>
# **getAndLockUser**
> UserObject getAndLockUser(body)

GetAndLockUser

GetAndLockUser

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChargingdemoprocsApi;


ChargingdemoprocsApi apiInstance = new ChargingdemoprocsApi();
Long body = 56L; // Long | 
try {
    UserObject result = apiInstance.getAndLockUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargingdemoprocsApi#getAndLockUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Long**](Long.md)|  | [optional]

### Return type

[**UserObject**](UserObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset&#x3D;utf-8

<a name="getUser"></a>
# **getUser**
> UserObject getUser(userId)

GetUser

GetUser

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChargingdemoprocsApi;


ChargingdemoprocsApi apiInstance = new ChargingdemoprocsApi();
Long userId = 789L; // Long | User ID
try {
    UserObject result = apiInstance.getUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargingdemoprocsApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User ID |

### Return type

[**UserObject**](UserObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset&#x3D;utf-8

<a name="reportQuotaUsage"></a>
# **reportQuotaUsage**
> ReportQuotaUsageStatus reportQuotaUsage(userId, unitsUsed, unitsWanted, inputSessionId, txnId)

Spends Credit

Spends Credit

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChargingdemoprocsApi;


ChargingdemoprocsApi apiInstance = new ChargingdemoprocsApi();
Long userId = 789L; // Long | User ID
Integer unitsUsed = 56; // Integer | User ID
Integer unitsWanted = 56; // Integer | User ID
Long inputSessionId = 789L; // Long | User ID
String txnId = "txnId_example"; // String | User ID
try {
    ReportQuotaUsageStatus result = apiInstance.reportQuotaUsage(userId, unitsUsed, unitsWanted, inputSessionId, txnId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargingdemoprocsApi#reportQuotaUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User ID |
 **unitsUsed** | **Integer**| User ID |
 **unitsWanted** | **Integer**| User ID |
 **inputSessionId** | **Long**| User ID |
 **txnId** | **String**| User ID |

### Return type

[**ReportQuotaUsageStatus**](ReportQuotaUsageStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset&#x3D;utf-8

<a name="updateLockedUser"></a>
# **updateLockedUser**
> String updateLockedUser(userId, sessionId, jsonPayload, deltaOperationName)

UpdateLockedUser

UpdateLockedUser

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChargingdemoprocsApi;


ChargingdemoprocsApi apiInstance = new ChargingdemoprocsApi();
Long userId = 789L; // Long | userId
Long sessionId = 789L; // Long | sessionId
String jsonPayload = "jsonPayload_example"; // String | jsonPayload
String deltaOperationName = "deltaOperationName_example"; // String | deltaOperationName
try {
    String result = apiInstance.updateLockedUser(userId, sessionId, jsonPayload, deltaOperationName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargingdemoprocsApi#updateLockedUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **sessionId** | **Long**| sessionId |
 **jsonPayload** | **String**| jsonPayload |
 **deltaOperationName** | **String**| deltaOperationName |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset&#x3D;utf-8

<a name="upsertUser"></a>
# **upsertUser**
> String upsertUser(body)

UpsertUser

UpsertUser

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChargingdemoprocsApi;


ChargingdemoprocsApi apiInstance = new ChargingdemoprocsApi();
Long body = 56L; // Long | 
try {
    String result = apiInstance.upsertUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargingdemoprocsApi#upsertUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Long**](Long.md)|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset&#x3D;utf-8

