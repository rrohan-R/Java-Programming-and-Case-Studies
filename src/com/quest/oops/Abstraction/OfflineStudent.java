package com.quest.oops.Abstraction;

public class OfflineStudent extends Student {

    @Override
    public void submitAssignment() {
        System.out.println("Offline student submitted assignment");
    }

    @Override
    public void attendClass() {
        System.out.println("Offline student attended class");

    }
}

