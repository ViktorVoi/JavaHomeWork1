package com.pb.voitovych.hw5;

import java.util.ArrayList;

public class Book {
    private String bookName ;
    private String bookAuthor ;
    private int bookPublicationYear ;

    // -- constructors

    public Book() {
        this.bookName = "Без назви";
        this.bookAuthor = "Невідомий автор";
        this.bookPublicationYear = 2021 ;
    }

    public Book(String bookName, String bookAuthor,
                    int bookPublicationYear) {

        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPublicationYear = bookPublicationYear;

    }

    public void printBookInfo() {
        System.out.println(this.bookName
                +"\t ("+this.bookAuthor+", "+this.bookPublicationYear+")") ;
    }



    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookPublicationYear() {
        return bookPublicationYear;
    }

}
