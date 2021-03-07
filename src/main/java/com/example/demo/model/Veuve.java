package com.example.demo.model;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Veuve extends Personne {

    private int nombreEnfants;
    private int nombreEnfantsParrainees;
    private int RIB;
    private Date dateDecesMari;
    public Veuve() {

    }

    public Veuve(int cIN, int numDossier, Date dateOuvertureDossier, String nom, String prenom, Date dateDeNaissance, int numTel, String adresse, String niveauScolaire, String infoTravail, float revenueMonsuel, float montantAideMonsuelle, String siutationSanitaire, String typeCouvertureSociale, float coutMedicaments, int nombreEnfants, int nombreEnfantsParrainees, int RIB, Date dateDecesMari) {
        super(cIN, numDossier, dateOuvertureDossier, nom, prenom, dateDeNaissance, numTel, adresse, niveauScolaire, infoTravail, revenueMonsuel, montantAideMonsuelle, siutationSanitaire, typeCouvertureSociale, coutMedicaments);
        this.nombreEnfants = nombreEnfants;
        this.nombreEnfantsParrainees = nombreEnfantsParrainees;
        this.RIB = RIB;
        this.dateDecesMari = dateDecesMari;
    }

    public int getNombreEnfants() {
        return nombreEnfants;
    }
    public void setNombreEnfants(int nombreEnfants) {
        this.nombreEnfants = nombreEnfants;
    }
    public int getNombreEnfantsParrainees() {
        return nombreEnfantsParrainees;
    }
    public void setNombreEnfantsParrainees(int nombreEnfantsParrainees) {
        this.nombreEnfantsParrainees = nombreEnfantsParrainees;
    }
    public int getRIB() {
        return RIB;
    }
    public void setRIB(int rIB) {
        RIB = rIB;
    }
    public Date getDateDecesMari() {
        return dateDecesMari;
    }
    public void setDateDecesMari(Date dateDecesMari) {
        this.dateDecesMari = dateDecesMari;
    }


}