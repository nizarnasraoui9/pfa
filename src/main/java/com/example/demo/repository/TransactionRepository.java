package com.example.demo.repository;

import com.example.demo.model.Transaction;
import com.example.demo.model.TransactionId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.ArrayList;
import java.util.List;

public interface TransactionRepository extends CrudRepository<Transaction, TransactionId> {
    @Query(value="select * from TRANSACTION where PERSONNE_ID = ?1", nativeQuery = true)
    ArrayList<Transaction> getTransactionById(long id);
}
