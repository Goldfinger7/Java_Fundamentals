package com.programming_basics.softuni.N_BirthdayParty;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hallRent = Integer.parseInt(scanner.nextLine());

        double cakePrice = (hallRent * 20) / 100;
        double drinksPrice = cakePrice - ((cakePrice * 45) / 100);
        double animatorPrice = hallRent / 3;

        double totalPrice = hallRent + cakePrice + drinksPrice + animatorPrice;
        System.out.println(totalPrice);
    }
}
