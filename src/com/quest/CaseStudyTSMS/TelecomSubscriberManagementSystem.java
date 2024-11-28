package com.quest.CaseStudyTSMS;

import java.util.Scanner;

public class TelecomSubscriberManagementSystem {
    public static void main(String[] args) {
        TelecomSystem telecomSystem = new TelecomSystem();
        Scanner scanner = new Scanner(System.in);

        telecomSystem.loadData(); // To Load data during startup.

        int choice;
        do {
            System.out.println("\n--- Telecom Management System ---");
            System.out.println("1. Add a Subscriber");
            System.out.println("2. Update Balance of Subscriber");
            System.out.println("3. List the available Subscribers");
            System.out.println("4. Add a Call Record");
            System.out.println("5. Display the call details");
            System.out.println("6. Generate Bill");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 : {
                    System.out.print("Enter Subscriber ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter Plan Type (Prepaid/Postpaid): ");
                    String planType = scanner.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine();
                    Subscribers subscriber = new Subscribers(id, name, phone, planType, balance);
                    telecomSystem.addSubscriber(subscriber);
                    break;
                }
                case 2 : {
                    System.out.print("Enter Subscriber ID to Update Balance: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter New Balance: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine();
                    telecomSystem.updateSubscriberBalance(id, balance);
                    break;
                }
                case 3 : telecomSystem.listSubscribers();
                break;
                case 4 : {
                    System.out.print("Enter Subscriber ID for the Call: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Call Type (Local/STD/ISD): ");
                    String callType = scanner.nextLine();
                    System.out.print("Enter Call Duration (in minutes): ");
                    int duration = scanner.nextInt();
                    scanner.nextLine();
                    telecomSystem.addCallRecord(id, callType, duration);
                    break;
                }
                case 5 : {
                    System.out.print("Enter Subscriber ID to Display Call History: ");
                    String id = scanner.nextLine();
                    telecomSystem.displayCallHistory(id);
                    break;
                }
                case 6 : {
                    System.out.print("Enter Subscriber ID to Generate Bill: ");
                    String id = scanner.nextLine();
                    telecomSystem.generateBill(id);
                    break;
                }
                case 7 : {
                    System.out.println("Saving data and exiting...");
                    telecomSystem.saveData();
                    break;
                }
                default : System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}

