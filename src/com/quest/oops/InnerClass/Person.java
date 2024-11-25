package com.quest.oops.InnerClass;

public class Person {
    public String name = "RON";

    public class Human{
//        name="sss"
        void display(){
            System.out.println(name);
        }
    }

    public void displayInner(){
        Human human = new Human();
        human.display();
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.displayInner();

    }

}