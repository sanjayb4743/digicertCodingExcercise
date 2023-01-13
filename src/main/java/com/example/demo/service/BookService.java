package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Books;


public interface BookService {
	
	List<Books>getBooks();


	public Books getBookInfo(long isbn);


	public Object addBoonInfo(Books book);


	public Object updateBookInfo(Books book);


	public void deleteBookInfo(long isbn);
}
