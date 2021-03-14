package com.programming_basics.softuni.AC_SquareArea;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side = Integer.parseInt(scanner.nextLine());
        System.out.println(side * side);
    }
}
