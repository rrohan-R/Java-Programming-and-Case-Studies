package com.quest.study_programs.muliple_inheritance;

public interface Animal {
    void sleep();
    default void sound() {
        System.out.println("Animal makes sound");
    }

}
