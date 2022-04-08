package com.onlinelibrary.ols.entity;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.tomcat.util.codec.binary.Base64;

@Entity
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
	@Column(name = "library_id", nullable = false)
	private int library_id;
    
    @Column(name = "title", nullable = false)    
    private String title;
    
   
    @ManyToOne
    private Author author1;
    
    @ManyToOne
    private Author author2;
    
    @ManyToOne
    private Author author3;
                     
    @ManyToOne
    private Genre genre1;
    
    @ManyToOne
    private Genre genre2;
      
    
    @Column(name = "about")
    private String about;
    
    @Column(name = "picture", length = Integer.MAX_VALUE, nullable = true)
    private byte[] picture;
    
    @Transient
    private String base64EncodedImageString;
    
    
    @ManyToOne
    private Owner owner;
    
    @Column(name = "aviable", nullable = false)
    private int aviable;

        
    public Book() {
    	
    }
         
	
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getLibrary_id() {
		return library_id;
	}
	public void setLibrary_id(int library_id) {
		this.library_id = library_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor1() {
		return author1;
	}
	public void setAuthor1(Author author1) {
		this.author1 = author1;
	}
	
	

	public Author getAuthor2() {
		return author2;
	}


	public void setAuthor2(Author author2) {
		this.author2 = author2;
	}
	


	public Author getAuthor3() {
		return author3;
	}


	public void setAuthor3(Author author3) {
		this.author3 = author3;
	}


	public Genre getGenre1() {
		return genre1;
	}
	public void setGenre1(Genre genre1) {
		this.genre1 = genre1;
	}
	
	
	public Genre getGenre2() {
		return genre2;
	}


	public void setGenre2(Genre genre2) {
		this.genre2 = genre2;
	}


	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public byte[] getPicture() {
		return picture;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	
	public String getBase64EncodedImageString() {
		return base64EncodedImageString;
	}
	

	public void setBase64EncodedImageString() {
		this.base64EncodedImageString = Base64.encodeBase64String(this.picture);
	}

	
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public int getAviable() {
		return aviable;
	}
	public void setAviable(int aviable) {
		this.aviable = aviable;
	}

	
    
    
	
}
