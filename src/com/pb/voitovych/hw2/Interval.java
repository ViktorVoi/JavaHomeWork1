package com.pb.voitovych.hw2;

import java.util.Scanner;

public class Interval {

    public static void main(String[] args) {

        System.out.println("Let's recognize an interval:");
        System.out.println("---------------------");

        Scanner in = new Scanner(System.in) ;
        int x;
        String result;

        System.out.print("Введіть число від 0 до 100: ");
        x = in.nextInt() ;

        if (x>=0 && x<=14) {
            result = "[0...14]";
        } else {
            if (x>=15 && x<=35) {
                result = "[15...35]";
            } else {
                if (x>=36 && x<=50) {
                    result = "[36...50]";
                } else {
                    if (x>=51 && x<=100) {
                        result = "[50...100]";
                    } else {
                        result = "помилка! число поза межами 0...100!";
                    }
                }
            }
        }
        System.out.println("--------------------------------");
        System.out.println("Число в інтервалі: " + result) ;

    }
}
