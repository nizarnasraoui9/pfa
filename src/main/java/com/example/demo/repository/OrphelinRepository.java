package com.example.demo.repository;


import com.example.demo.model.Orphelin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "orphelin", path = "orphelin")
@Repository
public interface OrphelinRepository extends JpaRepository<Orphelin,Long> {
}
