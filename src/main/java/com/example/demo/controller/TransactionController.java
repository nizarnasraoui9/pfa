package com.example.demo.controller;

import com.example.demo.model.InfoTransaction;
import com.example.demo.model.Transaction;
import com.example.demo.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
    @Autowired
    TransactionService transactionService;
    @PostMapping("transaction")
    public void addTransaction(@RequestBody InfoTransaction transaction){
        transactionService.doTransaction(transaction);

    }

}
