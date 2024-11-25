package com.quest.exceptionHandling;

public class CustomException {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println("Hello World " + s.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
}
//        exceptionHandling();
//
//
//    }
//
//    public static void exceptionHandling() throws NullPointerException {
//        String s = null;
//        if (s == null) {
//            throw new NullPointerException();
//        }
//        else {
//            System.out.println(s);
//        }
//
//    }
