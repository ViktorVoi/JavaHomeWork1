package com.pb.voitovych.hw11;

import java.util.Scanner;

public class Console {
     private Scanner scan ;

     public Console() {
          this.scan = new Scanner(System.in) ;
     }

     public String selectAction() {
          System.out.println("Виберіть дію (eng):");
          System.out.print("  N - додати нового абонента \t");
          System.out.print("  D - вилучити абонента \t");
          System.out.print("  F - знайти абонента \t");
          System.out.println("  S - сортування списку абонентів \t");
          System.out.print("  V - показати список абонентів \t");
          System.out.print("  W - зберегти книгу у файл phonebook.json \t");
          System.out.println("  R - завантажити дані з файлу phonebook.json \t");
          System.out.println("  Z - завершити роботу з Телефонною Книгою \t");
          System.out.print(" > ");
          return scan.nextLine().toUpperCase() ;
     }
}
