package com.workintech.model;

import com.workintech.model.books.Book;
import com.workintech.model.interfaces.ILibrary;
import com.workintech.model.person.Reader;

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

    public List<Book> getBooks(){
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
    public void deleteBook(int id) {
        for(int i = 0; i < books.size(); i++){
            if(books.get(i).getId() == id){
                books.remove(books.get(i));
                break;
            }
        }
    }

}
