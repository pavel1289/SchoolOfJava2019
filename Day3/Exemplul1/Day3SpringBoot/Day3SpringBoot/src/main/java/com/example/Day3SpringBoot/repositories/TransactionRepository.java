package com.example.Day3SpringBoot.repositories;

import com.example.Day3SpringBoot.model.Transaction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class TransactionRepository {
    List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<TransactionRepository> getTransactions() {
        return transactions;
    }
}