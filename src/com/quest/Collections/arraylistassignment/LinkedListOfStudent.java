package com.quest.Collections.arraylistassignment;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOfStudent {
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<>();
        list.add(new Student("Rolex",30,1));
        list.add(new Student("Marv",23,2));
        list.add(new Student("Mike",32,3));
        list.add(new Student("Harry",22,4));

        list.add(1,new Student("Jack",22,5));
        Iterator<Student> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Student student = iterator.next();
//            System.out.println(student.getName());
//        }
        System.out.println(list.removeFirst().getName());
        System.out.println(list.removeLast().getName());
        System.out.println(list.remove(2).getName());
        System.out.println(list.getFirst().getName());
        System.out.println(list.getLast().getName());
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.contains(new Student("Harry",22,5)));

    }
}
