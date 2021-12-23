package com.pb.voitovych.hw11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {

    private ArrayList<Abonent> phoneBook = new ArrayList<Abonent>() ;

    public void initialize() {
        phoneBook.add(new Abonent("Войтович Віктор",
                LocalDate.of(1971,07,15),
                "067 111 63 80",
                "м.Рівне",
                LocalDateTime.now())) ;
        phoneBook.add(new Abonent("Шкабара Анатолій",
                LocalDate.of(1990,01,15),
                "067 222 33 44",
                "м.Дніпро",
                LocalDateTime.now())) ;
        phoneBook.add(new Abonent("Іванов Степан",
                LocalDate.of(1997,12,01),
                "067 555 48 99",
                "м.Київ",
                LocalDateTime.now())) ;
    }

    public void show() {
        Abonent one = new Abonent() ;
        for (int i=0; i < phoneBook.size() ; i++) {
            one = phoneBook.get(i) ;
            System.out.println("#"+ (i+1)
                    + ". " + one.getPib()
                    + "\t д.н.: " + one.getDateBirth().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
                    + "\t тел.: " + one.getPhones()
                    + "\t aдр.: " + one.getAddress()
                    + "\t змінено: " + one.getDtEdit().format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss")));
        }
    }

    public void newA() {
        Abonent a = new Abonent() ;
        Scanner scan = new Scanner(System.in) ;

        System.out.println("Дані про абонента:");
        // System.out.print("#: ") ;

        System.out.print("ПІБ: ") ;
        a.setPib(scan.nextLine()) ;

        System.out.print("д.н. (YYYY-MM-DD): ") ;
        a.setDateBirth(LocalDate.parse(scan.nextLine()));

        System.out.print("тел.: ") ;
        a.setPhones(scan.nextLine());

        System.out.print("aдр.: ") ;
        a.setAddress(scan.nextLine());

        a.setDtEdit(LocalDateTime.now());

        phoneBook.add(a) ;

        this.show();

    }

    public void delete() {
        Scanner scan = new Scanner(System.in) ;
        System.out.print("Введіть # абонента для вилучення: ") ;

        this.phoneBook.remove(scan.nextInt()-1) ;

        this.show();

    }


    public void find() {
        System.out.println("Не вмію поки шукати!") ;
    }

    public void sort() {
        System.out.println("Не вмію поки сортувати!") ;
    }

    public void view() {
        this.show();
    }

    public void write() {
        System.out.println("Не вмію поки записувати в JSON!") ;
    }

    public void read() {
        System.out.println("Не вмію поки завантажувати з JSON!") ;
    }
}
