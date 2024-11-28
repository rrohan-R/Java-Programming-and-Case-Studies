package com.quest.Collections.lists;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("Alan",20,"Male","1923456780"));
        list.add(new Person("Eva",22,"Female","91277456780"));
        list.add(new Person("Bob",19,"Male","9223466780"));
        list.add(new Person("Alice",24,"Female","9523406780"));
        list.add(4,new Person("Boby",25,"Male","92236536780"));
        for (Person p : list) {
            if (p.getAge()>19 && p.getGender()=="Male") {
                System.out.println("Name: "+p.getName()+"  Age: "+p.getAge()+"  Gender: "+p.getGender()+"  Phone: "+p.getPhone());
            }
        }
        System.out.println();
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()){
            Person p = iterator.next();
            if (p.getAge()>22){
                System.out.println("Name: "+p.getName()+"  Age: "+p.getAge()+"  Gender: "+p.getGender()+"  Phone: "+p.getPhone());
            }
        }
        System.out.println(list.isEmpty());

    }
}





//        String str=list.get(0).getName();
//        System.out.println(str);
//        list.remove(1);