package com.programming_basics.softuni.BL_WorkingDays;

import java.util.Scanner;

public class WorkingDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (hours <= 18 && hours >= 10) {
            switch (day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    System.out.println("open");
                    break;
                default:
                    System.out.println("closed");
            }
        } else {
            System.out.println("closed");
        }
    }
}
