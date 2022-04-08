package com.onlinelibrary.ols.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.onlinelibrary.ols.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	
	
	List<Book> findAll();
			
	
	@Query(value = "select * from books b where b.title like %:keyword% order by b.title asc" , nativeQuery = true)
	List<Book> findByKeyword(@Param("keyword") String keyword);
	 
	@Query(value = "select * from books b where b.genre1_id = :genreId or b.genre2_id = :genreId order by b.title asc" , nativeQuery = true)
	List<Book> findByGenreId(@Param("genreId") Long genreId);
			
	@Query(value = "select * from books b where b.genre2_id = :newGenreId order by b.title asc" , nativeQuery = true)
	List<Book> findByNewBooks(@Param("newGenreId") Long newGenreId);

}
