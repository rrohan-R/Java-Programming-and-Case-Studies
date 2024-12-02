package com.quest.Collections.collection_programs.list_pgms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondLargestElmt {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list1=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(9);
        list.add(5);
        list.add(6);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        System.out.println("Second Largest Elmt = "+list.get(list.size()-2));
    }
}
