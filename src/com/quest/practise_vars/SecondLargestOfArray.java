package com.quest.practise_vars;

import java.util.Arrays;

public class SecondLargestOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 32, 4, 2};
        Arrays.sort(arr);
        int max = 0;
        for (int i:arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
