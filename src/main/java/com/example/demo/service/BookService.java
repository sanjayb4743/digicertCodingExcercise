package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;


public interface BookService {
	
	List<Book>getBooks();


	Book getBookInfo(long isbn);
}
