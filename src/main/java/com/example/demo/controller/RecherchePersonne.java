package com.example.demo.controller;

import com.example.demo.model.Personne;
import com.example.demo.model.Veuve;
import com.example.demo.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@ResponseBody
public class RecherchePersonne {
    @Autowired
    PersonneRepository personneRepository;
    @GetMapping(path="recherche/{nom}/{prenom}")
    public ArrayList<Personne> rechercherPersonne(@PathVariable("nom")String nom, @PathVariable("prenom")String prenom){
        return personneRepository.findByNomAndPrenom(nom,prenom);

    }
    @GetMapping(path="recherche/{matricule}")
    public ArrayList<Personne> rechercherPersonne(@PathVariable("matricule")long matricule){
        return personneRepository.findByMatricule(matricule);

    }
}
