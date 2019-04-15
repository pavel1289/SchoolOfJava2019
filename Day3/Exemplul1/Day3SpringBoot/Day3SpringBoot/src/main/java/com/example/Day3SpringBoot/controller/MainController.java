package com.example.Day3SpringBoot.controller;


import com.example.Day3SpringBoot.model.BankAccount;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    //@RequestMapping(path = "/myresourse/{name}", method = RequestMethod.GET)
    @GetMapping(path = "/myresourse/{name}")
    public ResponseEntity<String> firstGet(@PathVariable String name) {
        String value = "<h1>Welcome " + name + "! This is my first web service</h1>";
        ResponseEntity<String> responseEntity = new ResponseEntity<>(value, HttpStatus.OK);
        return responseEntity;
    }

    @PostMapping(path = "/mypost")
    public  ResponseEntity<BankAccount> myPost(@RequestBody BankAccount bankAccount) {
        bankAccount.setAmount(bankAccount.getAmount() + 50);
        ResponseEntity<BankAccount> responseEntity = new ResponseEntity<>(bankAccount, HttpStatus.OK);
        return responseEntity;
    }
}
