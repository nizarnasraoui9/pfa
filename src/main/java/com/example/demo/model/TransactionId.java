package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TransactionId implements Serializable {

    @Column(name="parrainId")
    private Long parrainId;
    @Column(name="id")
    private Long id;



    public TransactionId(Long parrainId, Long id) {
        this.parrainId = parrainId;
        this.id = id;
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
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
