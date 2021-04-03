package com.programming_basics.softuni.BY_OnTimeForExam;

import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrHour = Integer.parseInt(scanner.nextLine());
        int arrMinutes = Integer.parseInt(scanner.nextLine());

        // convert hours to minutes
        int examTime = (examHour * 60) + examMinutes;
        int arrTime = (arrHour * 60) + arrMinutes;
        String output = "";
        int diff = 0;

        if (arrTime < examTime - 30) { // EARLY
            diff = examTime - arrTime;

            if (diff < 60) {
                output = String.format("Early\n%d minutes before the start", diff);
            } else {
                int hours = diff / 60;
                int minutes = diff % 60;
                output = String.format("Early\n%d:%02d hours before the start", hours, minutes);
            }
        } else if (arrTime <= examTime) { // ON TIME
            diff = examTime - arrTime;
            output = String.format("On time\n%d minutes before the start", diff);
        } else { // LATE
            diff = arrTime - examTime;
            if (diff < 60) {
                output = String.format("Late\n%d minutes after the start", diff);
            } else {
                int hours = diff / 60;
                int minutes = diff % 60;
                output = String.format("Late\n%d:%02d hours after the start", hours, minutes);
            }

        }
        System.out.println(output);
    }
}