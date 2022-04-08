package com.onlinelibrary.ols.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "authors")
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
    private String lastName;
    
	private String expertise; //szakterület
    
	private String about; //egyéb információk
    
	    
	@OneToMany(mappedBy = "author1", 
			   cascade = CascadeType.ALL,
			   orphanRemoval = true)
    private List<Book> books;
	
	@OneToMany(mappedBy = "author2", 
			   cascade = CascadeType.ALL,
			   orphanRemoval = true)
	private List<Book> books2;
	
	@OneToMany(mappedBy = "author3", 
			   cascade = CascadeType.ALL,
			   orphanRemoval = true)
	private List<Book> books3;
    
	    
    public Author() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}


	
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public List<Book> getBooks2() {
		return books2;
	}

	public void setBooks2(List<Book> books2) {
		this.books2 = books2;
	}

	public List<Book> getBooks3() {
		return books3;
	}

	public void setBooks3(List<Book> books3) {
		this.books3 = books3;
	}

		
	

	

    
}
