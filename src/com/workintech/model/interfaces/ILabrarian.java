package com.workintech.model.interfaces;

import com.workintech.model.books.Book;
import com.workintech.model.enums.BookType;

import java.util.List;

public interface ILabrarian {
    List<Book> listBooksByCategory(BookType bookType);
    List<Book> listBooksByAuthor();
}
