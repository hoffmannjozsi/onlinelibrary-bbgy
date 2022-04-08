package com.onlinelibrary.ols.service;

import java.util.List;

import com.onlinelibrary.ols.entity.Genre;

public interface GenreService {
	
	List<Genre> getAllGenre();
	
	String genreCount();

}
