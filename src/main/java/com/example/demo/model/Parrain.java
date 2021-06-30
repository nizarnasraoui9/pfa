package com.example.demo.model;

import javax.persistence.*;
import java.util.*;

@Entity
public class Parrain {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long parrainId;
    private int CIN;
    private String nom;
    private String prenom;
    private int telephone;
    @ManyToMany
    Set<Personne> personnes= new HashSet<>();
    public Parrain() {
        this.nom=null;
        this.CIN=0;
        this.prenom=null;
        this.telephone=0;
    }
    public Parrain(int cIN, String nom, String prenom, int telephone) {
        CIN = cIN;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }
    public long getId() {
        return parrainId;
    }
    public void setId(int id) {
        this.parrainId = id;
    }
    public int getCIN() {
        return CIN;
    }
    public void setCIN(int cIN) {
        CIN = cIN;
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
    public int getTelephone() {
        return telephone;
    }
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public Set<Personne> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(Set<Personne> personnes) {
        this.personnes = personnes;
    }
}