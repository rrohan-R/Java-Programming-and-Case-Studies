package com.quest.Collections.collection_programs.map_programs;

import java.util.HashMap;
import java.util.Map;

public class MapSort {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Cat", 1);
        map.put("Dog", 2);
        map.put("Apple", 3);
        map.put("Tail", 4);
        map.put("Red", 5);
        map.put("Grass", 6);
        System.out.println("Initial map: " + map);
        System.out.println("Sorted Map: "+map.entrySet().stream().sorted(Map.Entry.comparingByKey()).toList());
    }
}
