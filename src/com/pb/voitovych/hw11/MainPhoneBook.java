package com.pb.voitovych.hw11;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainPhoneBook {

    public static void main(String[] args) {

        System.out.println("Телефонна книга");
        System.out.println("---------------");

        PhoneBook phoneBook = new PhoneBook();
        Console console = new Console();
        String answer = "V";

        phoneBook.initialize();

        while (answer != "Z") {
            switch (answer) {
                case "N":
                    phoneBook.newA();
                    break;
                case "D":
                    phoneBook.delete();
                    break;
                case "F":
                    phoneBook.find();
                    break;
                case "S":
                    phoneBook.sort();
                    break;
                case "V":
                    phoneBook.view();
                    break;
                case "W":
                    phoneBook.write();
                    break;
                case "R":
                    phoneBook.read();
                    break;
                case "Z":
                    return;
                default: System.out.println("неприпустиме значення!");
                    break;

            }
            answer = console.selectAction();
        }
    }
}
