package com.programming_basics.softuni.AG_ArchitectureProjects;

import java.util.Scanner;

public class Concatenate {
    private static final int TIME = 3;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int timeNeeded = TIME * projects;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, timeNeeded, projects);
    }
}
