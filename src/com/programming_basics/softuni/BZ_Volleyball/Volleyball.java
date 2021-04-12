package com.programming_basics.softuni.BZ_Volleyball;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yearType = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        int weekends = Integer.parseInt(scanner.nextLine());

        double gamesSaturdaySofia = (48 - weekends) * 0.75;
        double gamesSundayHometown = weekends;
        double gamesOnHolidays = holidays * 0.66;
        double totalGames = gamesSaturdaySofia + gamesSundayHometown + gamesOnHolidays;

        if ("leap".equals(yearType)) {
            totalGames = totalGames + (totalGames * 0.15);
            System.out.printf("%.0f", Math.floor(totalGames));
        } else {
            System.out.printf("%d", Math.round(totalGames));
        }
    }
}
