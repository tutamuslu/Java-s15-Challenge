package com.workintech.model.signature;

import com.workintech.model.books.Book;

public interface ILibrary {
    void newBook(Book book);
    void lendBook(Book book);
    void takeBackBook(Book book);
    Book showBook();
}
