package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.binding.Book;

@RestController
public class BookRestController {

	@GetMapping(value = "/book/{isbn}", produces = "application/json")
	public Book getBookInfo(@PathVariable("isbn") String isbn) {

		Book b = new Book(isbn, "Spring", 300.00, "Spring Boot");
		Link withRel = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookRestController.class).getAllBook())
				.withRel("All-Books");
		b.add(withRel);

		return b;
	}

	@GetMapping(value="/books", produces="application/json")
	private List<Book> getAllBook() {

		Book b1 = new Book("ISBN001", "Spring", 300.00, "Spring Boot");
		Book b2 = new Book("ISBN002", "Spring MVC", 600.00, "Jhon");
		Book b3 = new Book("ISBN003", "Spring Cloud", 900.00, "Ram");
		Book b4 = new Book("ISBN004", "Spring Security", 1200.00, "Author");

		List<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		return books;
	}

}
