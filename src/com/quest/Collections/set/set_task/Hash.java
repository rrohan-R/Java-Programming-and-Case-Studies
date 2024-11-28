package com.quest.Collections.set.set_task;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        HashSet<Integer> hs3 = new HashSet<>();
        System.out.println("Inputting 100 elements of the hashset: ");
        for (int i = 0; i < 100; i++) {
            hs.add(i);
        }
        System.out.println("Hashset: "+hs);
        System.out.println("Inputting 10 random elements to the hashset: ");
        int[] randomArray = {2,44,33,6,78,29,0,23};
        for(int i: randomArray) {
            hs2.add(i);
        }
        System.out.println("Hashset random"+hs2);
        System.out.println("Inputting some null values to the hashset: ");
        hs3.add(null);
        hs3.add(null);
        hs3.add(null);
        hs3.add(33);
        hs3.add(78);
        System.out.println("Hashset null: "+hs3);
    }
}
