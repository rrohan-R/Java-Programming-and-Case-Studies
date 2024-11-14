package com.quest.practise_vars;

import java.util.Scanner;

public class RepeatedCountInString {
    public static void main(String[] args) {

//        Write a program to display the characters vertically and display the repeated count of the character?
//        Ex: String s = "Your name"
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
//        for (int i = 0; i < s.length(); i++) {
//            System.out.print(s.charAt(i)+"\n");
//
//        }
        int charCount=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    charCount++;
                }
            }
            System.out.println(s.charAt(i)+" : "+charCount+"\n");

        }

    }
}
