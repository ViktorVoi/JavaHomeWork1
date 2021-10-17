package com.pb.voitovych.hw2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("It's the Calculator!");
        System.out.println("--------------------");

        String sign;
        float operand1, operand2;
        Scanner in = new Scanner(System.in);

        System.out.print("Ведіть число1: ");
        operand1 = in.nextFloat();
        System.out.print("Ведіть число2: ");
        operand2 = in.nextFloat();
        System.out.print("Ведіть дію (+, -, *, /): ");
        sign = in.next() ;

        System.out.println("---------------------");
        System.out.print(operand1+" "+sign+" "+operand2+" = ");

        switch (sign) {
            case "+":
                System.out.println((operand1 + operand2));
                break;
            case "-":
                System.out.println((operand1 - operand2));
                break;
            case "*":
                System.out.println((operand1 * operand2));
                break;
            case "/":
                if (operand2 != 0) {
                    System.out.println((operand1 / operand2));
                } else {
                    System.out.println("??? --- Помилка ділення на нуль!");
                }
                break;
            default:
                System.out.println("??? --- Невідомий оператор дії над числами!");
        }

    }
}
