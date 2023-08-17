package com.workintech.main;

import com.workintech.model.Library;
import com.workintech.model.books.*;
import com.workintech.model.enums.BookType;
import com.workintech.model.factory.BookFactory;
import com.workintech.model.person.Author;
import com.workintech.model.person.Librarian;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Library library = new Library();
        Librarian librarian = new Librarian("Tuğba Muslu", library);

        Author author1 = new Author("Mustafa Kemal ATATÜRK");
        Author author2 = new Author("Franz KAFKA");
        Author author3 = new Author("Steven ZWEIG");

        Random random = new Random();

        Book book1 = new Novel(random.nextInt(1000), "Nutuk", author1);
        Book book2 = new Novel(random.nextInt(1000), "Dönüşüm", author2);
        Book book3 = new Novel(random.nextInt(1000),"Milena'ya Mektuplar", author2);
        Book book4 = new Novel(random.nextInt(1000),"Bilinmeyen Bir Kadının Mektubu", author3);
        Book book5 = new Novel(random.nextInt(1000), "Kendileriyle Savaşanlar", author3);

        library.newBook(book1);
        library.newBook(book2);
        library.newBook(book3);
        library.newBook(book4);
        library.newBook(book5);

        System.out.println("---------- KOMUTLAR -------");
        System.out.println("1-Yeni Kitap Ekle");
        System.out.println("2-Kitap Sil");
        System.out.println("3-Kitap Güncelle");
        System.out.println("4-Kategoriye Göre Kitap Listele");
        System.out.println("5-Tüm Kitapları Listele");

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
                System.out.print("Kitabın Türünü girin : (Roman:1, Dergi:2, Magazin:3, Ders Kitabı:4) : ");

                int type = Integer.parseInt(scanner.nextLine());
                BookType bookType = BookType.values()[type];

                Book book = BookFactory.createNewBook(bookType);
                Author author = new Author(authorName);

                book.setId(random.nextInt(1000));
                book.setAuthor(author);
                book.setName(bookName);
                book.setBookType(bookType);

                library.newBook(book);
                System.out.println("Kitap başarıyla eklendi.");
            }
            else if(command.equals("2")){
                System.out.println("---------- Kütüphanedeki Kitaplar ---------");
                List<Book> books = library.getBooks();
                writeBooks(books);
                System.out.print("Silenecek kitabın idsini girin : ");
                int id = Integer.parseInt(scanner.nextLine());
                library.deleteBook(id);
                System.out.println("Kitap başarıyla silindi.");
            }
            else if(command.equals("3")){
                System.out.println("---------- Kütüphanedeki Kitaplar ---------");
                List<Book> books = library.getBooks();
                writeBooks(books);
            }
            else if(command.equals("4")){
                System.out.println("---------- Kategoriler ---------");
                System.out.println("Roman = 1,\n" +
                        "    Dergi = 2,\n" +
                        "    Magazin = 3,\n" +
                        "    Ders Kitabı = 4");
                System.out.print("Kategoriyi girin : ");
                int bookType = Integer.parseInt(scanner.nextLine());
                List<Book> books = librarian.listBooksByCategory(BookType.values()[bookType]);
                writeBooks(books);
            }
            else if(command.equals("5")) {
                System.out.println("---------- Tüm Kitaplar ---------");
                List<Book> books = library.getBooks();
                writeBooks(books);
            }
            else{
                System.out.println("Geçersiz komut");
            }
        }

    }

    public static void writeBooks(List<Book> books){
    System.out.println("ID  KİTAP ADI \t KİTAP YAZARI");
        for (int i = 0; i < books.size(); i++){
            System.out.println(books.get(i).getId() + "\t" + books.get(i).getName() +"\t" + books.get(i).getAuthor());
        }
    }
}