package com.programming_basics.softuni.CA_WhileLoops;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String initialPass = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals(initialPass)) {
            input = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", username);
    }
}