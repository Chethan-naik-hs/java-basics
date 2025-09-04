package com.chethan.library.validation;

import com.chethan.library.book.Book;

public class Validate {

    Book book = new Book();
    public boolean bookValidation(Book book){
        boolean isBookValidated = false;
        boolean isId = false;
        boolean isName = false;
        boolean isAuthor = false;

        if(book.getBookId()>0){
            isId=true;
        }else System.out.println("Invalid book Id");

        if(book.getBookName()!=null && !book.getBookName().isEmpty()) isName=true;
        else System.out.println("invalid book name");

        if(book.getAuthorName()!=null && !book.getAuthorName().isEmpty()) isAuthor = true;
        else System.out.println("Invalid author name");

        if(isId && isName && isAuthor) isBookValidated=true;
        else System.out.println("missing values");

        return isBookValidated;
    }
}
