package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Books;
import com.example.demo.repository.BooksRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.service.BookService;

@Component
public class BookServiceImpl implements BookService {
    @Autowired
    BooksRepository bookRepository;

    public List<Books> getBooks() {

        return bookRepository.findAll();
    }

    @Override
    public Books getBookInfo(long isbn) {
        Optional<Books> byId = bookRepository.findById(isbn);
        return byId.get();
    }

	@Override
	public Object addBoonInfo(Books book) {
		return bookRepository.save(book);
		
		
	}

	@Override
	public Object updateBookInfo(Books book) {
		// TODO Auto-generated method stub
	return bookRepository.save(book);
	}

	@Override
	public void deleteBookInfo(long isbn) {
		 bookRepository.deleteById(isbn);
		
	}

}
