package com.programming_basics.softuni.BP_FruitShop;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.00;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (product) {
                    case "banana":
                        price = quantity * 2.50;
                        System.out.printf("%.2f", price);
                        break;
                    case "apple":
                        price = quantity * 1.20;
                        System.out.printf("%.2f", price);
                        break;
                    case "orange":
                        price = quantity * 0.85;
                        System.out.printf("%.2f", price);
                        break;
                    case "grapefruit":
                        price = quantity * 1.45;
                        System.out.printf("%.2f", price);
                        break;
                    case "kiwi":
                        price = quantity * 2.70;
                        System.out.printf("%.2f", price);
                        break;
                    case "pineapple":
                        price = quantity * 5.50;
                        System.out.printf("%.2f", price);
                        break;
                    case "grapes":
                        price = quantity * 3.85;
                        System.out.printf("%.2f", price);
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "Saturday":
            case "Sunday":
                switch (product) {
                    case "banana":
                        price = quantity * 2.70;
                        System.out.printf("%.2f", price);
                        break;
                    case "apple":
                        price = quantity * 1.25;
                        System.out.printf("%.2f", price);
                        break;
                    case "orange":
                        price = quantity * 0.90;
                        System.out.printf("%.2f", price);
                        break;
                    case "grapefruit":
                        price = quantity * 1.60;
                        System.out.printf("%.2f", price);
                        break;
                    case "kiwi":
                        price = quantity * 3.00;
                        System.out.printf("%.2f", price);
                        break;
                    case "pineapple":
                        price = quantity * 5.60;
                        System.out.printf("%.2f", price);
                        break;
                    case "grapes":
                        price = quantity * 4.20;
                        System.out.printf("%.2f", price);
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
