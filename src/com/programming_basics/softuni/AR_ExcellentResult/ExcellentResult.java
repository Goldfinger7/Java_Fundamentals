package com.programming_basics.softuni.AR_ExcellentResult;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = Integer.parseInt(scanner.nextLine());

        if (score >= 5) {
            System.out.println("Excellent!");
        }
    }
}