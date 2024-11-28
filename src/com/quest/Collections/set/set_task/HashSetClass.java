package com.quest.Collections.set.set_task;

import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(2);
        set.add(1);
        set.add(3);
//        set.add(null);
        for (int i : set) {
            System.out.println("From set: "+i);
        }
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(null);
//        for (int i : list) {
//            System.out.println("From list: "+i);
//        }
        System.out.println(set.remove(2));
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains(4));

    }
}
