package com.example.demo.controller;

import com.example.demo.model.Parrain;
import com.example.demo.model.Personne;
import com.example.demo.repository.ParrainRepository;
import com.example.demo.repository.PersonneCrudRepository;
import com.example.demo.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Set;

@CrossOrigin(origins = "http://localhost:4200")
@ResponseBody
@RestController
public class ParrainController {
    @Autowired
    ParrainRepository parrainRepository;
    @Autowired
    PersonneRepository personneRepository;
    @Autowired
    PersonneCrudRepository personneCrudRepository;
    @GetMapping(path="findparrain/{nom}/{prenom}")
    public Parrain getParrain(@PathVariable("nom") String nom, @PathVariable("prenom") String prenom){
        return parrainRepository.findByNomAndPrenom(nom,prenom);
    }
    @PostMapping(path ="addParrain/{nomParrain}/{prenomParrain}/{idPersonne}")
    public void addParrin(@PathVariable("nomParrain")String nomParrin,@PathVariable("prenomParrain")String prenomParrain,
                          @PathVariable("idPersonne")long idPersonne){
        Parrain parrain=parrainRepository.findByNomAndPrenom(nomParrin,prenomParrain);
        if(parrain !=null){
            Personne personne=personneRepository.findById(idPersonne);
            Set<Parrain> personneParrain= personne.getParrains();
            personneParrain.add(parrain);
            personneCrudRepository.save(personne);
        }

    }
}
