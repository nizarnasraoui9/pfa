package com.example.demo.controller;

import com.example.demo.model.Personne;
import com.example.demo.model.Veuve;
import com.example.demo.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RecherchePersonne {
    @Autowired
    PersonneRepository personneRepository;
    @GetMapping(path="recherche/{nom}/{prenom}")
    public ArrayList<Personne> rechercherPersonne(@PathVariable("nom")String nom, @PathVariable("prenom")String prenom){
        return personneRepository.findByNomAndPrenom(nom,prenom);

    }
}
