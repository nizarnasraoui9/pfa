package com.example.demo.model;

import java.util.*;

import javax.persistence.Entity;

@Entity
public class Veuve extends Personne {
    private int nombreEnfants;
    private int nombreEnfantsParrainees;
    private int RIB;
    private Date dateDecesMari;
    public Veuve() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Veuve(int id, int cIN, int numDossier, Date dateOuvertureDossier, String nom, String prenom,
                 Date dateDeNaissance, int numTel, String adresse, String niveauScolaire, String typeTravaille,
                 String situationTravaille, float revenueMonsuel, float montantAideMonsuelle, String siutationSanitaire,
                 String typeCouvertureSociale, float coutMedicaments) {
        super(id, cIN, dateOuvertureDossier, nom, prenom, dateDeNaissance, numTel, adresse, niveauScolaire,
                typeTravaille, situationTravaille, revenueMonsuel, montantAideMonsuelle, siutationSanitaire,
                typeCouvertureSociale, coutMedicaments);
        // TODO Auto-generated constructor stub
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