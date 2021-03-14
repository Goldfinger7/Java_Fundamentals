package com.programming_basics.softuni.AI_YardGreening;

import java.util.Scanner;

public class YardGreening {
    private static final double PRICEKVM = 7.61;
    private static final double DISCOUNT = 0.18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double squareMeters = Double.parseDouble(scanner.nextLine());

        double calculatedPrice = PRICEKVM * squareMeters;
        double discountAmount = DISCOUNT * calculatedPrice;
        double totalAmount = calculatedPrice - discountAmount;

        System.out.printf("The final price is: %.2f lv.\n", totalAmount);
        System.out.printf("The discount is: %.2f lv.", discountAmount);
    }
}
