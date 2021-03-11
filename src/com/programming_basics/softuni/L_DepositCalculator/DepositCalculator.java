package com.programming_basics.softuni.L_DepositCalculator;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double depositAmount = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        double sumPerPeriod = (depositAmount * interestRate / 100) / 12;
        double totalSum = depositAmount + (months * sumPerPeriod);

        System.out.println(totalSum);
    }
}
