package com.workintech.model.interfaces;

import com.workintech.model.books.Book;

public interface ILibrary {
    void newBook(Book book);
    void deleteBook(int id);
    void lendBook(Book book);
    void takeBackBook(Book book);
    Book showBook();
}
