package com.quest.oops.Abstraction;

public class RegularStudent extends Student {
    @Override
    public void attendClass() {
        System.out.println("Regular student is attending Classes both online and offline");
    }

    @Override
    public void submitAssignment() {
        System.out.println("Regular student is submitted assignment");
    }


}
