package com.quest.practise_vars;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentNames[] = new String[50];
        int total = 0;
        float avg = 0;
        System.out.println("Enter no:of students: ");
        int numberOfStud = sc.nextInt();
        int math[] = new int[numberOfStud + 1];
        int science[] = new int[numberOfStud + 1];
        int english[] = new int[numberOfStud + 1];
        for (int i = 1; i < numberOfStud + 1; i++) {
            System.out.println("Enter Name of student " + i + " :");
            studentNames[i] = sc.next();
            System.out.println("Enter the score for Math (0-100):");
            while (!sc.hasNextInt()) {
                System.out.println("Enter a valid integer: ");
                sc.next();
            }
            math[i] = sc.nextInt();
            if (math[i] >= 0 && math[i] <= 100) {
                math[i] = sc.nextInt();
            } else {
                System.out.println("Enter a valid integer between 0 and 100: ");
            }
            math[i] = sc.nextInt();
            System.out.println("Enter the score for Science (0-100):");
            while (!sc.hasNextInt()) {
                System.out.println("Enter a valid integer: ");
                sc.next();
            }
            science[i] = sc.nextInt();
            if (science[i] >= 0 && science[i] <= 100) {
                science[i] = sc.nextInt();
            } else {
                System.out.println("Enter a valid integer between 0 and 100: ");
            }
            science[i] = sc.nextInt();
            System.out.println("Enter the score for English (0-100):");
            while (!sc.hasNextInt()) {
                System.out.println("Enter a valid integer: ");
                sc.next();
            }
            english[i] = sc.nextInt();
            if (english[i] >= 0 && english[i] <= 100) {
                english[i] = sc.nextInt();
            } else {
                System.out.println("Enter a valid integer between 0 and 100: ");
            }
            english[i] = sc.nextInt();
            total = total + math[i] + science[i] + english[i];
            System.out.println("Total Score: ");
            System.out.println(total);
            avg = total / 3;
            System.out.println("Average Score: " + avg);
            if (avg >= 90) {
                System.out.println("Grade: A");
                System.out.println("Excellent Performance");
            } else if (avg >= 80 && avg < 90) {
                System.out.println("Grade: B");
                System.out.println("Good Job, but you can aim higher!");
            } else if (avg >= 70 && avg < 80) {
                System.out.println("Grade: C");
                System.out.println("You need to put in more effort!");
            } else if (avg >= 60 && avg < 70) {
                System.out.println("Grade: D");
                System.out.println("Your performance is below expectations. Consider seeking help.");
            } else if (avg < 60) {
                System.out.println("Grade: F");
                System.out.println("Failure. You need significant improvement.");
                System.out.println("Warning: Needs improvement in individual subjects.");
            } else {
            }
        }
        System.out.println("Summary: " + numberOfStud + " students processed!");
    }

}
