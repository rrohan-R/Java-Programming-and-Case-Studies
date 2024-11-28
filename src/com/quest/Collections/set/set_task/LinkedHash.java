package com.quest.Collections.set.set_task;

import java.util.LinkedHashSet;

public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>();
        LinkedHashSet<Integer> lhs3 = new LinkedHashSet<>();
        System.out.println("Inputting 100 elements of the Linkedhashset: ");
        for (int i = 0; i < 100; i++) {
            lhs1.add(i);
        }
        System.out.println("LinkedHashset: "+lhs1);
        System.out.println("Inputting 10 random elements to the Linkedhashset: ");
        int[] randomArray = {2,44,33,6,78,29,0,23};
        for(int i: randomArray) {
            lhs2.add(i);
        }
        System.out.println("LinkedHashset random"+lhs2);
        System.out.println("Inputting some null values to the Linkedhashset: ");
        lhs3.add(null);
        lhs3.add(null);
        lhs3.add(null);
        lhs3.add(33);
        lhs3.add(78);
        System.out.println("LinkedHashset null: "+lhs3);
    }
}
