package com.quest.oops.Interfaces;

public class Vehicle extends AbstractA implements Car1,Car2 {
    @Override
    public void horn() {
        System.out.println("Ringing");
    }

    @Override
    public void wheels() {
        System.out.println("Wheels");

    }

    @Override
    public void speed() {
        System.out.println("Speed");

    }

    @Override
    public void engine() {
        System.out.println("Engine");

    }

    @Override
    public void model() {
        System.out.println("G-Wagon");
    }
}
