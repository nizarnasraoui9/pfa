package com.example.demo.model;
import java.util.*;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public abstract class Personne {

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    protected long id;
    protected int CIN;
    protected int numDossier;
    protected Date dateOuvertureDossier;
    protected String nom;
    protected String prenom;
    protected java.util.Date dateDeNaissance;
    protected int numTel;
    protected String adresse;
    protected String niveauScolaire;
    protected String typeTravaille;
    protected String situationTravaille;
    protected float revenueMonsuel;
    protected float montantAideMonsuelle;
    protected String siutationSanitaire;
    protected String typeCouvertureSociale;
    protected float coutMedicaments;
    @OneToMany(mappedBy = "personne")
    List<Image> images=new ArrayList<Image>();

    public Personne() {

    }
    public Personne( int cIN, int numDossier, Date dateOuvertureDossier, String nom, String prenom,
                     Date dateDeNaissance, int numTel, String adresse, String niveauScolaire, String typeTravaille,
                     String situationTravaille, float revenueMonsuel, float montantAideMonsuelle, String siutationSanitaire,
                     String typeCouvertureSociale, float coutMedicaments) {
        super();
        CIN = cIN;
        this.numDossier = numDossier;
        this.dateOuvertureDossier = dateOuvertureDossier;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.numTel = numTel;
        this.adresse = adresse;
        this.niveauScolaire = niveauScolaire;
        this.typeTravaille = typeTravaille;
        this.situationTravaille = situationTravaille;
        this.revenueMonsuel = revenueMonsuel;
        this.montantAideMonsuelle = montantAideMonsuelle;
        this.siutationSanitaire = siutationSanitaire;
        this.typeCouvertureSociale = typeCouvertureSociale;
        this.coutMedicaments = coutMedicaments;
    }

    public long getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCIN() {
        return CIN;
    }
    public void setCIN(int cIN) {
        CIN = cIN;
    }
    public int getNumDossier() {
        return numDossier;
    }
    public void setNumDossier(int numDossier) {
        this.numDossier = numDossier;
    }
    public Date getDateOuvertureDossier() {
        return dateOuvertureDossier;
    }
    public void setDateOuvertureDossier(Date dateOuvertureDossier) {
        this.dateOuvertureDossier = dateOuvertureDossier;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public java.util.Date getDateDeNaissance() {
        return dateDeNaissance;
    }
    public void setDateDeNaissance(java.util.Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }
    public int getNumTel() {
        return numTel;
    }
    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getNiveauScolaire() {
        return niveauScolaire;
    }
    public void setNiveauScolaire(String niveauScolaire) {
        this.niveauScolaire = niveauScolaire;
    }
    public String getTypeTravaille() {
        return typeTravaille;
    }
    public void setTypeTravaille(String typeTravaille) {
        this.typeTravaille = typeTravaille;
    }
    public String getSituationTravaille() {
        return situationTravaille;
    }
    public void setSituationTravaille(String situationTravaille) {
        this.situationTravaille = situationTravaille;
    }
    public float getRevenueMonsuel() {
        return revenueMonsuel;
    }
    public void setRevenueMonsuel(float revenueMonsuel) {
        this.revenueMonsuel = revenueMonsuel;
    }
    public float getMontantAideMonsuelle() {
        return montantAideMonsuelle;
    }
    public void setMontantAideMonsuelle(float montantAideMonsuelle) {
        this.montantAideMonsuelle = montantAideMonsuelle;
    }
    public String getSiutationSanitaire() {
        return siutationSanitaire;
    }
    public void setSiutationSanitaire(String siutationSanitaire) {
        this.siutationSanitaire = siutationSanitaire;
    }
    public String getTypeCouvertureSociale() {
        return typeCouvertureSociale;
    }
    public void setTypeCouvertureSociale(String typeCouvertureSociale) {
        this.typeCouvertureSociale = typeCouvertureSociale;
    }
    public float getCoutMedicaments() {
        return coutMedicaments;
    }
    public void setCoutMedicaments(float coutMedicaments) {
        this.coutMedicaments = coutMedicaments;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}