package com.quest.Collections.collection_programs.set_programs;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<>();
        Set<String> set3 = new HashSet<>();
        set1.add("B");
        set1.add("A");
        set1.add("C");
        set1.add("D");

        set2.add("F");
        set2.add("A");
        set2.add("D");
        set2.add("E");
        System.out.println("Set 1: "+set1);
        System.out.println("Set 2: "+set2);
        for (String s : set1) {
            if (set2.contains(s)) {
                set3.add(s);
            }
        }
        System.out.println("Intersection: "+set3);
        set1.addAll(set2);
        System.out.println("Union: "+set1);
        set1.removeAll(set2);
        System.out.println("Difference: "+set1);
    }
}
