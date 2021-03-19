package com.programming_basics.softuni.BE_SwimmingRecord;

import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForUnitDistance = Double.parseDouble(scanner.nextLine());

        double addingTimes = Math.floor(distance / 15);
        double resistance = addingTimes * 12.5;
        double setTime = distance * timeForUnitDistance;

        double finalTime = setTime + resistance;
        double diff = finalTime - worldRecord;

        if (worldRecord <= finalTime) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalTime);
        }
    }
}