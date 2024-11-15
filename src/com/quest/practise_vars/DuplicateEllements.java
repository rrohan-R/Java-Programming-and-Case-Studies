package com.quest.practise_vars;

public class DuplicateEllements {
    public static void main(String[] args) {

        //write a program to find the duplicate of elements present in the array.
        int[] array = {1,2,2,3,5,5,1};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("duplicate element is" + array[j]+" at index " + i);
                    break;

                }
            }
        }
    }

}
