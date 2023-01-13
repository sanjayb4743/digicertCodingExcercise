package com.example.demo.serviceimpl;

import java.util.List;

import com.example.demo.repository.BookRepository;
import com.example.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.service.BookService;

@Component
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    public List<Book> getBooks() {

        return bookRepository.findAll();
    }

}
