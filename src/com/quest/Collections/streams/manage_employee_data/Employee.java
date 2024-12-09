package com.quest.Collections.streams.manage_employee_data;

public class Employee {
    String id;
    String name;
    int age;
    String department;
    double salary;
    int yearsOfExperience;

    public Employee(String id, String name, int age, String department, double salary, int yearsOfExperience) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "[id=" + id + ", name=" + name + ", age=" + age + ", department=" + department+ ", salary=" + salary + ", yearsOfExperience=" + yearsOfExperience + "]";
    }
}
