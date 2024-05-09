package com.dev.ricardo.rickmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.ricardo.rickmovie.entities.Score;
import com.dev.ricardo.rickmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
}
