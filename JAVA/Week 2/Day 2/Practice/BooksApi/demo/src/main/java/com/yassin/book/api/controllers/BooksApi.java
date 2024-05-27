package com.yassin.book.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yassin.book.api.models.Book;
import com.yassin.book.api.services.BookService;

@RestController
@RequestMapping("/api")
public class BooksApi {
	private final BookService bookService;
	
	public BooksApi(BookService bookService) {
		this.bookService = bookService;
	}
	@GetMapping("/books")
	public List<Book> index(){
		return bookService.allBooks();
	}
	@PostMapping("/books")
	public Book create(@RequestParam(value="title") String title,
			           @RequestParam(value="description") String desc,
			           @RequestParam(value="language") String lang,
			           @RequestParam(value="pages") Integer numOfPages)
	{
		Book book = new Book(title , desc , lang , numOfPages );
		return bookService.createBook(book);
	}
	@GetMapping("books/{id}")
	public Book show(@PathVariable("id") Long id) {
		Book book = bookService.findBook(id);
		return book;	
	}
	@PutMapping("books/{id}")
	public Book update(
			@PathVariable("id") Long id,
			@RequestParam(value="title") String title,
			@RequestParam(value="description") String desc,
			@RequestParam(value="language") String lang,
			@RequestParam(value="title") Integer numOfPages) {
		Book book = bookService.updateBook(id,title,desc,lang, numOfPages);	
		return book;
		}
	@DeleteMapping("/books/{id}")
	 public void destroy(@PathVariable("id") Long id) {
	     bookService.deleteBook(id);
	 }
			
	
	
}
