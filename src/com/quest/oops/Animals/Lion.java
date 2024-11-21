package com.quest.oops.Animals;

public class Lion extends Animal {
    @Override
    public void sound() {
        System.out.println("Lion Roars");
    }

    @Override
    public void sleep() {
        System.out.println("Lion Sleeps- Zzzz");
    }
}
