package com.example.demo.repository;

import com.example.demo.model.Parrain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "parrain",path="parrain")
public interface ParrainRepository extends JpaRepository<Parrain,Long> {
    Parrain findById(long id);
}
