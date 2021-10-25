package com.pb.voitovych.hw4;

import java.util.Locale;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.ArrayBufferView.length;

public class CapitalLetter {
    public static void main(String[] args) {
        String str0 ;
        Scanner scan = new Scanner(System.in) ;

        System.out.println("Change text to Capital Letter") ;
        System.out.println("-----------------------------\n") ;
        System.out.print("Введіть текст: ") ;

        str0 = scan.nextLine() ;
        System.out.println("Вхідний текст: "+ str0) ;

        System.out.println("Вихідний текст: " + capitalAllFistLetters(str0)) ;   // here we use my own method

    }

    static String capitalAllFistLetters(String txt0) {
        char[] aletters = txt0.toCharArray() ;
        aletters[0] = Character.toUpperCase(aletters[0]);
        for (int i = 1; i < aletters.length; i++) {
            if (Character.isWhitespace(aletters[i - 1])) {
                aletters[i] = Character.toUpperCase(aletters[i]);
            } else {
                aletters[i] = Character.toLowerCase(aletters[i]); // 2LowCase for not first letters
            }
        }
        return new String(aletters);
    }
}
