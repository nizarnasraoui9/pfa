package com.example.demo.model;

import java.util.*;


import javax.persistence.Entity;

@Entity
public class Orphelin extends Personne {
    private String sexe;
    private String situationConjugale;
    public Orphelin() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Orphelin(long matricule, long cin, Date dateOuvertureDossier, String nom, String prenom, Date dateDeNaissance, int numTel, String adresse, String niveauScolaire, String infoTravail, float revenueMonsuel, float montantAideMonsuelle, String siutationSanitaire, String typeCouvertureSociale, float coutMedicaments, String sexe, String situationConjugale) {
        super(matricule, cin, dateOuvertureDossier, nom, prenom, dateDeNaissance, numTel, adresse, niveauScolaire, infoTravail, revenueMonsuel, montantAideMonsuelle, siutationSanitaire, typeCouvertureSociale, coutMedicaments);
        this.sexe = sexe;
        this.situationConjugale = situationConjugale;
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
}
