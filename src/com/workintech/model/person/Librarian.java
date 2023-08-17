package com.workintech.model.person;

import com.workintech.model.Library;
import com.workintech.model.books.Book;
import com.workintech.model.enums.BookType;
import com.workintech.model.interfaces.ILibrarian;

import java.util.ArrayList;
import java.util.List;

public class Librarian extends Person implements ILibrarian {
    private String name;
    private String password;
    private Library library;
    public Librarian(String name, Library library) {

        super(name);
        this.library = library;
    }

    @Override
    public List<Book> listBooksByCategory(BookType bookType) {
        List<Book> result = new ArrayList<>();
        for(int i = 0; i < library.getBooks().size(); i++){
            if(library.getBooks().get(i).getBookType() == bookType){
                result.add(library.getBooks().get(i));
            }
        }
        return result;
    }

    @Override
    public String whoYouAre() {
        return "Kütüphaneci " + name;
    }
}
