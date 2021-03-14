package com.programming_basics.softuni.AV_PassGuess;

import java.util.Scanner;

public class PassGuess {
    private static final String PASS = "s3cr3t!P@ssw0rd";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        if (pass.equals(PASS)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
