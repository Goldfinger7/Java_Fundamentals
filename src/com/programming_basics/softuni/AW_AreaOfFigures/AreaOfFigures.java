package com.programming_basics.softuni.AW_AreaOfFigures;

import java.util.Scanner;

public class AreaOfFigures {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();

        if (shape.toLowerCase().equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            double area = a * a;
            System.out.printf("%.3f", area);
        } else if (shape.toLowerCase().equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double area = a * b;
            System.out.printf("%.3f", area);
        } else if (shape.toLowerCase().equals("circle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double area = Math.PI * Math.pow(a, 2);
            System.out.printf("%.3f", area);
        } else if (shape.toLowerCase().equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double area = (a * b) / 2;
            System.out.printf("%.3f", area);
        }

    }
}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String shape = scanner.nextLine();
//
//        if (shape.toLowerCase().equals("square")) {
//            double a = Double.parseDouble(scanner.nextLine());
//            System.out.printf("%.3f", Square(a));
//        } else if (shape.toLowerCase().equals("rectangle")) {
//            double a = Double.parseDouble(scanner.nextLine());
//            double b = Double.parseDouble(scanner.nextLine());
//            System.out.printf("%.3f", Rectangle(a,b));
//        } else if (shape.toLowerCase().equals("circle")) {
//            double a = Double.parseDouble(scanner.nextLine());
//            System.out.printf("%.3f", Circle(a));
//        } else if (shape.toLowerCase().equals("triangle")) {
//            double a = Double.parseDouble(scanner.nextLine());
//            double b = Double.parseDouble(scanner.nextLine());
//            System.out.printf("%.3f", Triangle(a,b));
//        }
//
//    }

//    private static Double Square(double a) {
//        double area = a * a;
//        return area;
//    }

//    private static Double Rectangle(double a, double b) {
//        double area = a * b;
//        return area;
//    }

//    private static Double Circle(double a) {
//        double area = Math.PI * Math.pow(a, 2);
//        return area;
//    }

//    private static Double Triangle(double a, double b) {
//        double area = (a * b) / 2;
//        return area;
//    }
