package com.example.demo.model;

import com.example.demo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Embeddable
public class TransactionId implements Serializable {
    private Long parrainId;
    private Long personneId;
    private long transactionNum;




    public TransactionId(Long parrainId, Long personneId,long numberOfTransactions) {
        this.parrainId = parrainId;
        this.personneId = personneId;
        this.transactionNum=numberOfTransactions++;
    }

    public TransactionId() {

    }

    public Long getParrainId() {
        return parrainId;
    }

    public void setParrainId(Long parrainId) {
        this.parrainId = parrainId;
    }

    public Long getId() {
        return personneId;
    }

    public void setId(Long id) {
        this.personneId = id;
    }

    public long getTransactionNum() {
        return transactionNum;
    }

    public void setTransactionNum(long transactionNum) {
        this.transactionNum = transactionNum;
    }
}
