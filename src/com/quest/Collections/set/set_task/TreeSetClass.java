package com.quest.Collections.set.set_task;

import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(4);
        ts.add(2);
        ts.add(1);
        ts.add(3);
        for (int i : ts) {
            System.out.println(i);
        }
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.headSet(4));
        System.out.println(ts.tailSet(2));
        System.out.println(ts.subSet(1,4));
    }
}
