package com.tjulab.demo.io.aelf.schemas;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SendTransactionOutput {

  @JsonProperty("TransactionId")
  private String transactionId;

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  @Override
  public String toString() {
    return "SendTransactionOutput{" +
            "transactionId='" + transactionId + '\'' +
            '}';
  }
}
