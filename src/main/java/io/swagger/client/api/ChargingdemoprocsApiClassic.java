package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import javax.ws.rs.core.GenericType;

import io.swagger.client.model.AddCreditUserStatus;
import io.swagger.client.model.ReportQuotaUsageStatus;
import io.swagger.client.model.UserObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-02-20T20:15:30.641977Z[Europe/Dublin]")
public class ChargingdemoprocsApiClassic {
  private ApiClient apiClient;

  public ChargingdemoprocsApiClassic() {
    this(Configuration.getDefaultApiClient());
  }

  public ChargingdemoprocsApiClassic(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Adds Credit
   * Adds Credit
   * @param userId User ID (required)
   * @param extraCredit Credit Delta (required)
   * @param txnId Transaction ID (required)
   * @return AddCreditUserStatus
   * @throws ApiException if fails to make API call
   */
  public AddCreditUserStatus addCredit(Long userId, Long extraCredit, String txnId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling addCredit");
    }
    // verify the required parameter 'extraCredit' is set
    if (extraCredit == null) {
      throw new ApiException(400, "Missing the required parameter 'extraCredit' when calling addCredit");
    }
    // verify the required parameter 'txnId' is set
    if (txnId == null) {
      throw new ApiException(400, "Missing the required parameter 'txnId' when calling addCredit");
    }
    // create path and map variables
    String localVarPath = "/addCredit"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "extraCredit" + "\\}", apiClient.escapeString(extraCredit.toString()))
      .replaceAll("\\{" + "txnId" + "\\}", apiClient.escapeString(txnId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json;charset&#x3D;utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<AddCreditUserStatus> localVarReturnType = new GenericType<AddCreditUserStatus>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Delete User
   * Delete User
   * @param userId User ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String delUser(Long userId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling delUser");
    }
    // create path and map variables
    String localVarPath = "/delUser"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json;charset&#x3D;utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * GetAndLockUser
   * GetAndLockUser
   * @param body  (optional)
   * @return UserObject
   * @throws ApiException if fails to make API call
   */
  public UserObject getAndLockUser(Long body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/GetAndLockUser";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json;charset&#x3D;utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=utf-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<UserObject> localVarReturnType = new GenericType<UserObject>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * GetUser
   * GetUser
   * @param userId User ID (required)
   * @return UserObject
   * @throws ApiException if fails to make API call
   */
  public UserObject getUser(Long userId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUser");
    }
    // create path and map variables
    String localVarPath = "/getUser"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json;charset&#x3D;utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<UserObject> localVarReturnType = new GenericType<UserObject>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Spends Credit
   * Spends Credit
   * @param userId User ID (required)
   * @param unitsUsed User ID (required)
   * @param unitsWanted User ID (required)
   * @param inputSessionId User ID (required)
   * @param txnId User ID (required)
   * @return ReportQuotaUsageStatus
   * @throws ApiException if fails to make API call
   */
  public ReportQuotaUsageStatus reportQuotaUsage(Long userId, Integer unitsUsed, Integer unitsWanted, Long inputSessionId, String txnId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling reportQuotaUsage");
    }
    // verify the required parameter 'unitsUsed' is set
    if (unitsUsed == null) {
      throw new ApiException(400, "Missing the required parameter 'unitsUsed' when calling reportQuotaUsage");
    }
    // verify the required parameter 'unitsWanted' is set
    if (unitsWanted == null) {
      throw new ApiException(400, "Missing the required parameter 'unitsWanted' when calling reportQuotaUsage");
    }
    // verify the required parameter 'inputSessionId' is set
    if (inputSessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'inputSessionId' when calling reportQuotaUsage");
    }
    // verify the required parameter 'txnId' is set
    if (txnId == null) {
      throw new ApiException(400, "Missing the required parameter 'txnId' when calling reportQuotaUsage");
    }
    // create path and map variables
    String localVarPath = "/ReportQuotaUsage"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "unitsUsed" + "\\}", apiClient.escapeString(unitsUsed.toString()))
      .replaceAll("\\{" + "unitsWanted" + "\\}", apiClient.escapeString(unitsWanted.toString()))
      .replaceAll("\\{" + "inputSessionId" + "\\}", apiClient.escapeString(inputSessionId.toString()))
      .replaceAll("\\{" + "txnId" + "\\}", apiClient.escapeString(txnId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json;charset&#x3D;utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ReportQuotaUsageStatus> localVarReturnType = new GenericType<ReportQuotaUsageStatus>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * UpdateLockedUser
   * UpdateLockedUser
   * @param userId userId (required)
   * @param sessionId sessionId (required)
   * @param jsonPayload jsonPayload (required)
   * @param deltaOperationName deltaOperationName (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String updateLockedUser(Long userId, Long sessionId, String jsonPayload, String deltaOperationName) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateLockedUser");
    }
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling updateLockedUser");
    }
    // verify the required parameter 'jsonPayload' is set
    if (jsonPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'jsonPayload' when calling updateLockedUser");
    }
    // verify the required parameter 'deltaOperationName' is set
    if (deltaOperationName == null) {
      throw new ApiException(400, "Missing the required parameter 'deltaOperationName' when calling updateLockedUser");
    }
    // create path and map variables
    String localVarPath = "/UpdateLockedUser"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "sessionId" + "\\}", apiClient.escapeString(sessionId.toString()))
      .replaceAll("\\{" + "jsonPayload" + "\\}", apiClient.escapeString(jsonPayload.toString()))
      .replaceAll("\\{" + "deltaOperationName" + "\\}", apiClient.escapeString(deltaOperationName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json;charset&#x3D;utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * UpsertUser
   * UpsertUser
   * @param body  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String upsertUser(Long body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/UpsertUser";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json;charset&#x3D;utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=utf-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
