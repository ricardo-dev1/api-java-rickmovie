package com.dev.ricardo.rickmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.ricardo.rickmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
}
