package com.quest.oops.Animals;

public class Sheep extends Animal{
    @Override
    public void sound() {
        System.out.println("BaaBaa");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping - Zzz");
    }


}
