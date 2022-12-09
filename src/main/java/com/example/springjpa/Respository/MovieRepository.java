package com.example.springjpa.Respository;

import com.example.springjpa.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,String> {
}
