package com.programming_basics.softuni.AX_ToyShop;

import java.util.Scanner;

public class ToyShop {
    private static final double PUZZLE = 2.60;
    private static final double DOLL = 3.00;
    private static final double BEAR = 4.10;
    private static final double MINION = 8.20;
    private static final double TRUCK = 2.00;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double trip = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double income = (puzzles * PUZZLE) + (dolls * DOLL) + (bears * BEAR) + (minions * MINION) + (trucks * TRUCK);
        int countToys = puzzles + dolls + bears + minions + trucks;
        double sumAfterDisc;
        double sumAfterRent;

        if (countToys >= 50) {
            double disc = (income * 25) / 100;
            sumAfterDisc = income - disc;
        } else {
            sumAfterDisc = income;
        }

        double rent = (sumAfterDisc * 10) / 100;
        sumAfterRent = sumAfterDisc - rent;

        if (sumAfterRent >= trip) {
            double diff = sumAfterRent - trip;
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            double diff = trip - sumAfterRent;
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
