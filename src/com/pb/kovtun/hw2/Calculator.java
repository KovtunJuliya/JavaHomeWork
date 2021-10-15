package com.pb.kovtun.hw2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int operand1, operand2;
//        System.out.println("time");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение operand1");
        operand1 = Integer.parseInt(in.next());
        System.out.println("Введите значение operend2");
        operand2 = Integer.parseInt(in.next());
        System.out.println("Введите математический знак");
        String sing;
        sing = in.next();
        switch (sing) {
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                ;
                System.out.println(operand1 - operand2);
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("на 0 делить нельзя");
                } else {
                    System.out.println(operand1 / operand2);}
                    break;


                }




        }


    }
