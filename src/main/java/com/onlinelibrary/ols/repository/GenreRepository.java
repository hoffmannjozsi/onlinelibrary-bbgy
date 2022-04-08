package com.onlinelibrary.ols.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinelibrary.ols.entity.Genre;


public interface GenreRepository extends JpaRepository<Genre, Long>  {

	
	
	List<Genre> findAll();
}
