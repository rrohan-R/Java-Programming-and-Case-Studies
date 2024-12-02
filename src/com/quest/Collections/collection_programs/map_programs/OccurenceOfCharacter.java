package com.quest.Collections.collection_programs.map_programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacter {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        String str="Hello World";
        str=str.toLowerCase().replaceAll(" ","");
        String[] strArray = str.split("");
        for (String c:strArray){
            map.put(c.charAt(0), map.getOrDefault(c.charAt(0),0)+1);
        }
        System.out.println("The frequency of each character is: ");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
