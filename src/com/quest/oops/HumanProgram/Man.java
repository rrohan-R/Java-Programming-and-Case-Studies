package com.quest.oops.HumanProgram;

public class Man extends Human implements Women {

    int age;
    public Man(int age) {
        super();
        this.age = age;
        System.out.println("Man age: " + age);

    }

    public Man() {
    }

    @Override
    public void women() {
        System.out.println("Man and Women");
    }

    @Override
    public void sciName() {
        System.out.println("Man is a homo-sapien");
    }
}
