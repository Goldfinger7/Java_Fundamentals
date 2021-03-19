package com.programming_basics.softuni.AZ_BonusScore;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double bonus = 0.00;

        if (number <= 100) {
            bonus = 5;
        } else if (number > 1000) {
            bonus = number * 0.1;
        } else {
            bonus = number * 0.2;
        }

        if (number % 2 == 0) {
            bonus += 1;
        } else if (number % 10 == 5) {
            bonus += 2;
        }

        System.out.println(bonus);
        System.out.println(number + bonus);
    }
}
