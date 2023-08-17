package com.workintech.model.books;

import com.workintech.model.enums.BookType;
import com.workintech.model.person.Author;

public class Magazine extends Book{
    public Magazine(){

    }
    public Magazine(int id, String name, Author author) {
        super(id, name, author, BookType.MAGAZINE);
    }
}
