package com.example.demo.repository;

import com.example.demo.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.ArrayList;


public interface PersonneRepository extends JpaRepository<Personne,Long> {
    Personne findById(long id);
    ArrayList<Personne> findByNomAndPrenom(String nom, String prenom);

}

