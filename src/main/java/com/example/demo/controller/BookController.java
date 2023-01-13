/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
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
	public List<Book> getBooks(){
		List<Book> books=bookService.getBooks();
		return books;
	}

	@GetMapping("/bookInfo")
	public Book getBook(long isbn){
		Book bookInfo=bookService.getBookInfo(isbn);
		return  bookInfo;

	}
}
