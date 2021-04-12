package com.programming_basics.softuni.BZN_CleverLilly;

import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toysCounter = 0;
        int countBrother = 0;
        double sumMoney = 0;
        double money = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 != 0) {
                toysCounter++;
            } else {
                countBrother++;
                money += 10;
                sumMoney += money;
            }
        }

        int allToysMoney = toysCounter * toyPrice;
        double allMoney = allToysMoney + sumMoney - countBrother;

        if (allMoney >= washMachinePrice) {
            System.out.printf("Yes! %.2f", Math.abs(allMoney - washMachinePrice));
        } else {
            System.out.printf("No! %.2f", Math.abs(allMoney - washMachinePrice));
        }
    }
}
