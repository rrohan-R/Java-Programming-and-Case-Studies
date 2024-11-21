package com.quest.oops.HumanProgram;

public class Human {
    int height;
    int weight;

    public Human(int height, int weight) {
        this.height = height;
        this.weight = weight;
        System.out.println(toString());
    }

    public String toString() {
        return "Human{" + "height=" + height + ", weight=" + weight + '}';
    }

    public Human(){
        System.out.println("Human Constructor");
    }

    public void sciName(){
        System.out.println("Human scientific name is Homo-Sapiens");

    }
}
