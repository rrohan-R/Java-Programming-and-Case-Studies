package com.quest.Collections.lists;

import java.util.LinkedList;

public class LinkedListsClass {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.addFirst("e");
        list.add(5, "f");
//        System.out.println(list.removeFirst());
        /*list.clear();
        for (String s : list) {
            System.out.println(s);
        }*/
//        System.out.println(list.getFirst()+" "+list.getLast()+" "+list.get(4));
        LinkedList<String> list2 = new LinkedList<>();
        System.out.println(list2.isEmpty());
        System.out.println(list2.size());
        System.out.println(list.contains("a"));

    }
}
