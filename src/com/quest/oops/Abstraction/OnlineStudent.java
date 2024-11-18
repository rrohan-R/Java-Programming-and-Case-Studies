package com.quest.oops.Abstraction;

public class OnlineStudent extends Student {

    //    public OnlineStudent() {
//
//    }
    @Override
    public void submitAssignment() {
        System.out.println("Online Student Submitted assignment");

    }

    @Override
    public void attendClass() {
        System.out.println("Online Student Attended Class");

    }
    public void study(){
        super.study();
    }


}


