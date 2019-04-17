package com.example.Day3SpringBoot.controller;

import com.example.Day3SpringBoot.model.Card;
import com.example.Day3SpringBoot.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
public class CardController {
    private CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping(path = "/add/card")
    public void addCard(@RequestBody Card card) {
        cardService.addCard(card);
    }

    @GetMapping(path = "/get/card/{name}")
    public ResponseEntity<Card> getCardByOwnerName(@PathVariable String name) {
        Card card = cardService.getCardByOwnerName(name);
        ResponseEntity<Card> responseEntity = new ResponseEntity<>(card, HttpStatus.OK);
        return responseEntity;
    }

    @PostMapping(path = "/add/transaction")
    public void addTransaction(@RequestBody Transaction transaction, Card card) {
        cardService.addTransactionToCard(transaction, card);
    }

    @GetMapping(path = "/get/transaction/{name}/{date}")
    public ResponseEntity<Transaction> getTransactionByDateInCard(@PathVariable String name, @PathVariable String date) {
        Card card = cardService.getCardByOwnerName(name);
        Transaction transaction = cardService.getTransactionByDateInCard(date, card);
        ResponseEntity<Transaction> responseEntity = new ResponseEntity<>(transaction, HttpStatus.OK);
        return responseEntity;

    }
}
