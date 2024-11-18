package com.quest.practise_vars;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println(s.charAt(0));
        System.out.println(s.length());
        System.out.println(s.isEmpty());
        System.out.println(s.replace("s","mo"));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.toCharArray());
        System.out.println(s.strip());
        System.out.println(s.contains("r"));
        System.out.println(s.contains("e"));
        System.out.println("Enter the 2nd string: ");
        String s2 = sc.nextLine();
        System.out.println(s2.equals(s));
        System.out.println(s2.equalsIgnoreCase(s));

    }
}
