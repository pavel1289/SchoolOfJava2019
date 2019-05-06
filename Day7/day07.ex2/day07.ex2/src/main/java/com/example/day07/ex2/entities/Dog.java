package com.example.day07.ex2.entities;

import com.example.day07.ex2.pk.DogPk;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Entity
public class Dog implements Serializable {
    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private DogPk dogPk;

    private String name;
    private String color;

    public DogPk getDogPk() {
        return dogPk;
    }

    public void setDogPk(DogPk dogPk) {
        this.dogPk = dogPk;
    }
}
