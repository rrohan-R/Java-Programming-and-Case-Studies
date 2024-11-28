package com.quest.Collections.arraylistassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListOfStudent {
    public static void main(String[] args) {
        ArrayList<Student>arrayList=new ArrayList<Student>();
        arrayList.add(new Student("Rick",20,1));
        arrayList.add(new Student("Joy",18,2));
        arrayList.add(new Student("Mick",22,3));
        arrayList.add(new Student("Rock",24,4));
        Iterator<Student> iterator=arrayList.iterator();
        while(iterator.hasNext()){
            Student student=iterator.next();
            System.out.println(student.getName()+" : "+student.getAge());
        }
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0).getName());
        arrayList.add(1,new Student("Bhavana",22,5));
        System.out.println(arrayList.get(1).getName());
        arrayList.remove(0);
        System.out.println(arrayList.get(0).getName());
        System.out.println(arrayList.contains(new Student("Bhavana",22,5)));
        arrayList.clear();
        System.out.println(arrayList.isEmpty());
        System.out.println(Arrays.toString(arrayList.toArray()));
//        System.out.println(arrayList.stream().count());
//        System.out.println(arrayList.stream().filter(x -> x.getName().equals("Bhavana")).count());
        
    }


}
