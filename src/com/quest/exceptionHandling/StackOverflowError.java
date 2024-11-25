package com.quest.exceptionHandling;

public class StackOverflowError {
    public static void main(String[] args) {
        try {
            causeStackOverflow();
        }
        catch (java.lang.StackOverflowError e) {
            System.out.println("Stack Overflow");
            e.printStackTrace();
        }

    }

    public static void causeStackOverflow() {
        causeStackOverflow();
    }
}
