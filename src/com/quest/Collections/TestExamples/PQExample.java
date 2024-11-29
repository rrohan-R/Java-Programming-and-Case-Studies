package com.quest.Collections.TestExamples;

import java.util.PriorityQueue;

public class PQExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Double> pq2 = new PriorityQueue<>();
        PriorityQueue<Boolean> pq3 = new PriorityQueue<>();
        PriorityQueue<Character> pq4 = new PriorityQueue<>();
        pq1.add(40);
        pq1.add(62);
        pq1.add(33);
        pq1.add(124);
        pq1.add(58);
        System.out.println("Integers");
        System.out.println(pq1);
        System.out.println(pq1.poll());
        System.out.println(pq1.peek());
        System.out.println();

        pq2.add(3.2);
        pq2.add(1.2);
        pq2.add(9.2);
        pq2.add(3.1);
        pq2.add(0.2);
        System.out.println("Doubles");
        System.out.println(pq2);
        System.out.println(pq2.poll());
        System.out.println(pq2.peek());
        System.out.println();

        pq3.add(true);
        pq3.add(false);
        System.out.println("Booleans");
        System.out.println(pq3);
        System.out.println(pq3.peek());
        System.out.println(pq3.poll());
        System.out.println();

        pq4.add('e');
        pq4.add('q');
        pq4.add('z');
        pq4.add('l');
        pq4.add('b');
        System.out.println("Characters");
        System.out.println(pq4);
        System.out.println(pq4.peek());
        System.out.println(pq4.poll());
        System.out.println();
    }
}
