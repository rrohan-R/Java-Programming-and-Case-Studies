package com.quest.Collections.collection_programs.list_pgms;

import java.util.ArrayList;
import java.util.List;

public class ListReveresal {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original list: "+list);
        for (int i = list.size(); i>0; i--) {
            System.out.println(list.get(i-1)+" ");
        }
    }
}
