package com.workintech.model.factory;

import com.workintech.model.books.*;
import com.workintech.model.enums.BookType;

public class BookFactory {
    public static Book createNewBook(BookType bookType) {
        if(bookType == BookType.NOVEL){
            return new Novel();
        }else if(bookType == BookType.JOURNAL){
            return new Journal();
        }else if(bookType == BookType.MAGAZINE){
            return new Magazine();
        }else {
            return new StudyBook();
        }
    }
}
