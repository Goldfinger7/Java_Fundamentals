package com.programming_basics.softuni.AU_100to200;

import java.util.Scanner;

public class from100to200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = Integer.parseInt(scanner.nextLine());

        if (numb < 100) {
            System.out.println("Less than 100");
        } else if (numb > 200) {
            System.out.println("Greater than 200");
        } else {
            System.out.println("Between 100 and 200");
        }
    }
}
