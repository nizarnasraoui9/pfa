package com.example.demo.model;

import java.util.*;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public abstract class Personne {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected long id;
    protected long matricule;
    protected long cin;
    protected Date dateOuvertureDossier;
    protected String nom;
    protected String prenom;
    protected java.util.Date dateDeNaissance;
    protected int numTel;
    protected String adresse;
    protected String niveauScolaire;
    protected String infoTravail;
    protected float revenueMonsuel;
    protected float montantAideMonsuelle;
    protected String siutationSanitaire;
    protected String typeCouvertureSociale;
    protected float coutMedicaments;
    @OneToMany(mappedBy = "personne")

    List<Image> images=new ArrayList<Image>();
    @ManyToMany
    Set<Parrain> parrains=new HashSet<Parrain>();

    public Personne() {

    }
    public Personne( long matricule, long cin, Date dateOuvertureDossier, String nom, String prenom,
                     Date dateDeNaissance, int numTel, String adresse, String niveauScolaire, String infoTravail,
                     float revenueMonsuel, float montantAideMonsuelle, String siutationSanitaire,
                     String typeCouvertureSociale, float coutMedicaments) {
        super();
        this.matricule=matricule;
        cin = cin;
        this.dateOuvertureDossier = dateOuvertureDossier;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.numTel = numTel;
        this.adresse = adresse;
        this.niveauScolaire = niveauScolaire;
        this.infoTravail = infoTravail;
        this.revenueMonsuel = revenueMonsuel;
        this.montantAideMonsuelle = montantAideMonsuelle;
        this.siutationSanitaire = siutationSanitaire;
        this.typeCouvertureSociale = typeCouvertureSociale;
        this.coutMedicaments = coutMedicaments;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCin() {
        return cin;
    }

    public void setCin(long cin) {
        this.cin = cin;
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

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
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

    public String getInfoTravail() {
        return infoTravail;
    }

    public void setInfoTravail(String infoTravail) {
        this.infoTravail = infoTravail;
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

    public Set<Parrain> getParrains() {
        return parrains;
    }

    public void setParrains(Set<Parrain> parrains) {
        this.parrains = parrains;
    }

    public long getMatricule() {
        return matricule;
    }

    public void setMatricule(long matricule) {
        this.matricule = matricule;
    }
}