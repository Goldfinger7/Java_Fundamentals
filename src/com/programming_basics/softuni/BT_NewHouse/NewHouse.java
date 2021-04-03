package com.programming_basics.softuni.BT_NewHouse;

import java.util.Scanner;

public class NewHouse {

    public static final Double ROSES = 5.00;
    public static final Double DAHLIAS = 3.80;
    public static final Double TULIPS = 2.80;
    public static final Double NARCISSUS = 3.00;
    public static final Double GLADIOLUS = 2.50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0.00;
        double diff = 0.00;

        if ("Roses".equals(flower)) {
            if (countFlowers > 80) {
                price = (countFlowers * ROSES) - ((countFlowers * ROSES) * 0.10);
                if (budget >= price) {
                    diff = budget - price;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flower, diff);
                } else {
                    diff = price - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", diff);
                }
            } else {
                price = (countFlowers * ROSES);
                if (budget >= price) {
                    diff = budget - price;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flower, diff);
                } else {
                    diff = price - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", diff);
                }
            }
        } else if ("Dahlias".equals(flower)) {
            if (countFlowers > 90) {
                price = (countFlowers * DAHLIAS) - ((countFlowers * DAHLIAS) * 0.15);
                if (budget >= price) {
                    diff = budget - price;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flower, diff);
                } else {
                    diff = price - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", diff);
                }
            } else {
                price = (countFlowers * DAHLIAS);
                if (budget >= price) {
                    diff = budget - price;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flower, diff);
                } else {
                    diff = price - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", diff);
                }
            }
        } else if ("Tulips".equals(flower)) {
            if (countFlowers > 80) {
                price = (countFlowers * TULIPS) - ((countFlowers * TULIPS) * 0.15);
                if (budget >= price) {
                    diff = budget - price;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flower, diff);
                } else {
                    diff = price - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", diff);
                }
            } else {
                price = (countFlowers * TULIPS);
                if (budget >= price) {
                    diff = budget - price;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flower, diff);
                } else {
                    diff = price - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", diff);
                }
            }
        } else if ("Narcissus".equals(flower)) {
            if (countFlowers < 120) {
                price = (countFlowers * NARCISSUS) + ((countFlowers * NARCISSUS) * 0.15);
                if (budget >= price) {
                    diff = budget - price;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flower, diff);
                } else {
                    diff = price - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", diff);
                }
            } else {
                price = (countFlowers * NARCISSUS);
                if (budget >= price) {
                    diff = budget - price;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flower, diff);
                } else {
                    diff = price - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", diff);
                }
            }
        } else if ("Gladiolus".equals(flower)) {
            if (countFlowers < 80) {
                price = (countFlowers * GLADIOLUS) + ((countFlowers * GLADIOLUS) * 0.20);
                if (budget >= price) {
                    diff = budget - price;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flower, diff);
                } else {
                    diff = price - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", diff);
                }
            } else {
                price = (countFlowers * GLADIOLUS);
                if (budget >= price) {
                    diff = budget - price;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flower, diff);
                } else {
                    diff = price - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", diff);
                }
            }
        }
    }
}
