package com.example.Day3SpringBoot.service;

import com.example.Day3SpringBoot.model.BankAccount;
import com.example.Day3SpringBoot.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

@Service
public class BankAccountService {
    private BankAccountRepository bankAccountRepository;

    @Autowired
    public BankAccountService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    public void addBankAccount(BankAccount bankAccount, HttpServletResponse response) {
        if (bankAccount.getAmount() > 50) {
            bankAccountRepository.addBankAccount(bankAccount);
        }
        else {
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        }
    }
}
