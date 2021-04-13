package com.programming_basics.softuni.CA_WhileLoops;

import java.util.Scanner;

public class SUmNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialNum = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (sum < initialNum) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;
        }

        System.out.println(sum);
    }
}