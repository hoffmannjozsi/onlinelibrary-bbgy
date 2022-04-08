package com.onlinelibrary.ols.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book_genres")
public class Genre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String name;
    
    @OneToMany(mappedBy = "genre1")   
	private List<Book> genreBooks;
    
    @OneToMany(mappedBy = "genre2")   
	private List<Book> genreBooks2;
    
    public Genre() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getGenreBooks() {
		return genreBooks;
	}

	public void setGenreBooks(List<Book> genreBooks) {
		this.genreBooks = genreBooks;
	}

	public List<Book> getGenreBooks2() {
		return genreBooks2;
	}

	public void setGenreBooks2(List<Book> genreBooks2) {
		this.genreBooks2 = genreBooks2;
	}
    
    

}
