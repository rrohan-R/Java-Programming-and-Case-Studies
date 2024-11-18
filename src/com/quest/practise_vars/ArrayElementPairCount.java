package com.quest.practise_vars;

public class ArrayElementPairCount {
    public static void main(String[] args) {
        int[] array = {10, 20, 10, 10, 30, 20, 50, 40, 40, 30, 30, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                int count = 1;
                for (int j = i + 1; j <= array.length - 1; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        array[j] = 0;
                    }
                }
                int pair = count / 2;
                if (pair > 0) {
                    System.out.println(array[i] + " : " + pair);
                }
            }
        }
    }
}
