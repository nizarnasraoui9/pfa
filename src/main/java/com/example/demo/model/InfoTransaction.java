package com.example.demo.model;

import java.sql.Date;

public class InfoTransaction {
    long parrainId;
    long personneId;
    float montant;
    Date date;

    public long getParrainId() {
        return parrainId;
    }

    public long getPersonneId() {
        return personneId;
    }

    public float getMontant() {
        return montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
