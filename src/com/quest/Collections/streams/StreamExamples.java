package com.quest.Collections.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(2);
        list.add(4);
        list.add(5);
//        list.forEach(System.out::println);
//        System.out.println(list.stream().findFirst().get());
//        System.out.println(list.stream().max(Integer::compareTo).get());
//        System.out.println(list.stream().count());
//        System.out.println(list.stream().distinct().count());
//        System.out.println(list.stream().reduce(0, Integer::sum));
//        System.out.println(list.stream().reduce(2, Integer::sum));
        System.out.println(list.stream().map(i -> i*2).toList());
        List<Integer> list1=list.stream().sorted().toList();
        System.out.println(list1);
        List<Integer> list2=list.stream().filter(i -> i % 2 == 0).toList();
        System.out.println(list2);
        int i=list.stream().map(c -> c*2).min(Integer::compareTo).get();
        System.out.println(i);

//        ArrayList<Integer> list2 = list.stream()
    }
}
