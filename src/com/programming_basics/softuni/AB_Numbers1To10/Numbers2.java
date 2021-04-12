package com.programming_basics.softuni.AB_Numbers1To10;

import java.util.*;

public class Numbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double oddSum = 0;
        double oddMin = Double.POSITIVE_INFINITY;
        double oddMax = Double.NEGATIVE_INFINITY;

        double evenSum = 0;
        double evenMin = Double.POSITIVE_INFINITY;
        double evenMax = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            if (i % 2 != 0) {
                oddSum += number;

                if (number < oddMin) {
                    oddMin = number;
                } else if (number > oddMax) {
                    oddMax = number;
                }
            } else {
                evenSum += number;

                if (number < evenMin) {
                    evenMin = number;
                } else if (number > evenMax) {
                    evenMax = number;
                }
            }
        }

        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (oddSum == 0) {
            System.out.printf("OddMin=No,%nOddMax=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }

    }
}
