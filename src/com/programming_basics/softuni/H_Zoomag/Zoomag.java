package com.programming_basics.softuni.H_Zoomag;

import java.util.Scanner;

public class Zoomag {
    private static final double FDOGS = 2.50;
    private static final int FOTHERS = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDogs = Integer.parseInt(scanner.nextLine());
        int numberOfOther = Integer.parseInt(scanner.nextLine());

        double sumFoodForDogs = FDOGS * (double) (numberOfDogs);
        double sumFoodForOthers = FOTHERS * (double) (numberOfOther);
        double sumAll = sumFoodForDogs + sumFoodForOthers;
        System.out.println(sumAll + " lv.");
    }
}
