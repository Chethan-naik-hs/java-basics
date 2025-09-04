package com.chethan.library.management;

import com.chethan.library.book.Book;
import com.chethan.library.validation.Validate;

public class Library {


    Book[] books = new Book[5];
    int index;
    Validate validate = new Validate();

    public boolean addBook(Book book){
        boolean isValidated = validate.bookValidation(book);
        boolean isBookAdded = false;
        if(book != null && isValidated){
            books[index++]=book;
            isBookAdded=true;
            System.out.println("validation successfull");
        }else System.out.println("Book not validated");



        return isBookAdded;
    }

    public void getAllBooks(){
        System.out.println("=========the list of available books========");
        for(Book book : books){
            System.out.println("book id : "+book.getBookId());
            System.out.println("book name : "+book.getBookName());
            System.out.println("autor name : "+book.getAuthorName());
            System.out.println("--------------------------------------------");
        }
    }
}
