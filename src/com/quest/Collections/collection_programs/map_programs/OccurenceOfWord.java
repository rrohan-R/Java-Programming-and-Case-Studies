package com.quest.Collections.collection_programs.map_programs;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfWord {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String str = "Java is fun and java is powerful";
        str = str.toLowerCase();
        String[] strs = str.split(" ");
        System.out.println("The frequency of each words is: ");
        for (String word : strs) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
