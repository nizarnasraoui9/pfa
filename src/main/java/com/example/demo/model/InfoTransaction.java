package com.example.demo.model;

import java.sql.Date;

public class InfoTransaction {
    long parrainId;
    long PersonneId;
    float montant;
    Date date;

    public long getParrainId() {
        return parrainId;
    }

    public void setParrainId(long parrainId) {
        this.parrainId = parrainId;
    }

    public long getPersonneId() {
        return PersonneId;
    }

    public void setPersonneId(long personneId) {
        PersonneId = personneId;
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


}
