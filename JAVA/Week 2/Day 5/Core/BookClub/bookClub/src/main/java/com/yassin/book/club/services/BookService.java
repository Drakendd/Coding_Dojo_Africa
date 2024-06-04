package com.yassin.book.club.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yassin.book.club.models.Book;
import com.yassin.book.club.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepo;
	
	//create
	public Book createBook ( Book book) {
		return bookRepo.save(book);
	}
	
	//read one
	public Book findBookByID(Long id) {
		Optional<Book>optionalBook = bookRepo.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();	
		}else
			return null;
		
		
	}
	//read all
	public List<Book> allBooks(){
		return bookRepo.findAll();
		}
	// Update
	//update
	public Book  updateBook(Book book) {
		return bookRepo.save(book);
	}
	
	//delete
	public void delete (Long id) {
		bookRepo.deleteById(id);	
	}
	

}
