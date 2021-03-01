package com.example.demo.model;

import javax.persistence.*;

@Entity
public class TransactionNum {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long id;



    public TransactionNum(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
