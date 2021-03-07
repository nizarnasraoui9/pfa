package com.example.demo.repository;

import com.example.demo.model.Personne;
import com.example.demo.model.Veuve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;

@RepositoryRestResource(collectionResourceRel = "veuve", path = "veuve")
@Repository
@CrossOrigin(origins = "*")
public interface VeuveRepository extends JpaRepository<Veuve,Long> {


}