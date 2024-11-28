package com.quest.Collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "one");
        hm.put(3, "two");
        hm.put(2, "three");
        hm.put(4, "four");
        hm.put(5, "five");
        for (int i: hm.keySet()) {
            System.out.println(i);
        }
        for (String s : hm.values()) {
            System.out.println(s);
        }
        hm.put(6,"Six");
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println(hm.get(4));
        System.out.println(hm.remove(2));
        hm.clear();
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
    }
}
