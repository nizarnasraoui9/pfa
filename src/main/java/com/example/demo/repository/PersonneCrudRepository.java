package com.example.demo.repository;

import com.example.demo.model.Personne;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;


@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface PersonneCrudRepository extends CrudRepository<Personne,Long> {
}
