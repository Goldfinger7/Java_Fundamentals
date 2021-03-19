package com.programming_basics.softuni.BB_MetricConverter;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        if (input.equals("mm") && output.equals("mm")) {
            System.out.printf("%.3f", distance);
        } else if (input.equals("mm") && output.equals("cm")) {
            distance = distance / 10;
            System.out.printf("%.3f", distance);
        } else if (input.equals("mm") && output.equals("m")) {
            distance = distance / 1000;
            System.out.printf("%.3f", distance);
        } else if (input.equals("cm") && output.equals("mm")) {
            distance = distance * 10;
            System.out.printf("%.3f", distance);
        } else if (input.equals("cm") && output.equals("cm")) {
            System.out.printf("%.3f", distance);
        } else if (input.equals("cm") && output.equals("m")) {
            distance = distance / 100;
            System.out.printf("%.3f", distance);
        } else if (input.equals("m") && output.equals("mm")) {
            distance = distance * 1000;
            System.out.printf("%.3f", distance);
        } else if (input.equals("m") && output.equals("cm")) {
            distance = distance * 100;
            System.out.printf("%.3f", distance);
        } else if (input.equals("m") && output.equals("m")) {
            System.out.printf("%.3f", distance);
        }
    }
}
