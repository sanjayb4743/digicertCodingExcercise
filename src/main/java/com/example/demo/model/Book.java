/**
 * 
 */
package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @author sanjay
 *
 */
@Entity
@Table(name = "books")
public class Book {


    @Id
    private long isbn;


    @Column
    private String name;
    @Column
    private String author;
    public Book(long isbn, String name, String author) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
    }
    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }



}
