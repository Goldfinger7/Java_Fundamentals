package com.programming_basics.softuni.BV_Journey;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0.00;
        String placeToStay = "";
        String destination = "";

        if ("summer".equals(season)) {
            placeToStay = "Camp";
        } else if ("winter".equals(season)) {
            placeToStay = "Hotel";
        }

        if (budget <= 100) {
            destination = "Bulgaria";
        } else if (budget <= 1000) {
            destination = "Balkans";
        } else if (budget > 1000) {
            destination = "Europe";
        }

        switch (destination) {
            case "Bulgaria":
                if ("summer".equals(season)) {
                    price = (budget * 30) / 100;
                } else if ("winter".equals(season)) {
                    price = (budget * 70) / 100;
                }
                System.out.printf("Somewhere in %s \n %s - %.2f", destination, placeToStay, price);
                break;
            case "Balkans":
                if ("summer".equals(season)) {
                    price = (budget * 40) / 100;
                } else if ("winter".equals(season)) {
                    price = (budget * 80) / 100;
                }
                System.out.printf("Somewhere in %s \n %s - %.2f", destination, placeToStay, price);
                break;
            case "Europe":
                price = (budget * 90) / 100;
                System.out.printf("Somewhere in %s \n Hotel - %.2f", destination, price);
                break;
        }
    }
}