package com.programming_basics.softuni.CB_WhileLoopsExer;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchedBook = scanner.nextLine();
        String currentBook = scanner.nextLine();
        int countBooks = 0;
        boolean isFound = false;

        while (!currentBook.equals("No More Books")) {

            if (searchedBook.equals(currentBook)) {
                System.out.printf("You checked %d books and found it.", countBooks);
                isFound = true;
                break;
            }

            countBooks++;
            currentBook = scanner.nextLine();

        }

        if (!isFound) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countBooks);
        }
    }
}