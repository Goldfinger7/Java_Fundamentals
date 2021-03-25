package com.programming_basics.softuni.BK_NumberInRange;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int variable = Integer.parseInt(scanner.nextLine());

        if (((variable <= 100) && (variable >= -100)) && variable != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
