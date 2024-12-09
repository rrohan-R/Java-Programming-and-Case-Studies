package com.quest.Collections.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Program1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(78);
        list.add(78);
        list.add(13);
        list.add(15);
        list.add(9);
        Stream<Integer> stream = list.stream();
        System.out.println(stream.distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
    }
}
