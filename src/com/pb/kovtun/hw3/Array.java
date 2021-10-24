package com.pb.kovtun.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int[] array = new int[10];
        int sum = 0;
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 10 элементов массива");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(in.next());
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            sum = sum + array[i];
            if (array[i] > 0) {
                count++;
            }
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Количество положительных чисел: " + count);

        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < (9-j); i++) {
                if (array[i] > array[i + 1]) {
                    int a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
