package com.programming_basics.softuni.BD_GodzillaVsKong;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = (budget * 10)  / 100;
        double clothsPrice = statists * clothPrice;

        if (statists > 150) {
            clothsPrice -= ((clothsPrice * 10) / 100);
        }

        double totalSum = decorPrice + clothsPrice;
        double revenue = budget - totalSum;

        if (revenue >= 0) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", revenue);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(revenue));
        }
    }
}
