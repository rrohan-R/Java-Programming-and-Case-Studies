package com.quest.consumer_predicate_supplier_pgms;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Student {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("John");
        list.add("Jenna");
        list.add("Parker");

        Consumer<String> stringConsumer1 = value -> {
            System.out.println(value.toUpperCase());
            System.out.println(value.length());
        };

        Predicate<String> stringPredicate = value -> {
            if (value.length() >= 5){
                stringConsumer1.accept(value);
            }
            return false;
        };


        list.forEach(stringConsumer1);
        System.out.println("---------------");
        for (String s : list) {
            stringPredicate.test(s);
        }

    }
}
