package com.pb.voitovych.hw10;

public class NumBox <T extends Number> {
    private T[] numbers ;
    private int len ;

    public NumBox(int size) {
        this.numbers = (T[]) new Number[size];
        this.len = 0 ;
    }

    public void add(T num) throws Exception {
        if (len < numbers.length) {
            numbers[len] = num ;
            len++ ;
        } else {
            throw new Exception("Перевищена максимальна кількість чисел!") ;
        }
    }

    public T get(int index) {
        return numbers[index] ;
    }

    public int length() {
        return len ;
    };

    public double average() throws Exception {
        if (len > 0) {
            return sum() / len;
        } else {
            throw new Exception("Масив чисел має нуль елементів!") ;
        }
    }

    public double sum() {
        double s = 0 ;
        for (int i=0; i<len; i++) {
            s+= numbers[i].doubleValue() ;
        }
        return s ;
    }

    public double max() throws Exception{
        if (len > 0) {
            double m = numbers[0].doubleValue();
            for (int i=1; i<len; i++) {
                if (numbers[i].doubleValue() > m) {
                    m = numbers[i].doubleValue() ;
                }
            }
            return m ;
        } else {
            throw new Exception("Масив чисел поки не має елементів!") ;
        }
    }

    public void getAllInfo() {
        System.out.print("Поточний масив (макс - " + numbers.length +" елементів): ");
        for (T n:numbers) {
            if (n == null) {
                System.out.print("null ");
            } else {
                System.out.print(n.toString() + " ");
            }
        }
        System.out.println();

        System.out.println("- заповнено " + length() + " елементів масиву");

        System.out.print("- середнє значення заповнених елементів: ");
        try {
            System.out.println(average()) ;
        } catch (Exception ex) {
            System.out.println(ex.getMessage()) ;
        }

        System.out.println("- сума заповнених елементів: " + sum());

        System.out.print("- максимальне значення заповнених елеменнтів: ");

        try {
            System.out.println(max());
        } catch (Exception ex) {
            System.out.println(ex.getMessage()) ;
        }
        System.out.println("-------------------------------");
    }

}
