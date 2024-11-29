package com.quest.Collections.TestExamples;

import java.util.TreeSet;

public class SortingCustomObj {
    public static void main(String[] args) {
        TreeSet<Cars> cars = new TreeSet<Cars>();
        cars.add(new Cars("Porche","Red",2000000,2000));
        cars.add(new Cars("Maruti","White",150000,2010));
        cars.add(new Cars("Mustang","Black",3000000,2020));

       cars.forEach(System.out::println);
    }
}
