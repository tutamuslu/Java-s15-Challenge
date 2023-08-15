package com.workintech.main;

import com.workintech.model.Library;
import com.workintech.model.books.*;
import com.workintech.model.person.Author;
import com.workintech.model.person.Librarian;
import com.workintech.model.person.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Library library = new Library();
        Person librarian = new Librarian("Tuğba Muslu");

        Author author1 = new Author("Mustafa Kemal ATATÜRK");
        Author author2 = new Author("Franz KAFKA");
        Author author3 = new Author("Steven ZWEIG");

        Book book1 = new Novel("Nutuk", author1);
        Book book2 = new Novel("Dönüşüm", author2);
        Book book3 = new Novel("Milena'ya Mektuplar", author2);
        Book book4 = new Novel("Bilinmeyen Bir Kadının Mektubu", author3);
        Book book5 = new Novel("Kendileriyle Savaşanlar", author3);


        library.newBook(book1);
        library.newBook(book2);
        library.newBook(book3);
        library.newBook(book4);
        library.newBook(book5);

        System.out.println("---------- KOMUTLAR -------");
        System.out.println("1-Yeni Kitap Ekle");
        System.out.println("2-Kitap Seç");
        System.out.println("3-Kitap Güncelle");
        System.out.println("4-Kategoriye Göre Kitap Listele");
        System.out.println("5-Yazara Göre Kitap Listele");

        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.print("Komut Girin : ");
            String command = scanner.nextLine();
            if(command.equals("1")){
                System.out.println("---------- KİTAP EKLE ----------");
                System.out.print("Kitap Adını Girin : ");
                String bookName = scanner.nextLine();
                System.out.print("Yazarın Adını Girin : ");
                String authorName = scanner.nextLine();
                System.out.print("Kitabın Türünü girin : (Roman:1, Dergi:2, Magazin:3, Ders Kitabı:4)");
                Book book;
                String bookType = scanner.nextLine();
                if(bookType.equals("1")){
                    book = new Novel();
                }else if(bookType.equals("2")){
                    book = new Journal();
                }else if(bookType.equals("3")){
                    book = new Magazine();
                }else if(bookType.equals("4")){
                    book = new StudyBook();
                }else{
                    throw new Exception("Kitabın türü geçerli değil");
                }
                Author author = new Author(authorName);
                book.setAuthor(author);
                book.setName(bookName);
                library.newBook(book);
                System.out.println("Kitap başarıyla eklendi.");
            }
            else if(command.equals("3")){
                System.out.println("---------- Kütüphanedeki Kitaplar ---------");
                System.out.println(library.toString());
            }
            else{
                break;
            }
        }

    }
}