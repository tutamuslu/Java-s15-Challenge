package com.workintech.model.books;

import com.workintech.model.enums.BookType;
import com.workintech.model.person.Author;

public class StudyBook extends Book {
    public StudyBook(){

    }
    StudyBook(int id, String name, Author author) {
        super(id, name, author, BookType.STUDY);
    }
}
