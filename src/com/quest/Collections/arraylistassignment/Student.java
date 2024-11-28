package com.quest.Collections.arraylistassignment;

public class Student {
    private String name;
    private int age;
    private int rollNo;
    public Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

//    @Override
//    public String toString() {
//        return "Student [name=" + name + ", age=" + age + ", rollNo=" + rollNo + "]";
//    }
}
