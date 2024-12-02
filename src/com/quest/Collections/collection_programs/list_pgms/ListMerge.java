package com.quest.Collections.collection_programs.list_pgms;

import java.util.ArrayList;
import java.util.List;

public class ListMerge {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list2.add("D");
        list2.add("A");
        list2.add("B");
        list2.add("E");

        list1.addAll(list2);
        System.out.println(list1);
        System.out.println("After Removing duplicates: "+list1.stream().distinct().toList());
    }
}
