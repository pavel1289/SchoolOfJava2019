package com.schoolofjava.noSQLTest.repository;

import com.schoolofjava.noSQLTest.model.Cast;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CastRepository extends MongoRepository<Cast, String> {
}
