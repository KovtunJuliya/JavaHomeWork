package com.pb.kovtun.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random rn = new Random();
        int i = rn.nextInt(101);
        String a;
        int count = 0;
        System.out.println("Угадайте загаданное число от 0 до 100 (Введите * если вам неинтересно)");
        Scanner in = new Scanner(System.in);
        do {
            count++;
            a = in.next();

            if (a.equals("*")) {
                System.out.println("Всего Хорошего!");
                break;
            }
            if (i > Integer.parseInt(a)) {
                System.out.println("Загаданное число больше(*");
                System.out.println("Попытка №" + count + " (Введите * если вам неинтересно)");
            }
            if (i < Integer.parseInt(a)) {
                System.out.println("Загаданное число меньше");
                System.out.println("Попытка №" + count + " (Введите * если вам неинтересно)");
            }
        } while (i != Integer.parseInt(a));
        if (!a.equals("*")) {
            System.out.println("Поздравляем вы угадали!");
        }

    }
}
