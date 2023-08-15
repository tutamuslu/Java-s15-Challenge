package com.workintech.model.books;

import com.workintech.model.person.Author;

import java.util.Date;

public abstract class Book {
    private int id;
    private String name;
    private double price;
    private boolean status;
    private String edition;
    private Date dateOfPurchase;
    private Author author;

    Book(){

    }
    Book(String name, Author author){
        this.name = name;
        this.author = author;
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
}
