package com.programming_basics.softuni.AB_Numbers1To10;

//public class Numbers {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Numbers {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int number = Integer.parseInt(scanner.nextLine());
//
//        for (int i = number; i > 0; i--) {
//            System.out.println(i);
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Numbers {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int number = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 1; i <= number; ) {
//            System.out.println(i);
//            i += 3;
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Numbers {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int number = Integer.parseInt(scanner.nextLine());
//        int second = 2;
//
//        for (int i = 0; i <= number; i = i + 2) {
//            int a = (int) Math.pow(second, i);
//            System.out.println(a);
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Numbers {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int numbers = Integer.parseInt(scanner.nextLine());
//        int result = 0;
//
//        for (int i = 1; i <= numbers; i++) {
//            int number = Integer.parseInt(scanner.nextLine());
//            result += number;
//        }
//        System.out.println(result);
//    }
//}

//import java.util.Scanner;
//
//public class Numbers {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int numbers = Integer.parseInt(scanner.nextLine());
//        int maxNumber = Integer.MIN_VALUE;
//        int minNumber = Integer.MAX_VALUE;
//
//        for (int i = 1; i <= numbers; i++) {
//            int number = Integer.parseInt(scanner.nextLine());
//            if (number < minNumber) {
//                minNumber = number;
//            }
//            if (number > maxNumber) {
//                maxNumber = number;
//            }
//        }
//
//        System.out.printf("Max number : %d\n", maxNumber);
//        System.out.printf("Min number : %d", minNumber);
//    }
//}

//import java.util.Scanner;
//
//public class Numbers {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//
//        int leftSum = 0;
//        for (int i = 1; i <= n; i++) {
//            int currentNum = Integer.parseInt(scanner.nextLine());
//            leftSum += currentNum;
//        }
//
//        int rightSum = 0;
//        for (int i = 1; i <= n; i++) {
//            int currentNum = Integer.parseInt(scanner.nextLine());
//            rightSum += currentNum;
//        }
//
//        if (rightSum == leftSum) {
//            System.out.printf("Yes, sum = %d", leftSum);
//        } else {
//            System.out.printf("No, diff = %d", Math.abs(rightSum - leftSum));
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Numbers {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//
//        int evenSum = 0;
//        int oddSum = 0;
//        for (int i = 1; i <= n; i++) {
//            int currentNum = Integer.parseInt(scanner.nextLine());
//            if (i % 2 == 0) {
//                evenSum += currentNum;
//            } else {
//                oddSum += currentNum;
//            }
//        }
//
//        if (evenSum == oddSum) {
//            System.out.printf("Yes\nSum = %d", evenSum);
//        } else {
//            System.out.printf("No\nDiff = %d", Math.abs(evenSum - oddSum));
//        }
//    }
//}

//public class Numbers {
//    public static void main(String[] args) {
//
//        for (int i = 7; i <= 997; i++) {
//            if (i % 10 == 7) {
//                System.out.println(i);
//            }
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Numbers {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int count = Integer.parseInt(scanner.nextLine());
//        int maxNumber = Integer.MIN_VALUE;
//        int minNumber = Integer.MAX_VALUE;
//        int sum = 0;
//
//        for (int i = 0; i < count; i++) {
//            int numbers = Integer.parseInt(scanner.nextLine());
//            sum += numbers;
//            if (numbers > maxNumber) {
//                maxNumber = numbers;
//            }
//        }
//        sum -= maxNumber;
//        if (sum == maxNumber) {
//            System.out.printf("Yes%nSum = %d", maxNumber);
//        } else {
//            System.out.printf("No%nDiff = %d", Math.abs(sum - maxNumber));
//        }
//    }
//}

