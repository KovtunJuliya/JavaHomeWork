package com.pb.kovtun.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner in = new Scanner(System.in);
        int i = Integer.parseInt(in.next());
        if(i>=0&&i<=14){
            System.out.println("[0 -14]");
            // [15 - 35] [36 - 50] [51 - 100].
        }else if(i>=15&&i<=35){
            System.out.println("[15 - 35]");
        }else if(i>=36&&i<=50){
            System.out.println("[36 - 50]");
        }else if(i>=51&&i<=100){
            System.out.println("[51 - 100]");
        }else{
            System.out.println("Другой интервал");
        }
    }
}
