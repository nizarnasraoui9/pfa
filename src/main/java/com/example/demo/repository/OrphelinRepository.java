package com.example.demo.repository;


import com.example.demo.model.Orphelin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "orphelin", path = "orphelin")
@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface OrphelinRepository extends JpaRepository<Orphelin,Long> {
}
