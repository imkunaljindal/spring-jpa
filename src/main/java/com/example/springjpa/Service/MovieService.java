package com.example.springjpa.Service;

import com.example.springjpa.Model.Movie;
import com.example.springjpa.Respository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public void addMovie(Movie movie){
        movieRepository.save(movie);
    }
}
