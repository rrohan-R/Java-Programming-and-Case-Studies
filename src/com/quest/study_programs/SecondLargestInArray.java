package com.quest.study_programs;

import java.util.Arrays;

public class SecondLargestInArray {
    public static void main(String[] args) {

        //find the 2nd largest in the array
        int[]arr={71,22,83,66,43,10};
        Arrays.sort(arr);
        System.out.println("The 2nd largest element is: "+arr[arr.length-2]);
    }
}
