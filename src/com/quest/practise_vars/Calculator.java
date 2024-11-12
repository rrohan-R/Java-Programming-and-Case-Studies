package com.quest.practise_vars;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int start = sc.nextInt();
        double result = (float) start;
        System.out.println("Current Result: " + result);
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        System.out.println("5. Square Root");
        System.out.println("6. Clear Current Result");
        System.out.println("7. Exit");

        String choice2="";
        do {
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number to add: ");
                    int add = sc.nextInt();
                    result = start + add;
                    System.out.println("Current Result: " + result);
                    break;
                case 2:
                    System.out.println("Enter the number to subtract: ");
                    int sub = sc.nextInt();
                    result = start - sub;
                    System.out.println("Current Result: " + result);
                    break;
                case 3:
                    System.out.println("Enter the number to multiply: ");
                    int mul = sc.nextInt();
                    result = start * mul;
                    System.out.println("Current Result: " + result);
                    break;
                case 4:
                    System.out.println("Enter the number to divide: ");
                    int div = sc.nextInt();
                    result = start / div;
                    System.out.println("Current Result: " + result);
                    break;
                case 5:
                    result = Math.sqrt(result);
                    System.out.println("Current Result: " + result);
                    break;
                case 6:
                    result = 0;
                    System.out.println("Current Result: " + result);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;

            }
            System.out.println("Do you want to perform another operation? (yes/no): ");
            choice2 = sc.next();
        }
        while (choice2.equalsIgnoreCase("yes"));


        }
    }
