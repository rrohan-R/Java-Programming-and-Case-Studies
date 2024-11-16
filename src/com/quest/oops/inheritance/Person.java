package com.quest.oops.inheritance;

public class Person {
    String name;
    int age;
    String gender;
    String country;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void nameDisplay() {
        String msg = String.format("Person name is %s and age is %d", name, age);
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(msg);
    }


}
