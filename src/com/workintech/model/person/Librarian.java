package com.workintech.model.person;

import com.workintech.model.books.Book;
import com.workintech.model.signature.ILabrarian;

import java.util.List;

public class Librarian extends Person implements ILabrarian {
    private String name;
    private String password;

    public Librarian(String name) {
        super(name);
    }

    @Override
    public List<Book> listBooksByCategory() {
        return null;
    }

    @Override
    public List<Book> listBooksByAuthor() {
        return null;
    }

    @Override
    String whoYouAre() {
        return "Kütüphaneci " + name;
    }
}
