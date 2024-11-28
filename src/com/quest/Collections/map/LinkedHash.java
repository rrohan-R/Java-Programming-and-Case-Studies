package com.quest.Collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(2, "A");
        map.put(1, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        for (int i: map.keySet()) {
            System.out.println(i);
        }
        for (String s: map.values()) {
            System.out.println(s);
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        map.forEach((k, v) -> System.out.println(k+" : "+v));
        System.out.println(map.get(4));
        System.out.println(map.remove(2));
        System.out.println(map.containsValue("EF"));
        map.clear();
        System.out.println(map.size());
        System.out.println(map.isEmpty());
    }
}
