package com.example.binding;

import org.springframework.hateoas.RepresentationModel;

public class Book extends RepresentationModel<Book>{

	public Book(String isbn, String name, Double price, String author) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.price = price;
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	private String isbn;
	
	private String name;
	
	private Double price;
	
	private String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", price=" + price + ", author=" + author + "]";
	}

}
