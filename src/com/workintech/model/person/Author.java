package com.workintech.model.person;

import com.workintech.model.books.Book;

import java.util.List;

public class Author extends Person{
    private List<Book> books;

    public Author(String name) {
        super(name);
    }

    @Override
    String whoYouAre() {
        return "Yazar : " + name;
    }


}
