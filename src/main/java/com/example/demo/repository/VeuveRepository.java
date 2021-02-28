package com.example.demo.repository;

import com.example.demo.model.Veuve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "veuve", path = "veuve")

@Repository
public interface VeuveRepository extends JpaRepository<Veuve,Long> {


}