package com.quest.Collections.set.set_task;

import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        TreeSet<Integer> ts1 = new TreeSet<>();
        TreeSet<Integer> ts2 = new TreeSet<>();
        TreeSet<Integer> ts3 = new TreeSet<>();
        System.out.println("Inputting 100 elements of the treeset: ");
        for (int i = 0; i < 100; i++) {
            ts1.add(i);
        }
        System.out.println("Treeset: "+ts1);
        System.out.println("Inputting 10 random elements to the treeset: ");
        int[] randomArray = {2,44,33,6,78,29,0,23};
        for(int i: randomArray) {
            ts2.add(i);
        }
        System.out.println("Treeset random"+ts2);
        System.out.println("Inputting some null values to the treeset: ");
        try {
            ts3.add(null);
            ts3.add(null);
            ts3.add(null);
            ts3.add(33);
            ts3.add(78);
            System.out.println("Treeset null: "+ts3);
        }
        catch(NullPointerException e) {
            System.out.println("Treeset cannot contain null values!");
        }

    }
}
