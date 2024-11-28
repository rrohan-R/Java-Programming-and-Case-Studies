package com.quest.Collections.map;

import java.util.TreeMap;

public class Tree {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("Mad", "Max");
        map.put("Spider", "Man");
        map.put("LordOf", "TheRings");
        map.put("Bat", "Man");
        map.put("Blade", "Runner");
        System.out.println(map.replace("Blade","Runner","Trinity"));
        map.forEach((k,v) -> System.out.println(k + ": " + v));

        TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.put(1,"Thriller");
        map2.put(2,"Horror");
        map2.put(5,"Romance");
        map2.put(4,"Comedy");
        map2.put(3,"Heist");
        map2.remove(5);
        map2.forEach((k,v) -> System.out.println(k + ": " + v));
    }
}
