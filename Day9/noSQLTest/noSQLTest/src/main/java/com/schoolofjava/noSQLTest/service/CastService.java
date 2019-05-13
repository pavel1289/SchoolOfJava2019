package com.schoolofjava.noSQLTest.service;

import com.schoolofjava.noSQLTest.model.Cast;
import com.schoolofjava.noSQLTest.repository.CastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CastService {
    @Autowired
    private CastRepository castRepository;

    public Cast save(Cast cast) {
        return castRepository.save(cast);
    }
}
