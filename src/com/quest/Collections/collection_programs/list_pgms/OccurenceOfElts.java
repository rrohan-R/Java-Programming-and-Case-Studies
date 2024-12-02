package com.quest.Collections.collection_programs.list_pgms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccurenceOfElts {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(7);
        for (int i: list) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        map.forEach((k, v) -> System.out.println("Element "+k + " has " + v+" Occurence"));
    }
}
