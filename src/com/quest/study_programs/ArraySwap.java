package com.quest.study_programs;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr={1,3,7,4,6};
        int s1=0;
        int s2=4;
        System.out.println("Before swap: "+ Arrays.toString(arr));
        System.out.println("After swap: "+ Arrays.toString(swap(arr,s1,s2)));

    }
    public static int[] swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }
}
