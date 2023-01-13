/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import com.example.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BookService;

/**
 * @author sanjay
 *
 */
@RestController
public class BookController {

	@Autowired
	BookService bookService;
	
	public List<Book> getBooks(){
		List<Book> books=bookService.getBooks();
		return books;
	}
}
