package com.programming_basics.softuni.CA_WhileLoops;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int volumeHouse = width * length * height;

        String input = scanner.nextLine();
        int boxesSum = 0;

        while (!input.equals("Done")){
            int boxes = Integer.parseInt(input);
            boxesSum += boxes;

            if (boxesSum >= volumeHouse){
                break;
            }

            input = scanner.nextLine();
        }

        int diff = Math.abs(boxesSum - volumeHouse);
        if (boxesSum >= volumeHouse) {
            System.out.printf("No more free space! You need %d Cubic meters more.", diff);
        } else {
            System.out.printf("%d Cubic meters left.", diff);
        }
    }
}