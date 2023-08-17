package com.workintech.model.books;

import com.workintech.model.enums.BookType;
import com.workintech.model.person.Author;

public class Novel extends Book{
    public Novel(int id, String name, Author author) {
        super(id, name, author, BookType.NOVEL);
    }

    public Novel() {
        super();
    }
}
