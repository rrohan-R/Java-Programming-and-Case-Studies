package com.quest.Collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        LinkedHashMap<String,Boolean> lm = new LinkedHashMap<>();
        TreeMap<String,String> tm = new TreeMap<>();
        hm.put("Harry","Potter");
        hm.put("Ron","Weasley");
        hm.put("Hermione","Granger");
        hm.forEach((k,v)-> System.out.println(k+" : "+v));
        System.out.println("---------------");
        lm.put("B",true);
        lm.put("A",false);
        lm.put("E",true);
        lm.put("D",true);
        lm.forEach((k,v)-> System.out.println(k+" : "+v));
        System.out.println("---------------");
        tm.put("Harry","Potter");
        tm.put("Ron","Weasley");
        tm.put("Hermione","Granger");
        tm.forEach((k,v)-> System.out.println(k+" : "+v));
    }
}
