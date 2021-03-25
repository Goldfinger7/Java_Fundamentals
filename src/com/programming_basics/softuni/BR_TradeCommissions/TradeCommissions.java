package com.programming_basics.softuni.BR_TradeCommissions;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        boolean isValid = true;
        double commission = 0;
        if (town.equals("Sofia")) {
            if (sales < 0) {
                isValid = false;
            } else if (sales >= 0 && sales <= 500) {
                commission = sales * 0.05;
            } else if (sales > 500 && sales <= 1000) {
                commission = sales * 0.07;
            } else if (sales > 1000 && sales <= 10000) {
                commission = sales * 0.08;
            } else if (sales > 10000) {
                commission = sales * 0.12;
            }
        } else if (town.equals("Varna")) {
            if (sales < 0) {
                isValid = false;
            } else if (sales >= 0 && sales <= 500) {
                commission = sales * 0.045;
            } else if (sales > 500 && sales <= 1000) {
                commission = sales * 0.075;
            } else if (sales > 1000 && sales <= 10000) {
                commission = sales * 0.10;
            } else if (sales > 10000) {
                commission = sales * 0.13;
            }
        } else if (town.equals("Plovdiv")) {
            if (sales < 0) {
                isValid = false;
            } else if (sales >= 0 && sales <= 500) {
                commission = sales * 0.055;
            } else if (sales > 500 && sales <= 1000) {
                commission = sales * 0.08;
            } else if (sales > 1000 && sales <= 10000) {
                commission = sales * 0.12;
            } else if (sales > 10000) {
                commission = sales * 0.145;
            }
        } else {
            isValid = false;
        }

        if (isValid) {
            System.out.printf("%.2f", commission);
        } else {
            System.out.println("error");
        }
    }
}