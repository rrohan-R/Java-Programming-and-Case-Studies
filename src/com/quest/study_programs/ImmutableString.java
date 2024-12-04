package com.quest.study_programs;

public class ImmutableString {
    public static void main(String[] args) {
        String a = "I am";
        String b = a;
        a=a+" Java";
        System.out.println(a);
        System.out.println(b);
    }
}
