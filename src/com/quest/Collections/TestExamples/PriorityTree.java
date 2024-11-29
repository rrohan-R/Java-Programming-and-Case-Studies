package com.quest.Collections.TestExamples;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityTree {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        TreeSet<Integer> ts1 = new TreeSet<>();
        pq1.add(40);
        pq1.add(62);
        pq1.add(33);
        pq1.add(124);
        pq1.add(58);
//        pq1.add(null);

        ts1.add(40);
        ts1.add(62);
        ts1.add(33);
        ts1.add(124);
        ts1.add(58);
        //ts1.add(null);

        pq1.forEach(System.out::println);
        System.out.println();
        ts1.forEach(System.out::println);
    }
}
