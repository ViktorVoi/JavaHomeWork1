package com.pb.voitovych.hw8;

public class OnlineShop {
    public static void main(String[] args) {
        Auth user = new Auth() ;
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
        System.out.println("---- the end");
    }
}
