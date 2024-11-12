package com.quest.practise_vars;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfEmp=0;
        numOfEmp = valNumOfEmp(sc); //to check whether it is a valid integer
        //variable declaration and initialisation
        String[] empName = new String[numOfEmp];
        int[] baseSalary = new int[numOfEmp];
        int[][] salary = new int[numOfEmp][12];
        int totalSalary = 0;
        float avgSalary = 0;
        int[] bonus = new int[numOfEmp + 1];
        for (int i =0; i < numOfEmp; i++) {
            System.out.println("Enter the name of employee " + (i+1) + ": ");
            empName[i] = sc.next(); //prompts the user to enter the name
            System.out.println("Enter the base salary for " + empName[i] + ": ");
            while (!sc.hasNextInt()) { //to check whether it is a valid integer
                System.out.println("Enter a valid integer: ");
                sc.next();
            }
            baseSalary[i] = sc.nextInt(); //prompts the user to enter the base salary
            for (int j = 0; j< 12; j++) {
                System.out.println("Enter the salary for month " + (j+1) + ": ");
                isValid(sc); //to check whether it is a valid integer
                salary[i][j] =sc.nextInt(); //prompts the user to enter the monthly salaries
                // calculating the total salary, average salary and bonus for each employee
                totalSalary += salary[i][j];
                avgSalary = (float) (totalSalary / 12);
                bonus[i] = baseSalary[i]/12;
            }
        }
        //printing salary report
        System.out.println("--- Employee Salary Report ---");
        for (int i = 0; i < numOfEmp; i++) {
            System.out.println("Employee Name: " + empName[i]);
            System.out.println("Base Salary: " + baseSalary[i]);
            System.out.println("Monthly Salary Breakdown");
            for (int j =0; j < 12; j++) {
                System.out.println("Month " + (j+1) + ": " + salary[i][j]);
            }
            System.out.println("Total Salary for the year: " + totalSalary);
            System.out.println("Average Salary for the year: " + avgSalary);
            System.out.println("Bonus for the year: " + bonus[i]);
        }
        System.out.println("Thank you for using the Employee Salary Management System.");
    }

    private static int valNumOfEmp(Scanner sc) {
        int numOfEmp;
        while (true){
        System.out.println("Enter the no:of employees: ");
            isValid(sc); //to check whether it is a valid integer
            numOfEmp = sc.nextInt();
        if(numOfEmp >=1 && numOfEmp <= 100){
        break;
        }
        else{
            System.out.println("Enter a valid integer between 1 and 100: ");
        }
        sc.nextLine();
        }
        return numOfEmp;
    }

    private static void isValid(Scanner sc) {
        while(!sc.hasNextInt()){
            System.out.println("Enter a valid integer: ");
            sc.next();
        }
    }


}
