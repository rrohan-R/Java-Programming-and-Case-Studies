package com.quest.practise_vars;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReplacing {
    public static void main(String[] args) {

//write a program to replace the current element with sum of the other elements without creating the new array.
        int[] arr = {2,4,5,7,8};
        int sum = 0;
        for (int i:arr) {
            sum += i;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sum - arr[i];

        }
        System.out.println(Arrays.toString(arr));

        }
}

