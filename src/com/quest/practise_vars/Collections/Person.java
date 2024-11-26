package com.quest.practise_vars.Collections;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String phone;



    public Person(String name, int age, String gender, String phone) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
