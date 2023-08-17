package com.workintech.model.books;

import com.workintech.model.enums.BookType;
import com.workintech.model.person.Author;

public class Journal extends Book{
    public Journal(){

    }
    Journal(int id, String name, Author author) {
        super(id, name, author, BookType.JOURNAL);
    }
}
