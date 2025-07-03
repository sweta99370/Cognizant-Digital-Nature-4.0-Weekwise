package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter method for Spring DI
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void registerBook() {
        System.out.println("BookService: Registering a new book...");
        bookRepository.saveBook();
    }
}
