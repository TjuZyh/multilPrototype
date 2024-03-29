package com.tjulab.demo.io.aelf.schemas;

import com.fasterxml.jackson.annotation.JsonProperty;
import  com.tjulab.demo.io.aelf.schemas.TransactionDto;

public class SendRawTransactionOutput {

  @JsonProperty("TransactionId")
  private String transactionId;
  @JsonProperty("Transaction")
  private TransactionDto transaction;

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public TransactionDto getTransaction() {
    return transaction;
  }

  public void setTransaction(TransactionDto transaction) {
    this.transaction = transaction;
  }
}
