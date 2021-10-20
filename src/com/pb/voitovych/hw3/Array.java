package com.pb.voitovych.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        int[] arr = new int[10] ;

        int countPos = 0;

        System.out.println("Робота з масивами!") ;
        System.out.println("------------------") ;
        System.out.println("Введіть 10-ть цілих чисел:") ;

        for (int i = 0; i < 10 ; i++) {
            System.out.print((i+1)+"-е число: ") ;
            arr[i] = scan.nextInt() ;
            if (arr[i] > 0) {
                countPos++ ;
            }
        }
        System.out.println("----------------------") ;
        System.out.println("Сума чисел: " + Arrays.stream(arr).sum()) ;
        System.out.println("Кількість додатніх чисел: " + countPos) ;
        System.out.println("Сортуємо масив чисел:") ;

        boolean flagSwap ;
        countPos = 0 ; // for use into swap value between near elements (also int)

         do {
            System.out.println(Arrays.toString(arr)) ;
            flagSwap = false ;
            for (int i=0; i<9; i++) {
                if (arr[i] > arr[i+1]) {
                    countPos = arr[i] ;
                    arr[i] = arr[i+1] ;
                    arr[i+1] = countPos ;
                    flagSwap = true ;
                }
            }
        } while (flagSwap) ;
        System.out.println("-------------------------------------- Оk!") ;
    }
}
