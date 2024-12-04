package com.quest.study_programs.muliple_inheritance;

public interface Carnivore {
    void eats();
    default void sound(){
        System.out.println("Carnivore makes sound");
    }
}
