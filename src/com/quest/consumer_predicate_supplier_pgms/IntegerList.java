package com.quest.consumer_predicate_supplier_pgms;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class IntegerList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Predicate<Integer> predicate = i -> i % 2 == 0;



        Consumer<List<Integer>> consumer = lists ->{
            for (int i=0; i<lists.size(); i++) {
                lists.set(i, lists.get(i)*2);
            }
        };

        Supplier<List<Integer>> supplier = () -> {
            List<Integer> result = new ArrayList<>();
            for (int i : list) {
                if (predicate.test(i)) {
                    result.add(i);
                }
            }
            consumer.accept(result);
            return result;
        };

        System.out.println(supplier.get());
    }
}
