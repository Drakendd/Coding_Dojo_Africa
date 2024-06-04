package com.yassin.book.club.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.yassin.book.club.models.Book;
import com.yassin.book.club.models.User;
import com.yassin.book.club.services.BookService;
import com.yassin.book.club.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BookController {
	@Autowired
	 private BookService bookService;
	@Autowired
	private UserService userServ;
	//create
	@GetMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book, HttpSession  session ) {
		Long userId =(Long) session.getAttribute("user_id");
		if(userId==null) {
			return "redirect:/";
	}
		return "new.jsp";
	}
	//action route fir create
	@PostMapping("/processBook")
	public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result , HttpSession session) {
		Long userId =(Long) session.getAttribute("user_id");
		if (result.hasErrors()) {
			return "new.jsp";
		}else {
			User user =userServ.findUserById(userId);
	        book.setPostedBy(user);
	    	Book newBook=bookService.createBook(book);
	    	return"redirect:/books/show/"+newBook.getId();
			
		}
		
	}
	@GetMapping("/books/show/{id}")
	public String show (Model model, @PathVariable("id") Long Id, HttpSession  session) {
		Long userId =(Long) session.getAttribute("user_id");
		if(userId==null) {
			return "redirect:/";
		}
		Book book = bookService.findBookByID(Id);
		model.addAttribute("book",book);
		return "show.jsp";
	}
	@GetMapping("/books")
    public String index(Model model , HttpSession  session) {
		Long userId =(Long) session.getAttribute("user_id");
		if(userId==null) {
			return "redirect:/";
		}
		User user = userServ.findUserById(userId);
		model.addAttribute("user",user);
        List<Book> books = bookService.allBooks();
        model.addAttribute("allbooks", books);
        return "index.jsp";
    }
	//display Edit Form
	 @GetMapping("/books/edit/{id}")
	 public String updateBook(@PathVariable("id")Long id, Model model, HttpSession  session) {
			Long userId =(Long) session.getAttribute("user_id");
			if(userId==null) {
				return "redirect:/";
			}
			User user = userServ.findUserById(userId);
			
		Book book = bookService.findBookByID(id);
		 model.addAttribute("book",book);
		 return "edit.jsp";
	 }
	 // action route for edit 
	 @PutMapping("/books/{id}")
	 public String editBook(@Valid @ModelAttribute("book") Book book ,BindingResult result ,  HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id") ; 
		 if (result.hasErrors()) {
				return "edit.jsp";
			}else {
				User user = userServ.findUserById(userId);
				book.setPostedBy(user);
				bookService.updateBook(book);
				
				return "redirect:/books";
			}
		}
	 @DeleteMapping("/books/{id}")
	 public String deleteOne(@PathVariable("id")Long id , HttpSession  session) {
			Long userId =(Long) session.getAttribute("user_id");
			if(userId==null) {
				return "redirect:/";
			}
		 bookService.delete(id);
		 return "redirect:/books";
	 }
	
	
	
	
	

}
