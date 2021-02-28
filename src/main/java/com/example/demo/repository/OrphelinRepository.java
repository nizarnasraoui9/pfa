package com.example.demo.repository;


import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "orphelin", path = "orphelin")
@Repository
public interface OrphelinRepository extends PersonneRepository{
}
