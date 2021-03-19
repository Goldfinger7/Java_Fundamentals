package com.programming_basics.softuni.BC_TimeShift;

import java.util.Scanner;

public class TimeShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int timeshift = minutes + 15;

        if (timeshift > 59) {
            hours++;
            minutes = timeshift - 60;

            if (hours == 24) {
                hours = 0;
            } else if (hours > 24) {
                hours = 0;
                hours++;
            }
        } else {
            minutes = timeshift;
        }

        System.out.printf("%d:%02d", hours, minutes);
    }
}
