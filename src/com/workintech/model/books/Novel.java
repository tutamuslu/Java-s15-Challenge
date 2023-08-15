package com.workintech.model.books;

import com.workintech.model.person.Author;

public class Novel extends Book{
    public Novel(String name, Author author) {
        super(name, author);
    }

    public Novel() {
        super();
    }
}
