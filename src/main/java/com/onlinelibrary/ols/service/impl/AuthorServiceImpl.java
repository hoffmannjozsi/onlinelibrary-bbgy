package com.onlinelibrary.ols.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onlinelibrary.ols.entity.Author;
import com.onlinelibrary.ols.repository.AuthorRepository;
import com.onlinelibrary.ols.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {
	
	private AuthorRepository authorRepositoty;
	
	

	public AuthorServiceImpl(AuthorRepository authorRepositoty) {
		super();
		this.authorRepositoty = authorRepositoty;
	}

	@Override
	public List<Author> getAllAuthor() {
		return authorRepositoty.findAll();
		
	}

	@Override
	public String authorCount() {		
		return "" + authorRepositoty.count();
	}

	@Override
	public Author getAuthorById(Long id) {		
		return authorRepositoty.findById(id).get();
	}
	
	@Override
	public List<Author> getAuthorsA() {
		return authorRepositoty.findByNameFirstChar("A");
	}

	@Override
	public List<Author> getAuthorsB() {
		return authorRepositoty.findByNameFirstChar("B");
	}

	@Override
	public List<Author> getAuthorsC() {
		return authorRepositoty.findByNameFirstChar("C");
	}

	

	@Override
	public List<Author> getAuthorsD() {
		return authorRepositoty.findByNameFirstChar("D");
	}

	@Override
	public List<Author> getAuthorsE() {
		return authorRepositoty.findByNameFirstChar("E");
	}

	@Override
	public List<Author> getAuthorsF() {
		return authorRepositoty.findByNameFirstChar("F");
	}

	@Override
	public List<Author> getAuthorsG() {
		return authorRepositoty.findByNameFirstChar("G");
	}

	@Override
	public List<Author> getAuthorsH() {
		return authorRepositoty.findByNameFirstChar("H");
	}

	@Override
	public List<Author> getAuthorsI() {
		return authorRepositoty.findByNameFirstChar("I");
	}

	@Override
	public List<Author> getAuthorsJ() {
		return authorRepositoty.findByNameFirstChar("J");
	}

	@Override
	public List<Author> getAuthorsK() {
		return authorRepositoty.findByNameFirstChar("K");
	}

	@Override
	public List<Author> getAuthorsL() {
		return authorRepositoty.findByNameFirstChar("L");
	}

	@Override
	public List<Author> getAuthorsM() {
		return authorRepositoty.findByNameFirstChar("M");
	}

	@Override
	public List<Author> getAuthorsN() {
		return authorRepositoty.findByNameFirstChar("N");
	}

	@Override
	public List<Author> getAuthorsO() {
		return authorRepositoty.findByNameFirstChar("O");
	}

	@Override
	public List<Author> getAuthorsP() {
		return authorRepositoty.findByNameFirstChar("P");
	}

	@Override
	public List<Author> getAuthorsQ() {
		return authorRepositoty.findByNameFirstChar("Q");
	}

	@Override
	public List<Author> getAuthorsR() {
		return authorRepositoty.findByNameFirstChar("R");
	}

	@Override
	public List<Author> getAuthorsS() {
		return authorRepositoty.findByNameFirstChar("S");
	}

	@Override
	public List<Author> getAuthorsT() {
		return authorRepositoty.findByNameFirstChar("T");
	}

	@Override
	public List<Author> getAuthorsU() {
		return authorRepositoty.findByNameFirstChar("U");
	}

	@Override
	public List<Author> getAuthorsV() {
		return authorRepositoty.findByNameFirstChar("V");
	}

	@Override
	public List<Author> getAuthorsW() {
		return authorRepositoty.findByNameFirstChar("W");
	}

	@Override
	public List<Author> getAuthorsX() {
		return authorRepositoty.findByNameFirstChar("X");
	}

	@Override
	public List<Author> getAuthorsY() {
		return authorRepositoty.findByNameFirstChar("Y");
	}

	@Override
	public List<Author> getAuthorsZ() {
		return authorRepositoty.findByNameFirstChar("Z");
	}

}
