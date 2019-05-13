package com.schoolofjava.noSQLTest.service;

import com.schoolofjava.noSQLTest.model.Cast;
import com.schoolofjava.noSQLTest.model.Movie;
import com.schoolofjava.noSQLTest.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private CastService castService;

    public Movie add(Movie movie) {
        Cast cast = castService.save(movie.getCast());
        movie.setCast(cast);
        return movieRepository.save(movie);
    }

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }
}
