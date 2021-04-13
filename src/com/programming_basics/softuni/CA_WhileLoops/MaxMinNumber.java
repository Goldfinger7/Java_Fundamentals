//package com.programming_basics.softuni.CA_WhileLoops;
//
//import java.util.Scanner;
//
//public class MaxMinNumber {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//
//        int maxNum = Integer.MIN_VALUE;
//        while (!input.equals("Stop")) {
//            int currentNum = Integer.parseInt(input);
//
//            if (currentNum > maxNum) {
//                maxNum = currentNum;
//            }
//
//            input = scanner.nextLine();
//        }
//
//        System.out.println(maxNum);
//    }
//}

package com.programming_basics.softuni.CA_WhileLoops;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int minNum = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int currentNum = Integer.parseInt(input);

            if (currentNum < minNum) {
                minNum = currentNum;
            }

            input = scanner.nextLine();
        }

        System.out.println(minNum);
    }
}