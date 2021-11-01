package com.pb.voitovych.hw5;

import java.sql.Date ;

public class Reader {

    private String readerName ;
    private int readerNumberTicket ;
    private String readerFaculty ;
    private Date readerDateBirth ;
    private String readerPhoneNumber ;

    // - constructors
    public Reader() {
        this.readerName = "Незнайко І.І.";
        this.readerNumberTicket = 0;
        this.readerFaculty = "факультет невідомий";
        this.readerDateBirth = Date.valueOf("1900-01-01");
        this.readerPhoneNumber = "невідомий";
    }


    public Reader(String readerName,
                  int readerNumberTicket,
                  String readerFaculty,
                  Date readerDateBirth,
                  String readerPhoneNumber) {
        this.readerName = readerName;
        this.readerNumberTicket = readerNumberTicket;
        this.readerFaculty = readerFaculty;
        this.readerDateBirth = readerDateBirth;
        this.readerPhoneNumber = readerPhoneNumber;
    }

    public void takeBook(int n) {
        System.out.println(this.readerName + " отримав "+ n + " книг(и) \n");
        System.out.println();
    }

    public void takeBook(String...bookNames) {
        System.out.println(this.readerName + " отримав такі книги:");
        int i = 0;
        for (String oneBookName: bookNames) {
            i++;
            System.out.println(i+". "+oneBookName);
        }
        System.out.println();
    }

    public void takeBook(Book... booksList) {
        System.out.println(this.readerName + " отримав такі книги (назва, автор, рік видання):");
        int i = 0;
        for (Book oneBook: booksList) {
            i++;
            System.out.print(i+". ");
            oneBook.printBookInfo();
        }
        System.out.println();
    }

    public void returnBook(int n) {
        System.out.println(this.readerName + " повернув "+ n + " книг(и) \n");
        System.out.println();
    }

    public void returnBook(String...bookNames) {
        System.out.println(this.readerName + " повернув такі книги:");
        int i = 0;
        for (String oneBookName: bookNames) {
            i++;
            System.out.println(i+". "+oneBookName);
        }
        System.out.println();
    }

    public void returnBook(Book... booksList) {
        System.out.println(this.readerName + " повернув такі книги (назва, автор, рік видання):");
        int i = 0;
        for (Book oneBook: booksList) {
            i++;
            System.out.print(i+". ");
            oneBook.printBookInfo();
        }
        System.out.println();
    }

    public void printReaderInfo() {
        System.out.println(this.readerName + "\t"
                            + this.readerNumberTicket +"\t"
                            + this.readerFaculty + "\t"
                            + this.readerDateBirth + "\t"
                            + this.readerPhoneNumber );
    }

}
