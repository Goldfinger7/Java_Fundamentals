package com.programming_basics.softuni.AB_Numbers;

import java.util.Scanner;

public class Numbers3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        double countP1 = 0;
        double countP2 = 0;
        double countP3 = 0;
        double countP4 = 0;
        double countP5= 0;

        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200) {
                countP1++;
            } else if (number >= 200 && number <= 399) {
                countP2++;
            } else if (number >= 400 && number <= 599) {
                countP3++;
            } else if (number >= 600 && number <= 799) {
                countP4++;
            } else {
                countP5++;
            }
        }

        double p1 = (countP1 / count) * 100;
        double p2 = (countP2 / count) * 100;
        double p3 = (countP3 / count) * 100;
        double p4 = (countP4 / count) * 100;
        double p5 = (countP5 / count) * 100;

        System.out.printf("%.2f%%\n", p1);
        System.out.printf("%.2f%%\n", p2);
        System.out.printf("%.2f%%\n", p3);
        System.out.printf("%.2f%%\n", p4);
        System.out.printf("%.2f%%", p5);
    }
}