package com.quest.study_programs.muliple_inheritance;

public class Lion implements Animal,Carnivore {

    @Override
    public void sound() {
        System.out.println("Lion roars");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps");
    }

    @Override
    public void eats() {
        System.out.println("Lion eats meat");
    }
}
