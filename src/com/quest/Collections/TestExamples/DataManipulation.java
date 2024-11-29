package com.quest.Collections.TestExamples;

import java.util.*;

public class DataManipulation {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        LinkedHashSet<Student> lhs=new LinkedHashSet<Student>();
        HashMap<Integer,Student> hm=new HashMap<Integer,Student>();
        PriorityQueue<Student> pq=new PriorityQueue<Student>();
        //adding elts to arraylist
        al.add(new Student("Mike",60));
        al.add(new Student("John",30));
        al.add(new Student("Jack",40));
        // adding elts to linkedhashset
        lhs.add(new Student("Mike",60));
        lhs.add(new Student("John",30));
        lhs.add(new Student("Jack",40));
        //adding elts to hashmap
        hm.put(1,new Student("Mike",60));
        hm.put(2,new Student("John",30));
        hm.put(3,new Student("Jack",40));
        //adding elts to priorityQueue
        pq.add(new Student("Mike",60));
        pq.add(new Student("John",30));
        pq.add(new Student("Jack",40));

        System.out.println("ArrayList Elements:");

        for (Student s:al){
            System.out.println(s.getName());
        }
        System.out.println();
        System.out.println("LinkedHashSet Elements:");
        for (Student s:lhs){
            System.out.println(s.getName());
        }
        System.out.println();
        System.out.println("HAshMap Elements:");
        for (Map.Entry<Integer,Student> e:hm.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue().getName()+"-"+e.getValue().getAge());
        }
        System.out.println();

//        Comparator<Student> cmp=Comparator.comparing(Student::getName);
//        PriorityQueue<Student> pq2 =new PriorityQueue<Student>(cmp);
        System.out.println("PriorityQueue Elements:");
        while (!pq.isEmpty()){
            System.out.println(pq.poll().getName());
        }
    }
}

