package com.quest.practise_vars;

public class PractiseVars {

    public static void main(String[] args) {
        final int VOTING_AGE=18;
        int age= 18;
        double salary= 2000.0;
        char gender= 'M';
        int id=2;
        String firstName="John";
        String lastName="Doe";
        System.out.println(age);
        System.out.println(salary);
        System.out.println(gender);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(firstName+" "+lastName+"-"+id);


        age=27;
        System.out.println(age);
        System.out.println(VOTING_AGE);
//        VOTING_AGE=20; It can't be changed , since VOTING_AGE is final
        practiseConversion();
        stringConcatenation();
        stringMethods();

    }

    private static void practiseConversion(){

        int a= 20;
        double b= 25.5;
        double sum=a+b;
        int round= (int)b;
        System.out.println("sum="+sum);
        System.out.println("round="+round);



    }

    private static void stringConcatenation(){
        String firstName="John";
        String lastName="Doe";
        String concat=firstName+" "+lastName;
        System.out.println(concat);
        int age= 18;
        System.out.println("name=" +concat+" age="+age);
    }

    private static void stringMethods(){
        String s1="John";
        String s2="JOHN";
        String s3= new String("Hello World");
        String s4= new String("Hello World");
        System.out.println(s3.length());
        System.out.println(s3.equalsIgnoreCase(s2));
        System.out.println(s3.equals(s2));
        System.out.println(s4==s1);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));




    }
}
