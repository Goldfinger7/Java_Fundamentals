package com.programming_basics.softuni.AK_RADtoDEG;

import java.util.Scanner;

public class RADtoDEG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        double degrees = input * 180/Math.PI;

        System.out.printf("%.0f", degrees);
    }
}
