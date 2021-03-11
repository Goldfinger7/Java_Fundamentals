package com.programming_basics.softuni.Q_FishTank;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volume = length * width * height;
        double water = volume * 0.001;
        double waterNeeded = water * (1 - (percent / 100));

        System.out.printf("%.2f", waterNeeded);
    }
}
