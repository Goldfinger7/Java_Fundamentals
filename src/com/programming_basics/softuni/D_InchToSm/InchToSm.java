package com.programming_basics.softuni.D_InchToSm;

import java.util.Scanner;

public class InchToSm {
    public static void main(String[] args) {
        //защото 1 инч = 2.54 сантиметра
        Scanner scanner = new Scanner(System.in);
        double inch = Double.parseDouble(scanner.nextLine());
        double sm = (inch * 2.54);
        System.out.println(sm);
    }
}
