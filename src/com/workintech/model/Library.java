package com.workintech.model;

import com.workintech.model.books.Book;
import com.workintech.model.signature.ILibrary;

import java.util.ArrayList;
import java.util.List;

public class Library implements ILibrary {
    private static final int maxLendCount = 5;
    private List<Book> books;
    private List<Reader> readers;

    public Library(){
        this.books = new ArrayList<>();
        this.readers = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    @Override
    public void newBook(Book book) {
        this.books.add(book);
    }

    @Override
    public void lendBook(Book book) {
        //this.books.
    }

    @Override
    public void takeBackBook(Book book) {

    }

    @Override
    public Book showBook() {
        return null;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < books.size(); i++){
            result += books.get(i).getName() + "\n";
        }
        return result;
    }
}
