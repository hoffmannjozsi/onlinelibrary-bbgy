package com.onlinelibrary.ols.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.onlinelibrary.ols.service.AuthorService;
import com.onlinelibrary.ols.service.BookService;
import com.onlinelibrary.ols.service.GenreService;

@Controller
public class BookController {

	private BookService bookService;
	private GenreService genreService;
	private AuthorService authorService;
	
	public BookController(BookService bookService, GenreService genreService, AuthorService authorService) {
		super();
		this.bookService = bookService;
		this.genreService = genreService;
		this.authorService = authorService;
	}

	// handler method to handle list books and return mode and view
	// a metódus kezeli a könyv listát, és visszaad egy nézetet belőle
	/*
	 * @GetMapping("/books") 
	 * public String listBooks(Model model) {
	 * model.addAttribute("books", bookService.getAllBook()); 
	 * return "books"; }
	 * 
	 * @GetMapping("/books/new") public String createBookForm(Model model) {
	 * 
	 * Book book = new Book(); model.addAttribute("book", book); return
	 * "create_book"; }
	 * 
	 * @PostMapping("/books") public String saveBook(@ModelAttribute("book") Book
	 * book) { bookService.saveBook(book); return "redirect:/books"; }
	 * 
	 * @GetMapping("/books/edit/{id}") public String editBookForm(@PathVariable Long
	 * id, Model model) { model.addAttribute("book", bookService.getBookById(id));
	 * return "edit_book"; }
	 * 
	 * @PostMapping("/books/{id}") public String updateBook(@PathVariable Long
	 * id, @ModelAttribute("books") Book book, Model model) { Book exsistingBook =
	 * bookService.getBookById(id); exsistingBook.setId(id);
	 * exsistingBook.setTitle(book.getTitle());
	 * exsistingBook.setAuthor1(book.getAuthor1());
	 * exsistingBook.setGenre1(book.getGenre1());
	 * 
	 * bookService.updateBook(exsistingBook); return "redirect:/books"; }
	 */

	@GetMapping("/")
	public String libraryMain(Model model, Long newGenreId) {
		model.addAttribute("books", bookService.listNewBooks(newGenreId));
		model.addAttribute("bookNums", bookService.bookCount());
		model.addAttribute("authorNums", authorService.authorCount());
		model.addAttribute("genreNums", genreService.genreCount());
		return "index";
	}
	
	/*
	 * Kiválasztott könyv megjelenítése
	 */
	@GetMapping("/books/view/{id}")
	public String viewBook(@PathVariable Long id, Model model) {
		model.addAttribute("book", bookService.getBookById(id));
		return "book_view";
	}

	/*
	 * Keresések: címre és műfajra
	 */
	@GetMapping("/books")
	public String getBooks(Model model, String keyword, Long genreId) {

		model.addAttribute("genres", genreService.getAllGenre());
		
		if (keyword == null || genreId == null || genreId == 0) {
			model.addAttribute("books", bookService.emptyBookList());
		}
		
		if (keyword != null) {
			if (keyword.isEmpty() || keyword.isBlank()) {
				keyword = "gfsjRscb1e&er25wZeeq";
			}	
				model.addAttribute("books", bookService.findByKeyword(keyword));			
		}
		if (genreId != null && genreId != 0) {
			model.addAttribute("books", bookService.findByGenreId(genreId));
		}

		return "books";
	}
	
	@GetMapping("/authorsA-C")
	public String getBooksAC(Model model) {
		model.addAttribute("authorsA", authorService.getAuthorsA());
		model.addAttribute("authorsB", authorService.getAuthorsB());
		model.addAttribute("authorsC", authorService.getAuthorsC());
		return "authorsA-C";
	}
	
	@GetMapping("/authorsD-F")
	public String getBooksDF(Model model) {
		model.addAttribute("authorsD", authorService.getAuthorsD());
		model.addAttribute("authorsE", authorService.getAuthorsE());
		model.addAttribute("authorsF", authorService.getAuthorsF());
		return "authorsD-F";
	}
		
	@GetMapping("/authorsG-I")
	public String getBooksGI(Model model) {
		model.addAttribute("authorsG", authorService.getAuthorsG());
		model.addAttribute("authorsH", authorService.getAuthorsH());
		model.addAttribute("authorsI", authorService.getAuthorsI());
		return "authorsG-I";
	}
	
		
	@GetMapping("/authorsJ-L")
	public String getBooksJL(Model model) {
		model.addAttribute("authorsJ", authorService.getAuthorsJ());
		model.addAttribute("authorsK", authorService.getAuthorsK());
		model.addAttribute("authorsL", authorService.getAuthorsL());
		return "authorsJ-L";
	}
	
	
	@GetMapping("/authorsM-O")
	public String getBooksMO(Model model) {
		model.addAttribute("authorsM", authorService.getAuthorsM());
		model.addAttribute("authorsN", authorService.getAuthorsN());
		model.addAttribute("authorsO", authorService.getAuthorsO());
		return "authorsM-O";
	}
	
	@GetMapping("/authorsP-S")
	public String getBooksPS(Model model) {
		model.addAttribute("authorsP", authorService.getAuthorsP());
		model.addAttribute("authorsQ", authorService.getAuthorsQ());
		model.addAttribute("authorsR", authorService.getAuthorsR());
		model.addAttribute("authorsS", authorService.getAuthorsS());
		return "authorsP-S";
	}
	
	@GetMapping("/authorsT-V")
	public String getBooksTV(Model model) {
		model.addAttribute("authorsT", authorService.getAuthorsT());
		model.addAttribute("authorsU", authorService.getAuthorsU());
		model.addAttribute("authorsV", authorService.getAuthorsV());
		return "authorsT-V";
	}
	
	@GetMapping("/authorsW-Z")
	public String getBooksWZ(Model model) {
		model.addAttribute("authorsW", authorService.getAuthorsW());
		model.addAttribute("authorsX", authorService.getAuthorsX());
		model.addAttribute("authorsY", authorService.getAuthorsY());
		model.addAttribute("authorsZ", authorService.getAuthorsZ());
		return "authorsW-Z";
	}
	/*
	 * Kiválasztott szerző megjelenítése
	 */
	@GetMapping("/author_view/{id}")
	public String viewAuthor(@PathVariable Long id, Model model) {
		model.addAttribute("author", authorService.getAuthorById(id));
		return "author_view";
	}
	

	@GetMapping("/info")
	public String info(Model model, Long newGenreId) {		
		return "info";
	}
	
}
