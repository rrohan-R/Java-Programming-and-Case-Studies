package com.quest.practise_vars;

public class ArraySort {
    public static void main(String[] args) {
        int[] num = {5, 2, 9, 1, 5, 6};

        int[] sortedArray = sortArray(num);

        System.out.println("Sorted array:");
        for(int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }


    public static int[] sortArray(int[] arr) {

        for (int i = 0; i < arr.length ; i++) {
            for (int j =i+1; j < arr.length ; j++) {
                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}