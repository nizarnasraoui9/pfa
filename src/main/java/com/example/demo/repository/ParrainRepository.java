package com.example.demo.repository;

import com.example.demo.model.Parrain;
import com.example.demo.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;

@RepositoryRestResource(collectionResourceRel = "parrain",path="parrain")
@CrossOrigin(origins = "http://localhost:4200")
public interface ParrainRepository extends JpaRepository<Parrain,Long> {
    Parrain findById(long id);
    Parrain findByNomAndPrenom(String nom, String prenom);
}
