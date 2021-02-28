package com.example.demo.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "veuve", path = "veuve")

@Repository
public interface VeuveRepository extends PersonneRepository {


}