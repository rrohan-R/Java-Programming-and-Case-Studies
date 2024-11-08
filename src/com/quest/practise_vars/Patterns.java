package com.quest.practise_vars;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for n : ");
        int n = sc.nextInt();
        int p,q;
        for ( p = 0; p < n; p++) {
            for ( q = 0; q < p; q++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
