package com.programming_basics.softuni.BQA_SkiTrip;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String placeType = scanner.nextLine();
        String feedback = scanner.nextLine();
        double price = 0.00;
        double discountAmount = 0.00;

        switch (placeType) {
            case "room for one person":
                price = (days - 1) * 18.00;
                break;
            case "apartment":
                price = (days - 1) * 25.00;
                if (days < 10) {
                    discountAmount = price * 0.30;
                } else if (days >= 10 && days <= 15) {
                    discountAmount = price * 0.35;
                } else {
                    discountAmount = price * 0.50;
                }
                break;
            case "president apartment":
                price = (days - 1) * 35.00;
                if (days < 10) {
                    discountAmount = price * 0.10;
                } else if (days >= 10 && days <= 15) {
                    discountAmount = price * 0.15;
                } else {
                    discountAmount = price * 0.20;
                }
                break;
        }

        if ("positive".equals(feedback)) {
            price = (price - discountAmount) + ((price - discountAmount) * 0.25);
        } else if ("negative".equals(feedback)) {
            price = (price - discountAmount) - ((price - discountAmount) * 0.10);

        }
        System.out.printf("%.2f", price);
    }
}