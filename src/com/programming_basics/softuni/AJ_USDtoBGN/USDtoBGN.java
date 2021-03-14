package com.programming_basics.softuni.AJ_USDtoBGN;

import java.util.Scanner;

public class USDtoBGN {
    private static final double VALUE = 1.79549;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dollars = Double.parseDouble(scanner.nextLine());
        double converted = dollars * VALUE;
        System.out.println(converted);
    }
}
