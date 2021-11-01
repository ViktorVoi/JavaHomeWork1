package com.pb.voitovych.hw5;

import java.sql.Date;
import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        // welcome!
        System.out.println("It`s my Library!") ;
        System.out.println("----------------") ;

        // -- init and add data about Books
        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book("Історія України",
                "Грушевський М.",
                1918)) ;
        books.add(new Book("Повість",
                "Сковорода Г.",
                1968)) ;
        books.add(new Book()) ;
        books.add(new Book()) ;

        // -- print List of Book
        System.out.println("Список книг: \n") ;

        for (Book oneBook: books) {
            oneBook.printBookInfo();
        }
        System.out.println("-------------------------");
        System.out.println("Всього книг: "+books.size()+"\n");

        // -- init and add data about Readers
        ArrayList<Reader> readers = new ArrayList<Reader>();

        readers.add(new Reader("Наливайко О.О.",
                12,
                "хімії рідин",
                Date.valueOf("1995-10-03"),
                "+380 67 111 63 88")) ;
        readers.add(new Reader("Вибивайченко А.А.",
                13,
                "фізики твердих тіл",
                Date.valueOf("1996-04-10"),
                "+380 95 050 50 50")) ;
        readers.add(new Reader("Сплюха Х.Р.",
                15,
                "нанотехнологій",
                Date.valueOf("1997-09-25"),
                "+380 93 033 33 33")) ;

        // -- print List of Reader
        System.out.println("Список читачів: \n") ;

        for (Reader oneReader: readers) {
            oneReader.printReaderInfo();
        }
        System.out.println("-------------------------");
        System.out.println("Всього читачів: "+readers.size()+"\n");

        readers.get(1).takeBook(3);
        readers.get(2).takeBook("Повість", "Словник");
        readers.get(0).takeBook(books.get(1), books.get(3), books.get(0));

        readers.get(1).returnBook(2);
        readers.get(0).returnBook("Словник", "Історія України");
        readers.get(2).returnBook(books.get(3), books.get(0), books.get(1));

    }


}
