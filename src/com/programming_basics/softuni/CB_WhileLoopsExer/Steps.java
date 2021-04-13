package com.programming_basics.softuni.CB_WhileLoopsExer;

import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 10000;
        int steps = 0;

        while (steps < goal) {
            String input = scanner.nextLine();

            if ("Going home".equals(input)) {
                steps += Integer.parseInt(scanner.nextLine());
                break;
            }
            steps += Integer.parseInt(input);
        }

        if (steps >= goal) {
            System.out.printf("Goal reached! Good job!\n" +
                    "%d steps over the goal!", steps - goal);
        } else {
            System.out.printf("%d more steps to reach goal.", goal - steps);
        }
    }
}