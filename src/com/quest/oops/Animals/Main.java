package com.quest.oops.Animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0]= new Sheep();
        animals[1]=new Lion();

        for (Animal animal : animals) {
            animal.sleep();
            animal.sound();
        }
    }
}
