package com.example.demo.service;

import com.example.demo.exception.PersonNotFound;
import com.example.demo.model.*;
import com.example.demo.repository.ParrainRepository;
import com.example.demo.repository.PersonneRepository;
import com.example.demo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;

@Service
public class TransactionService {
    @Autowired
    PersonneRepository personneRepo;
    @Autowired
    ParrainRepository parrainRepository;
    @Autowired
    TransactionRepository transactionRepository;

    public void doTransaction(InfoTransaction transaction) throws PersonNotFound {
        float montant=transaction.getMontant();
        Date date=transaction.getDate();
        long parrainId=transaction.getParrainId();
        long personneId=transaction.getPersonneId();
        Personne personne= personneRepo.findById(personneId);
        Parrain parrain=parrainRepository.findById(parrainId);
        if(personne==null || parrain==null){
            throw new PersonNotFound();
        }
        System.out.println(personne);
        ArrayList<Transaction> transactions=transactionRepository.getTransactionById(personneId);
        int numberOfTransactions=transactions.size();
        Transaction newTransaction=new Transaction(montant,date,parrain,personne,numberOfTransactions);
        transactionRepository.save(newTransaction);

    }
}
