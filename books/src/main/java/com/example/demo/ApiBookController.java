package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiBookController {

	@Autowired
	private BookRepository repository;
	
	//Get a book by isbn
	@GetMapping("/books/{isbn}")
	public Book getBookByIsbn(@PathVariable Long isbn) {
		return repository.findByIsbn(isbn);
	}
	
	//Get all books
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return repository.findAll();
	}

	//Post
	@PostMapping("/books")
	public Book AddBook(@RequestBody Book book) {
		return repository.saveAndFlush(book);
	}

	
	//Update
	@PutMapping("/bookUpdates")
	public Book updateBook (@RequestBody Book book) {
		Book bookToUpdate = repository.findByIsbn(book.getIsbn());
		bookToUpdate.setTitle(book.getTitle());
		bookToUpdate.setAvailability(book.getAvailability());
		bookToUpdate.setAuthor(book.getAuthor());
		bookToUpdate.setType(book.getType());
		bookToUpdate.setYear(book.getYear());
		return repository.saveAndFlush(bookToUpdate);
	}
	
	
	
	//Delete
		@DeleteMapping("/booksDelete")
		public void deleteBook (@RequestBody Book book) {
			repository.delete(book);
		}

	
}
