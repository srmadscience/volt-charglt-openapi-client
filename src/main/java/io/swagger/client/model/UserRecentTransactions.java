/*
 * 
 * 
 *
 * 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.client.model.TimestampType;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * UserRecentTransactions
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-02-20T20:15:30.641977Z[Europe/Dublin]")

public class UserRecentTransactions {
  @JsonProperty("txnId")
  private String txnId = null;

  @JsonProperty("txnTime")
  private TimestampType txnTime = null;

  @JsonProperty("sessionId")
  private Long sessionId = null;

  @JsonProperty("approvedAmount")
  private Long approvedAmount = null;

  @JsonProperty("spentAmount")
  private Long spentAmount = null;

  @JsonProperty("purpose")
  private String purpose = null;

  public UserRecentTransactions txnId(String txnId) {
    this.txnId = txnId;
    return this;
  }

   /**
   * Get txnId
   * @return txnId
  **/
  @Schema(description = "")
  public String getTxnId() {
    return txnId;
  }

  public void setTxnId(String txnId) {
    this.txnId = txnId;
  }

  public UserRecentTransactions txnTime(TimestampType txnTime) {
    this.txnTime = txnTime;
    return this;
  }

   /**
   * Get txnTime
   * @return txnTime
  **/
  @Schema(description = "")
  public TimestampType getTxnTime() {
    return txnTime;
  }

  public void setTxnTime(TimestampType txnTime) {
    this.txnTime = txnTime;
  }

  public UserRecentTransactions sessionId(Long sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Get sessionId
   * @return sessionId
  **/
  @Schema(description = "")
  public Long getSessionId() {
    return sessionId;
  }

  public void setSessionId(Long sessionId) {
    this.sessionId = sessionId;
  }

  public UserRecentTransactions approvedAmount(Long approvedAmount) {
    this.approvedAmount = approvedAmount;
    return this;
  }

   /**
   * Get approvedAmount
   * @return approvedAmount
  **/
  @Schema(description = "")
  public Long getApprovedAmount() {
    return approvedAmount;
  }

  public void setApprovedAmount(Long approvedAmount) {
    this.approvedAmount = approvedAmount;
  }

  public UserRecentTransactions spentAmount(Long spentAmount) {
    this.spentAmount = spentAmount;
    return this;
  }

   /**
   * Get spentAmount
   * @return spentAmount
  **/
  @Schema(description = "")
  public Long getSpentAmount() {
    return spentAmount;
  }

  public void setSpentAmount(Long spentAmount) {
    this.spentAmount = spentAmount;
  }

  public UserRecentTransactions purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * Get purpose
   * @return purpose
  **/
  @Schema(description = "")
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRecentTransactions userRecentTransactions = (UserRecentTransactions) o;
    return Objects.equals(this.txnId, userRecentTransactions.txnId) &&
        Objects.equals(this.txnTime, userRecentTransactions.txnTime) &&
        Objects.equals(this.sessionId, userRecentTransactions.sessionId) &&
        Objects.equals(this.approvedAmount, userRecentTransactions.approvedAmount) &&
        Objects.equals(this.spentAmount, userRecentTransactions.spentAmount) &&
        Objects.equals(this.purpose, userRecentTransactions.purpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txnId, txnTime, sessionId, approvedAmount, spentAmount, purpose);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRecentTransactions {\n");
    
    sb.append("    txnId: ").append(toIndentedString(txnId)).append("\n");
    sb.append("    txnTime: ").append(toIndentedString(txnTime)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    approvedAmount: ").append(toIndentedString(approvedAmount)).append("\n");
    sb.append("    spentAmount: ").append(toIndentedString(spentAmount)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}