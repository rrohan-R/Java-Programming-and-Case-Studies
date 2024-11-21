package com.quest.stringBuilder;

public class StringB {
    public static void main(String[] args) {
        StringBuilder s1=new StringBuilder("hello");
        StringBuilder s2=new StringBuilder();

        s2.append("world");
        String s3="hello";
        System.out.println(s2.reverse());
        System.out.println(s2.delete(1,3));
        System.out.println(s2.insert(0,"hello"));
        System.out.println(s2.charAt(2));

        System.out.println(s3);

        check(s1,s2); //or check(s1.toString(),s2.toString())
    }
    public static void check(StringBuilder s1,StringBuilder s2){
        if(s1==s2){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        if(s1.equals(s2)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }

}
