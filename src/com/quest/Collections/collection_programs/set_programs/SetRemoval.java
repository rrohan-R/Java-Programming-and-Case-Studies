package com.quest.Collections.collection_programs.set_programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRemoval {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        System.out.println("Initial set: "+set);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next()%3 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Set after removing elts that are divisible by 3 :"+set);
    }
}
