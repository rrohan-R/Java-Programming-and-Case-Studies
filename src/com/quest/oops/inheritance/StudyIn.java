package com.quest.oops.inheritance;

public class StudyIn {
    String name;
    int age;
    int height;
    public StudyIn(String name, int age) {
        this.name = name;
        this.age = age;
    }

public void method1(){
    System.out.println("Hello "+name);
}
public void method2(){
    System.out.println("Age "+age);
    System.out.println("Height "+height);
}
}

