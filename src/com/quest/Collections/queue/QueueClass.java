package com.quest.Collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Spliterator;
import java.util.Stack;

public class QueueClass {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        //FIFO
        pq.add(2);
        pq.add(4);
        pq.add(3);
        pq.add(1);
        Iterator<Integer> it = pq.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//        for (int i:pq){
//            System.out.println(i);
//        }
        pq2.add(1);
        pq2.add(2);
        pq2.add(3);
        pq2.add(4);
        pq2.add(5);
        pq2.add(6);
//        pq2.add(null);
//        Iterator<Integer> it2 = pq2.iterator();
//        while (it2.hasNext()) {
//            System.out.println(it2.next());
//        }
//        System.out.println(pq2.peek());
        pq2.poll();//del 1st elt

        System.out.println(pq2.peek());
        System.out.println(pq2.remove(2));
        pq2.forEach(System.out::println);
        Spliterator<Integer> spliterator = pq.spliterator();
        while (spliterator.tryAdvance(System.out::println));
//        Stack<Integer> s1 = new Stack<>();
//        //LIFO
//        s1.push(1);
//        s1.push(2);
//        s1.push(3);
//        System.out.println(s1.peek());
    }
}
