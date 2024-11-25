package com.quest.exceptionHandlingDailyTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee employee = null;
        Manager manager = null;

        System.out.println("Enter Employee Details:");
        while (employee == null) {
            try {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                System.out.print("Enter age: ");
                int age = scanner.nextInt();

                System.out.print("Enter salary: ");
                double salary = scanner.nextDouble();
                scanner.nextLine();

                employee = new Employee(name, age, salary);
            } catch (InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input type. Please enter correct data types.");
                scanner.nextLine();
            }
        }

        System.out.println("\nEnter Manager Details:");
        while (manager == null) {
            try {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                System.out.print("Enter age: ");
                int age = scanner.nextInt();

                System.out.print("Enter salary: ");
                double salary = scanner.nextDouble();

                System.out.print("Enter team size: ");
                int teamSize = scanner.nextInt();
                scanner.nextLine();

                manager = new Manager(name, age, salary, teamSize);
            } catch (InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input type. Please enter correct data types.");
                scanner.nextLine();
            }
        }
        System.out.println("Employee Details: ");
        employee.displayDetails();
        System.out.println("Manager Details: ");
        manager.displayDetails();
    }
}
