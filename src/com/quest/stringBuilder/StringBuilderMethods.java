package com.quest.stringBuilder;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder s2=new StringBuilder("Hello");
        s2.append("world");
        String s3="hello";
        System.out.println(s2.delete(1,4));
        System.out.println(s2.replace(5,6,""));
        System.out.println(s2.replace(3,4,"a"));
        System.out.println(s2.insert(0,"Hello "));
        System.out.println(s2.charAt(2));
        System.out.println(s2.reverse());
    }
}
