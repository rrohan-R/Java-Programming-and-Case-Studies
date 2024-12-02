package com.quest.Collections.collection_programs.map_programs;

import java.util.HashMap;
import java.util.Map;

public class MapOfProducts {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("Apple", 62.0);
        map.put("Banana", 20.5);
        map.put("Orange", 50.4);
        map.put("Grapes", 90.6);
        map.put("Pineapple", 35.5);
        System.out.println("Products: "+map);
        System.out.println("Products with pricing order from low to high: "+map.entrySet().stream().sorted(Map.Entry.comparingByValue()).toList());
        System.out.println("Product with the highest price: "+map.entrySet().stream().sorted(Map.Entry.comparingByValue()).toList().get(map.size()-1));

    }
}
