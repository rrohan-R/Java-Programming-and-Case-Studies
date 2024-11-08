package com.quest.practise_vars;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        n=sc.nextInt();
        if(n<0){
            System.out.println("Invalid Input");
            return;
        }
        int first=0;
        int second=1;
        System.out.println("fibonacci series of "+n+" times:");
        for(int i=1;i<=n;i++){
            System.out.println(first);
            int third=first+second;
            first=second;
            second=third;

        }
    }
}
