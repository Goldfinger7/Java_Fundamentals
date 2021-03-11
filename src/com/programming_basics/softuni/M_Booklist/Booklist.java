package com.programming_basics.softuni.M_Booklist;

import java.util.Scanner;

public class Booklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysToCount = Integer.parseInt(scanner.nextLine());

        int timeToFinish = pages / pagesPerHour;
        int hoursPerDay = timeToFinish / daysToCount;

        System.out.println(hoursPerDay);
    }
}
