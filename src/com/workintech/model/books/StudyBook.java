package com.workintech.model.books;

import com.workintech.model.person.Author;

public class StudyBook extends Book {
    public StudyBook(){

    }
    StudyBook(String name, Author author) {
        super(name, author);
    }
}
