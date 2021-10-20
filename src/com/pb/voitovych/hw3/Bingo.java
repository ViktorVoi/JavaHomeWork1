package com.pb.voitovych.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {

        Random rnd = new Random() ;
        int x = rnd.nextInt(100);

        int i = 0 ; // count of attempts

        Scanner scan = new Scanner(System.in) ;
        int y ;
        String answ ;

        System.out.println("The Game -=Bingo=-! Вгадайте задумане число!") ;
        System.out.println("-----------") ;
        System.out.println() ;


        do {
            i++ ;
            System.out.print(i+". Введіть число [0...100]: ") ;
            y = scan.nextInt() ;
            if (y < x) {
                System.out.println("Ваше число МЕНШЕ задуманого!") ;
            } else {
                if (y > x) {
                    System.out.println("Ваше число БІЛЬШЕ задуманого!") ;
                } else {
                    System.out.println("ВІТАЮ! Ви вгадали! Використано спроб: " + i) ;
                    break ;
                }
            }
            System.out.print("Продовжимо? (y or n): ");
            answ = scan.next() ;
        } while (!answ.equals("n")) ;

        System.out.println("Game Over!") ;

    }
}
