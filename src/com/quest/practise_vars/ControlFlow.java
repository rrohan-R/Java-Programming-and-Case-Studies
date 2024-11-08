package com.quest.practise_vars;

public class ControlFlow {
    public static void main(String[] args) {
        int num = 10;
        if (num < 0) {
            System.out.println("Number is a negative number:" + num);
        } else if (num == 0) {
            System.out.println("Number is zero" + num);
        } else {
            System.out.println("Number is a positive number:" + num);
        }
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid day");
                break;

        }
        System.out.println("Day is " + day);
        testForLoop();
        testForDoWhile();
    }
    static void testForLoop(){
        for (int i = 1; i < 25; i++) {
            if(i%2!=0){
                continue;
            }
            System.out.println("Even Nums: "+i);
        }

    }
    static void testForWhile(){
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
    static void testForDoWhile(){
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i<6);

        do {
            System.out.println(i);
            i--;
        }
        while (i<6 && i>0);
    }

}
