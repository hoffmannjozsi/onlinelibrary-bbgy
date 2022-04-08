package com.onlinelibrary.ols.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.onlinelibrary.ols.service.AuthorService;

@Controller
public class AuthorController {
	
	private AuthorService authorService;

	public AuthorController(AuthorService authorService) {
		super();
		this.authorService = authorService;
	}

	@GetMapping("/authors")
	public String listBooks(Model model) {
		model.addAttribute("authors", authorService.getAllAuthor());
		return "authors";
	}
}
