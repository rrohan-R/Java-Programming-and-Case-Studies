package com.quest.day20_interview_question.pgms;

import java.util.*;

public class PartitionPgm {
    public static List<List<Integer>> listPartition(List<Integer> list, int k) {
        //creating a list result containing another list
        List<List<Integer>> result = new ArrayList<>();

        //Iterating through the list based on the partition size
        for (int i = 0; i < list.size(); i += k) {
            int end = Math.min(i + k, list.size());
            //appending elements to the result list by converting the inputted list into sublists
            result.add(list.subList(i, end));
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the list: ");
        for (int i = 0; i < size; i++) {
            input.add(sc.nextInt());
        }
        System.out.println("Enter the size of partition: ");
        int k = sc.nextInt();
        // displaying the result
        System.out.println(listPartition(input, k));
    }
}
