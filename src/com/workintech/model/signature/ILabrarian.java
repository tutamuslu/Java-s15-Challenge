package com.workintech.model.signature;

import com.workintech.model.books.Book;

import java.util.List;

public interface ILabrarian {
    List<Book> listBooksByCategory();
    List<Book> listBooksByAuthor();
}
