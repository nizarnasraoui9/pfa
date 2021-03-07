package com.example.demo.model;

import java.util.*;


import javax.persistence.Entity;

@Entity
public class Orphelin extends Personne {
    private String sexe;
    private String situationConjugale;
    private boolean etudie;
    private boolean parraine;
    public Orphelin() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Orphelin(int cIN, int numDossier, Date dateOuvertureDossier, String nom, String prenom, Date dateDeNaissance, int numTel, String adresse, String niveauScolaire, String infoTravail, float revenueMonsuel, float montantAideMonsuelle, String siutationSanitaire, String typeCouvertureSociale, float coutMedicaments, String sexe, String situationConjugale, boolean etudie, boolean parraine) {
        super(cIN, numDossier, dateOuvertureDossier, nom, prenom, dateDeNaissance, numTel, adresse, niveauScolaire, infoTravail, revenueMonsuel, montantAideMonsuelle, siutationSanitaire, typeCouvertureSociale, coutMedicaments);
        this.sexe = sexe;
        this.situationConjugale = situationConjugale;
        this.etudie = etudie;
        this.parraine = parraine;
    }

    public String getSexe() {
        return sexe;
    }
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    public String getSituationConjugale() {
        return situationConjugale;
    }
    public void setSituationConjugale(String situationConjugale) {
        this.situationConjugale = situationConjugale;
    }
    public boolean isEtudie() {
        return etudie;
    }
    public void setEtudie(boolean etudie) {
        this.etudie = etudie;
    }
    public boolean isParraine() {
        return parraine;
    }
    public void setParraine(boolean parraine) {
        this.parraine = parraine;
    }



}
