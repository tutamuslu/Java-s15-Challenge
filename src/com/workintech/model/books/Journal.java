package com.workintech.model.books;

import com.workintech.model.person.Author;

public class Journal extends Book{
    public Journal(){

    }
    Journal(String name, Author author) {
        super(name, author);
    }
}
