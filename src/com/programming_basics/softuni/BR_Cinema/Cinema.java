package com.programming_basics.softuni.BR_Cinema;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projectionType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double ticketPrice = 0.00;

        switch (projectionType) {
            case "Premiere":
                ticketPrice = 12.00;
                break;
            case "Normal":
                ticketPrice = 7.50;
                break;
            case "Discount":
                ticketPrice = 5.00;
                break;
        }

        int seats = rows * columns;
        double profit = seats * ticketPrice;
        System.out.printf("%.2f leva", profit);
    }
}
