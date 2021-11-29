package com.pb.voitovych.hw10;

public class Main {

    public static void main(String[] args)  {
        NumBox<Number> numbers = new NumBox<>(5) ;
        numbers.getAllInfo();

        System.out.print("додаємо елемент масиву чисел...");
        try {
            numbers.add((Integer) 5);
            System.out.println(" Ok");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        numbers.getAllInfo();

        System.out.print("додаємо елемент масиву чисел...");
        try {
            numbers.add((float) 7.21);
            System.out.println(" Ok");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        numbers.getAllInfo();

        System.out.print("додаємо елемент масиву чисел...");
        try {
            numbers.add((double) 8.14867);
            System.out.println(" Ok");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        numbers.getAllInfo();

        System.out.print("додаємо елемент масиву чисел...");
        try {
            numbers.add((double) -12.14867);
            System.out.println(" Ok");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        numbers.getAllInfo();

        System.out.print("додаємо елемент масиву чисел...");
        try {
            numbers.add((Integer) 12);
            System.out.println(" Ok");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        numbers.getAllInfo();

        System.out.print("додаємо елемент масиву чисел...");
        try {
            numbers.add((float) 50);
            System.out.println(" Ok");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return ;
        }
        numbers.getAllInfo();



    }

}
