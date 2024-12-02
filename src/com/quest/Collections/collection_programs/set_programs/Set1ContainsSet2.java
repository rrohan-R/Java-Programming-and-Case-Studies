package com.quest.Collections.collection_programs.set_programs;

import java.util.HashSet;
import java.util.Set;

public class Set1ContainsSet2 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(1);
        set2.add(2);
        set2.add(3);

        System.out.println("Set1: "+set1);
        System.out.println("Set2: "+set2);
        System.out.println("If Set1 has all elmts of Set2? : "+set1.containsAll(set2));
    }
}
