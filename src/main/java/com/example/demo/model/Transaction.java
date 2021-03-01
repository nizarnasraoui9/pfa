package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Transaction implements Serializable {

    @EmbeddedId
    private TransactionId transactionId;
    private float montant;
    private Date date;
    @ManyToOne
    @MapsId("parrainId")
    @JoinColumn(name = "parrainId")
    private Parrain parrain;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name="personneId")
    private Personne personne;

    public Transaction() {

    }

    public Transaction(float montant, Date date, Parrain parrain, Personne personne,long numberOfTransactions) {

        this.transactionId=new TransactionId(parrain.getId(), personne.id,numberOfTransactions);
        this.montant = montant;
        this.date = date;
        this.parrain = parrain;
        this.personne = personne;
    }

    public TransactionId getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(TransactionId transactionId) {
        this.transactionId = transactionId;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Parrain getParrain() {
        return parrain;
    }

    public void setParrain(Parrain parrain) {
        this.parrain = parrain;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }
}