package com.programming_basics.softuni.CA_WhileLoops;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if ("Stop".equals(input)) {
                break;
            }

            System.out.println(input);
        }
    }
}
