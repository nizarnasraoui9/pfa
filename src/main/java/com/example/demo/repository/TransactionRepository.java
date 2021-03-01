package com.example.demo.repository;

import com.example.demo.model.Transaction;
import com.example.demo.model.TransactionId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface TransactionRepository extends CrudRepository<Transaction, TransactionId> {
}
