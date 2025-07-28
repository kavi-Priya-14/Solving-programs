package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private String name;

    // Constructor injection
    public BookService(String name) {
        this.name = name;
    }

    // Setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void showBook() {
        System.out.println("Service Name: " + name);
        System.out.println("Book: " + bookRepository.getBook());
    }
}
