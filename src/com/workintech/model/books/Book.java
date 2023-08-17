package com.workintech.model.books;

import com.workintech.model.enums.BookType;
import com.workintech.model.person.Author;

import java.util.Date;

public class Book {
    private int id;
    private String name;
    private double price;
    private boolean status;
    private String edition;
    private Date dateOfPurchase;
    private Author author;
    private BookType bookType;
    Book(){
        // factory için kullandım
    }
    Book(int id, String name, Author author, BookType bookType){
        this.id = id;
        this.name = name;
        this.author = author;
        this.bookType = bookType;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public Author getAuthor() {
        return author;
    }
}
