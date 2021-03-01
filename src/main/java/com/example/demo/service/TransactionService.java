package com.example.demo.service;

import com.example.demo.model.*;
import com.example.demo.repository.ParrainRepository;
import com.example.demo.repository.PersonneRepository;
import com.example.demo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class TransactionService {
    @Autowired
    PersonneRepository personneRepo;
    @Autowired
    ParrainRepository parrainRepository;
    @Autowired
    TransactionRepository transactionRepository;

    public void doTransaction(InfoTransaction transaction) {
        float montant=transaction.getMontant();
        Date date=transaction.getDate();
        long parrainId=transaction.getParrainId();
        long personneId=transaction.getPersonneId();
        Personne personne= personneRepo.findById(parrainId);
        Parrain parrain=parrainRepository.findById(parrainId);
        Transaction newTransaction=new Transaction(montant,date,parrain,personne);
        transactionRepository.save(newTransaction);

    }
}
