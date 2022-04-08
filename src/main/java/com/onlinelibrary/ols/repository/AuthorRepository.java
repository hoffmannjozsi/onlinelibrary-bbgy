package com.onlinelibrary.ols.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.onlinelibrary.ols.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
	
	List<Author> findAll();
	
	@Query(value = "select * from authors a where substring(a.lastname, 1, 1) = :firstchar order by a.lastname", nativeQuery = true)
	List<Author> findByNameFirstChar(@Param("firstchar") String firstchar);
	
	

}
