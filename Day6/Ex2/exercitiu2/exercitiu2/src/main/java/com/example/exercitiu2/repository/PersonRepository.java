package com.example.exercitiu2.repository;

import com.example.exercitiu2.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
