package com.schoolofjava.noSQLTest.repository;

import com.schoolofjava.noSQLTest.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {

}
