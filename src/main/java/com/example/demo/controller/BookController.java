/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Books;
import com.example.demo.service.BookService;

/**
 * @author sanjay
 *
 */
@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService bookService;


	@GetMapping("/allBooks")
	public List<Books> getBooks(){
		List<Books> books=bookService.getBooks();
		return books;
	}

	@GetMapping("/bookInfo")
	public Books getBook(@RequestParam long isbn){
		Books bookInfo=bookService.getBookInfo(isbn);
		return  bookInfo;

	}
	
	@PostMapping("/bookInfo")
	public Object addBookInfo(@RequestBody Books book) {
		return bookService.addBoonInfo(book);
		
	}
	
	@PutMapping("/bookInfo")
	public Object updateBookInfo(@RequestBody Books book) {
		
		return bookService.updateBookInfo(book);
	}
	
	@DeleteMapping("/bookInfo")
	public void deleteBoonInfo(@RequestParam long isbn) {
		
		bookService.deleteBookInfo(isbn);
	}
}
