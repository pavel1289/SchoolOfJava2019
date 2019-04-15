package com.example.Day3SpringBoot.controller;

import com.example.Day3SpringBoot.model.BankAccount;
import com.example.Day3SpringBoot.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class BankAccountController {
    private BankAccountService bankAccountService;

    @Autowired
    public BankAccountController(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }
    @PostMapping(path = "/add/account")
    public void addBankAccount(@RequestBody BankAccount bankAccount, HttpServletResponse response) {
        bankAccountService.addBankAccount(bankAccount, response);
    }
}
