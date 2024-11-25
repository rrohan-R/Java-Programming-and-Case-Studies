package com.quest.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        try {
    exceptionHandling();

        } catch (ArithmeticException e) {
            System.out.println("Division by zero");

        } catch (InputMismatchException e) {
            System.out.println("Inputs are not of the same datatype");
        } catch (NullPointerException e) {
            System.out.println("Not a number");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index not valid");
        }

    }

    public static void exceptionHandling() throws ArithmeticException, InputMismatchException, NullPointerException, ArrayIndexOutOfBoundsException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        System.out.println(a / b);
        int[] arr = new int[3];
        System.out.println("Enter 3 numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(a/b);
        System.out.println(arr[arr.length + 1]);

    }

}
