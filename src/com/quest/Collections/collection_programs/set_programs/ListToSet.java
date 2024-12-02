package com.quest.Collections.collection_programs.set_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("A");
        System.out.println("List: " + list);
        Set<String> set=new HashSet<String>(list);
        System.out.println("Set containing unique elts of the list: " + set);
    }
}
