package com.quest.stringBuilder;

//Create string,stringbuilder, stringbuffer , 1.check equality by using ==, equals method,
//2. stringbuffer and stringbuilder objects try to utilize all predefined methods .

public class StringBuilderAndBuffer {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hello");
        StringBuilder s2 = new StringBuilder("World");
        StringBuffer s3 = new StringBuffer("Hi");
        StringBuffer s4 = new StringBuffer("World");

        checkBuilder(s1,s2);
        checkBuffer(s3,s4);
        builderMethods(s1,s2);
        bufferMethods(s3,s4);
    }

    public static void checkBuilder(StringBuilder s1, StringBuilder s2) {
        if (s1==s2){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        if (s1.equals(s2)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

    public static void checkBuffer(StringBuffer s1, StringBuffer s2) {
        if (s1==s2){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        if (s1.equals(s2)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

    public static void builderMethods(StringBuilder s1, StringBuilder s2) {
        s1.append(s2);
        System.out.println(s1);
        System.out.println(s1.reverse());
        System.out.println(s2.reverse());
        System.out.println(s1.charAt(2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.delete(0,2));
    }

    public static void bufferMethods(StringBuffer s1, StringBuffer s2) {
        s1.append(s2);
        System.out.println(s1);
        System.out.println(s1.reverse());
        System.out.println(s2.reverse());
        System.out.println(s1.charAt(2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.delete(0,2));
    }

}
