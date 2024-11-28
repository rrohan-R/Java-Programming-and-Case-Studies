package com.quest.Collections.set.set_task;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {
    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add(null);
        for (String s : hs) {
            System.out.println(s);
        }
        System.out.println(hs.contains("A"));
        System.out.println(hs.add("E"));
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());


    }
}
