package com.endava.demo.repository;

import com.endava.demo.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int add(Movie movie) {
        String query = "INSERT into movie values (?, ?, ?)";
        return jdbcTemplate.update(query, movie.getId(), movie.getTitle(), movie.getGenre());
    }

    public int delete(int id) {
        String query = "DELETE from movie WHERE id=?";
        return jdbcTemplate.update(query, id);
    }
}
