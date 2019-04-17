package com.example.Day3SpringBoot.service;

import com.example.Day3SpringBoot.model.Transaction;
import com.example.Day3SpringBoot.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    private TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public void addTransaction(Transaction transaction) {
        transactionRepository.addTransaction(transaction);
    }
}