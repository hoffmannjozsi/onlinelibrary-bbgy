package com.onlinelibrary.ols.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinelibrary.ols.entity.Genre;
import com.onlinelibrary.ols.repository.GenreRepository;
import com.onlinelibrary.ols.service.GenreService;

@Service
public class GenreServiceImpl implements GenreService {
	
	private GenreRepository genreRepository;

	
	
	public GenreServiceImpl(GenreRepository genreRepository) {
		super();
		this.genreRepository = genreRepository;
	}


	public GenreRepository getGenreRepository() {
		return genreRepository;
	}

	@Autowired
	public void setGenreRepository(GenreRepository genreRepository) {
		this.genreRepository = genreRepository;
	}




	@Override
	public List<Genre> getAllGenre() {
		return genreRepository.findAll();
	}


	@Override
	public String genreCount() {	
		return "" + genreRepository.count();
	}

	
}
