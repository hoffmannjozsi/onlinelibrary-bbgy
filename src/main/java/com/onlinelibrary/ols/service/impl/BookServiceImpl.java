package com.onlinelibrary.ols.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.onlinelibrary.ols.entity.Book;
import com.onlinelibrary.ols.repository.BookRepository;
import com.onlinelibrary.ols.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;
	@Value("${spring.application.newbooksid}")
	private Long newBooksId; 
			
	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}


	@Autowired
	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	

	@Override
	public List<Book> getAllBook() {		
		return bookRepository.findAll();
	}

	@Override
	public List<Book> emptyBookList() {
		List<Book> emptyList = new ArrayList<Book>();
		//emptyList.removeAll(emptyList);
		return emptyList;
	}


	@Override
	public Book getBookById(Long id) {		
		Book oneBook = bookRepository.findById(id).get();
		oneBook.setBase64EncodedImageString();		
		return oneBook;	
	}


	@Override	
	public List<Book> findByKeyword(String keyword) {
		return bookRepository.findByKeyword(keyword);
	 }
	
	@Override
	public List<Book> findByGenreId (Long genreId) {		
		return bookRepository.findByGenreId(genreId);		
	 }

	public String bookCount() {
		return "" + bookRepository.count();
	}



	@Override
	public List<Book> listNewBooks(Long newGenreId) {
		long nB =newBooksId;
		List<Book> newBooks = bookRepository.findByNewBooks(nB);
		for (Book nBook : newBooks) {
			nBook.setBase64EncodedImageString();
		}
		return newBooks;
	}
		 
	


	/* 
	 * Nem használt: könyv adatainak frissítése
	@Override
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}
	*/


	/*
	 * Nem használt 
	 * Az adatbázisban tárolt blob kép fájlba mentése
	@Override
	public Book viewBook(Long id) {
		Book oneBook = bookRepository.findById(id).get();
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(""+ oneBook.getId() + ".jpg");
			fos.write(oneBook.getPicture());
			fos.close();
		} catch (IOException e) {
			System.out.println("A kép nem jött létre.");
			e.printStackTrace();
		}		
		return oneBook;
	} 
	*/

	/* 
	 * Nem használt: új könyv mentése
	@Override
	public Book saveBook(Book book) {		
		return bookRepository.save(book);
	}
	*/
		
	
}
