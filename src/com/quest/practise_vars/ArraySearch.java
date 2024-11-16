package com.quest.practise_vars;

public class ArraySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 4, 5};
        int value = 5;

        int result = search(numbers, value);

        if (result == -1) {
            System.out.println("Value not found.");

        } else {
            System.out.println("Value found at index: " + result);
        }
    }
    public static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
