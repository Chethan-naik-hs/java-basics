package com.chethan.library;

import com.chethan.library.book.Book;
import com.chethan.library.management.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        Book book1 = new Book(1001,"ulidavaru kandanthe","rishab shetty");
        Book book2 = new Book(1002,"Malegalalli madumagalu","kuvempu");
        Book book3 = new Book(1003,"nenapina doniyali","kuvempu");
        Book book4 = new Book(1004,"romio & juliat","shakesphere");
        Book book5 = new Book(1005,"great thunder","william");
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.getAllBooks();
    }
}
