package com.quest.oops.inheritance;

public class StudyIn2 extends StudyIn {
    public StudyIn2(String name,int age) {
        super(name, age);

    }

    @Override
    public void method1() {
        super.method1();
    }

    public void meth(){
        System.out.println("YeeHaa "+name+" has "+height+" height");
    }
}
