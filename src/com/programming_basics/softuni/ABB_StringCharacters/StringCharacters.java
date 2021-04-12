package com.programming_basics.softuni.ABB_StringCharacters;

//public class StringCharacters {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.nextLine();
//
//        for (int i = 0; i <= word.length()-1; i++) {
//            System.out.println(word.charAt(i));
//        }
//    }
//}
import java.util.Scanner;

public class StringCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i <= word.length()-1; i++) {

            char symbol = word.charAt(i);
            if ('a' == symbol) {
                sum += 1;
            } else if ('o' == symbol) {
                sum += 4;
            } else if ('u' == symbol) {
                sum += 5;
            } else if ('e' == symbol) {
                sum += 2;
            } else if ('i' == symbol) {
                sum += 3;
            }
        }
        System.out.println(sum);
    }
}