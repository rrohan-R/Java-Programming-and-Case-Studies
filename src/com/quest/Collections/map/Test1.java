package com.quest.Collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        HashMap<String,String> hm2 = new HashMap<>();
        TreeMap<Integer, String> tm = new TreeMap<>();
        TreeMap<String, String> tm2 = new TreeMap<>();
        LinkedHashMap<Integer, String> lm = new LinkedHashMap<>();
        hm.put(1, "A");
        hm.put(2, "B");
        hm.put(4, "D");
        hm.put(5, "E");
        hm.put(3, "C");
        //--------------------
        tm.put(1, "A");
        tm.put(3, "C");
        tm.put(2, "B");
        tm.put(4, "D");
        tm.put(5, "E");
        hm.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println("-----------------");
        tm.forEach((k, v) -> System.out.println(k + ": " + v));
        //--------------------------------------------------------
        System.out.println("-------------");
        hm2.put("a", "A");
        hm2.put(null,"C");
        hm2.put("b","B");
        hm2.put("d","D");
        tm2.put("a", "A");
        tm2.put("d","D");
        tm2.put("b",null);
        tm2.put("c","C");
        hm2.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println("------------------");
        tm2.forEach((k, v) -> System.out.println(k + ": " + v));
        //-----------------------------------------------------------
        System.out.println("---------------");
        lm.put(1, "A");
        lm.put(2, "B");
        lm.put(4, "D");
        lm.put(null, null);
        lm.put(3, "C");
        lm.put(null, null);
        lm.put(5, null);
        lm.put(6, null);
        lm.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
