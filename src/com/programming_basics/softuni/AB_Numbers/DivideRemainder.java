package com.programming_basics.softuni.AB_Numbers;
import java.util.Scanner;

public class DivideRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        double countP1 = 0;
        double countP2 = 0;
        double countP3 = 0;

        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) {
                countP1++;
            }

            if (number % 3 == 0) {
                countP2++;
            }

            if (number % 4 == 0) {
                countP3++;
            }
        }

        double p1 = (countP1 / count) * 100;
        double p2 = (countP2 / count) * 100;
        double p3 = (countP3 / count) * 100;

        System.out.printf("%.2f%%\n", p1);
        System.out.printf("%.2f%%\n", p2);
        System.out.printf("%.2f%%", p3);
    }
}