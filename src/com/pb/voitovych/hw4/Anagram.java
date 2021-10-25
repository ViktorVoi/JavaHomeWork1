package com.pb.voitovych.hw4;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        String text1, text2 ;
        Scanner sc = new Scanner(System.in) ;

        System.out.println("This is the Anagram!") ;
        System.out.println("--------------------\n") ;

        System.out.print("Введіть фразу 1: ") ;
        text1 = sc.nextLine() ;
        if (text1.isEmpty()) {
            text1 = "Каролїна - в краіні чудес!" ;
        }
        System.out.print("Введіть фразу 2: ") ;
        text2 = sc.nextLine() ;
        if (text2.isEmpty()) {
            text2 = "Анілорак - в наїрік сучед!" ;
        }

        // At first check is this anagram in full phrases
        if (sortAndEraseNotLetters(text1).equals(sortAndEraseNotLetters(text2))) {
            System.out.println("Фрази є Анаграмою!");
        } else {
            System.out.println("Це не Анаграма фраз!");
        }

        // then check is this anagram in each word of phrases
        String[] awords1 = text1.split(" ") ;
        String[] awords2 = text2.split(" ") ;
        if (awords1.length != awords2.length) {
            System.out.println("Кількість слів у фразах відрізняється! " +
                                "Перевірка анаграм у словах перервана!") ;
            System.exit(0) ;
        }
        int countAnagramInWords  = 0 ;
        for (int i=0; i<awords1.length; i++) {
            if (sortAndEraseNotLetters(awords1[i]).equals(sortAndEraseNotLetters(awords2[i]))) {
                countAnagramInWords++ ;
            }
        }
        System.out.println("Виявлено кількість Анаграм в окремих словах "
                + countAnagramInWords + " з " + (awords1.length) + "!");
    }

    static String sortAndEraseNotLetters(String txt) {
        char[] aTxt = txt.toUpperCase().toCharArray() ;
        StringBuilder rTxt = new StringBuilder() ;
        //System.out.println("почтаковий текст: " + txt) ;
        for (int i=0; i<txt.length(); i++) {
            if (Character.isLetterOrDigit(aTxt[i])) {
                rTxt.append(aTxt[i]) ;
            }
        }
        // -- sort rTxt
        // System.out.println("до сортування: " + rTxt.toString()) ;
        boolean signSwap ;
        char charSwap ;
        do {
            signSwap = false ;
            for (int i = 0; i < rTxt.length() - 1; i++) {
                if (rTxt.charAt(i) > rTxt.charAt(i + 1)) {
                    charSwap = rTxt.charAt(i) ;
                    rTxt.setCharAt(i, rTxt.charAt(i+1)) ;
                    rTxt.setCharAt(i+1, charSwap) ;
                    signSwap = true ;
                }
            }
        } while (signSwap) ;
        //System.out.println("після сортування: " + rTxt.toString()) ;
        return rTxt.toString() ;
    }
}
