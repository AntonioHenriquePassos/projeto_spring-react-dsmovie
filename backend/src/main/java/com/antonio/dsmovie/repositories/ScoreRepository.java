package com.antonio.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antonio.dsmovie.entities.Score;
import com.antonio.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository <Score, ScorePK>{
		
}
