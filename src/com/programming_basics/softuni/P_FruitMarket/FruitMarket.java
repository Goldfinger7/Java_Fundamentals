package com.programming_basics.softuni.P_FruitMarket;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananasInKg = Double.parseDouble(scanner.nextLine());
        double orangesInKg = Double.parseDouble(scanner.nextLine());
        double raspberriesInKg = Double.parseDouble(scanner.nextLine());
        double strawberriesInKg = Double.parseDouble(scanner.nextLine());

        // strawberryPrice from console
        double raspberriesPrice = strawberryPrice / 2;
        double orangesPrice = raspberriesPrice - ((raspberriesPrice * 40) / 100);
        double bananasPrice = raspberriesPrice - ((raspberriesPrice * 80) / 100);

        //prices for KG
        double priceStrawberries = strawberryPrice * strawberriesInKg;
        double priceBananas = bananasPrice * bananasInKg;
        double priceOranges = orangesPrice * orangesInKg;
        double priceRaspberries = raspberriesPrice * raspberriesInKg;

        double totalAmount = priceStrawberries + priceBananas + priceOranges + priceRaspberries;
        System.out.printf("%.2f", totalAmount);
    }
}
