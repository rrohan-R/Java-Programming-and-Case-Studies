package com.quest.oops.inheritance;

public class Student extends Person {
    private String schoolName;
    public Student(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;

    }
    public void study(){
        System.out.println("Student School Name is: "+this.schoolName);

    }

    @Override
    public void nameDisplay() {
        super.nameDisplay();

    }
}
