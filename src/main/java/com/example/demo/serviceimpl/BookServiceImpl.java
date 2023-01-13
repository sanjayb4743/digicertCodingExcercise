package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Book;
import com.example.demo.repository.BooksRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.service.BookService;

@Component
public class BookServiceImpl implements BookService {
    @Autowired
    BooksRepository bookRepository;

    public List<Book> getBooks() {

        return bookRepository.findAll();
    }

    @Override
    public Book getBookInfo(long isbn) {
        Optional<Book> byId = bookRepository.findById(isbn);
        return byId.get();
    }

}
