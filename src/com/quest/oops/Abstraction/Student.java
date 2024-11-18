package com.quest.oops.Abstraction;

public abstract class Student {
    public abstract void attendClass();
    public abstract void submitAssignment();
    public void study(){
        System.out.println("Student is studying");
    }

}

//Here in this abstract class example, the method study is not abstract -> So in the classes that extends this abstract class
//can override the same method using super or the method implementation can be changed as needed.