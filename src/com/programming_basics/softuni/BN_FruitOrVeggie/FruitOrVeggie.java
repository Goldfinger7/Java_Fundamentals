package com.programming_basics.softuni.BN_FruitOrVeggie;

import java.util.Scanner;

public class FruitOrVeggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String object = scanner.nextLine();

        switch (object) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
