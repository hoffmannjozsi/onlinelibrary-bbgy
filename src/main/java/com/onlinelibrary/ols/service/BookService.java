package com.onlinelibrary.ols.service;

import java.util.List;

import com.onlinelibrary.ols.entity.Book;

public interface BookService {

	List<Book> getAllBook();
			
	//Book saveBook(Book book);
	
	//Book updateBook(Book book);
	
	Book getBookById(Long id);
			
	//Book viewBook(Long id);
	
	List<Book> emptyBookList();
	
	List<Book> findByKeyword(String keyword);
	
	List<Book> findByGenreId (Long genreId);
	
	String bookCount();
		
	List<Book> listNewBooks(Long newGenreId);
	
}
