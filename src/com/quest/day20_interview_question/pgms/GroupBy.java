package com.quest.day20_interview_question.pgms;

import java.util.*;

public class GroupBy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the number of elements in the list");
        int n = scanner.nextInt();
        System.out.println("Enter the number of elements in the list");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println("Grouped by frequency: " + groupByFrequency(list));
    }

    public static Map<Integer, List<Integer>> groupByFrequency(List<Integer> list) {
        //calculate frequencies
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : list) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        //Grouping the numbers by frequency
        Map<Integer, List<Integer>> groupedByFrequency = new HashMap<>();
        //checks if the groupedByFrequency map contains a key freq.
        //If the key is not present, it creates a new ArrayList using the lambda expression
        frequency.forEach((num, freq) ->
                groupedByFrequency.computeIfAbsent(freq, k -> new ArrayList<>()).add(num));
        return groupedByFrequency;


    }
}
