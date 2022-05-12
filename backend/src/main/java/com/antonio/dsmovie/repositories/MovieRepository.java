package com.antonio.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antonio.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository <Movie, Long>{
		
}
