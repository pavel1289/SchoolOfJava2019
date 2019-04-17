package com.example.Day3SpringBoot.service;

import com.example.Day3SpringBoot.model.Card;
import com.example.Day3SpringBoot.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {
    private CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public void addCard(Card card) {
        cardRepository.addCard(card);
    }

    public Card getCardByOwnerName(String name) {
        List<Card> cards = cardRepository.getCards();
        for (Card card : cards) {
            if (card.getOwnerName().equals(name)) {
                return card;
            }
        }
        return null;
    }

    public void addTransactionToCard(Transaction transaction, Card card) {
        card.addTransaction(transaction);
    }

    public List<Transaction> getTransactionsByCard(Card card) {
        return card.getTransactions();
    }

    public Transaction getTransactionByDateInCard(String date, Card card) {
        List<Transaction> transactions = card.getTransactions();
        for (Transaction transaction : transactions) {
            if (transaction.getDate().equals(date)) {
                return transaction;
            }
        }
        return null;
    }
}
