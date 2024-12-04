package com.quest.study_programs;

import java.util.Arrays;

public class ArrayCheck {
    public static void main(String[] args) {

        //write a program to check if 2 arrays has same elements or not
        int[] ara1 = {3, 4, 1, 2, 5};
        int[] ara2 = {5, 3, 2, 4, 1};

        if (ara1.length != ara2.length) {
            System.out.println("Array lengths do not match");
        }
        Arrays.sort(ara1);
        Arrays.sort(ara2);
        if (Arrays.equals(ara1, ara2)){
            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays are not equal");
        }
    }
}
