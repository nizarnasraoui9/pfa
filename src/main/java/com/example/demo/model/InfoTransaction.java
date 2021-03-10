package com.example.demo.model;

import java.sql.Date;
import java.util.Calendar;

public class InfoTransaction {
    long parrainId;
    long personneId;
    float montant;
    Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());

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
