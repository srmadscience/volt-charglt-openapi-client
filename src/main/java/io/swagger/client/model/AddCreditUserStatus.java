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
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * AddCreditUserStatus
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-02-20T20:15:30.641977Z[Europe/Dublin]")

public class AddCreditUserStatus {
  @JsonProperty("userId")
  private Long userId = null;

  @JsonProperty("balance")
  private Long balance = null;

  @JsonProperty("currentlyAllocated")
  private Long currentlyAllocated = null;

  public AddCreditUserStatus userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public AddCreditUserStatus balance(Long balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @Schema(description = "")
  public Long getBalance() {
    return balance;
  }

  public void setBalance(Long balance) {
    this.balance = balance;
  }

  public AddCreditUserStatus currentlyAllocated(Long currentlyAllocated) {
    this.currentlyAllocated = currentlyAllocated;
    return this;
  }

   /**
   * Get currentlyAllocated
   * @return currentlyAllocated
  **/
  @Schema(description = "")
  public Long getCurrentlyAllocated() {
    return currentlyAllocated;
  }

  public void setCurrentlyAllocated(Long currentlyAllocated) {
    this.currentlyAllocated = currentlyAllocated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddCreditUserStatus addCreditUserStatus = (AddCreditUserStatus) o;
    return Objects.equals(this.userId, addCreditUserStatus.userId) &&
        Objects.equals(this.balance, addCreditUserStatus.balance) &&
        Objects.equals(this.currentlyAllocated, addCreditUserStatus.currentlyAllocated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, balance, currentlyAllocated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddCreditUserStatus {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currentlyAllocated: ").append(toIndentedString(currentlyAllocated)).append("\n");
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
