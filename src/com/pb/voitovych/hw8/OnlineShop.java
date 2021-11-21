package com.pb.voitovych.hw8;

import java.util.Arrays;
import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Auth user = new Auth() ;
        System.out.println("Start checking...");
        // реєструємся неправильно1
        try {
            user.singUp("НЕПРАВИ;%:?", "123456", "123456");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        // реєструємся неправильно2
        try {
            user.singUp("bigben", "123456", "654321");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        // реєструємся правильно
        try {
            user.singUp("BigBen", "Abc123", "Abc123");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // авторизуємось неправильно
        try {
            user.singIn("SmallBen", "Abc123");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        // авторизуємось правильно
        try {
            user.singIn("BigBen", "Abc123");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("---- the end of checking \n");

        Scanner scan = new Scanner(System.in) ;
        String login, password, confirmPassword ;
        boolean success ;
        do {
            success = true ;
            System.out.println("-= Реєстрація користувача =-");
            System.out.print("Логін (>=5 симв., A-z,0-9): ");
            login = scan.next();
            System.out.print("Пароль (> 5 симв., A-z,0-9,_): ");
            password = scan.next();
            System.out.print("Підвердіть пароль: ");
            confirmPassword = scan.next();
            try {
                user.singUp(login, password, confirmPassword);
            } catch (Exception ex) {
                success = false ;
                System.out.println(ex.getMessage());
            }
        } while (!success) ;

        int attempt = 0 ;
        do {
            success = true ;
            attempt++ ;
            System.out.println("-= Авторизація користувача =- "+attempt);
            System.out.print("Логін: ");
            login = scan.next();
            System.out.print("Пароль: ");
            password = scan.next();
            try {
                user.singIn(login, password);
            } catch (Exception ex) {
                success = false ;
                System.out.println(ex.getMessage());
            }
        } while (!success && attempt <= 3) ;

    }
}
