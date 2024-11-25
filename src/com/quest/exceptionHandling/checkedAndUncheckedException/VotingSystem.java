package com.quest.exceptionHandling.checkedAndUncheckedException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        int age = 0;
        try {
            System.out.println("Enter the name of the person to vote: ");
            if (sc.hasNextInt()){
                throw new InputMismatchException("Expected a String as the name but inputted an integer");
            }
            name = sc.next();
            System.out.println("Enter the age of the person to vote: ");
            if (sc.nextInt() < 18) {
                throw new ArithmeticException("Age less than 18 can't be able to vote");
            }
            age = sc.nextInt();
            System.out.println("Enter the citizenship of the person to vote: ");
            if (sc.next()=="Indian") {}
            else {
                throw new IllegalArgumentException("The person is not an Indian citizen.");
            }
            Vote vote = new Vote(name, age);
            vote.setName(name);
            vote.setAge(age);
        }
        catch (InputMismatchException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("You have voted ");
        }

    }
}
