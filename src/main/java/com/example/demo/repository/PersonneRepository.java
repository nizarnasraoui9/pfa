package com.example.demo.repository;

import com.example.demo.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;

@CrossOrigin(origins = "http://localhost:4200")
public interface PersonneRepository extends JpaRepository<Personne,Long> {
    Personne findById(long id);
    ArrayList<Personne> findByNomAndPrenom(String nom, String prenom);
    ArrayList<Personne> findByMatricule(long matricule);
    Personne findByMatriculeAndNomAndPrenom(long matricule, String nom, String prenom);
}

