package com.example.day07.ex3.repository;

import com.example.day07.ex3.entities.JobName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<JobName, Integer> {
}
