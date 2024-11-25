package com.quest.exceptionHandlingDailyTask;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary)throws InvalidInputException {
        validateAge(age);

        validateSalary(salary);
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    private static void validateSalary(double salary) throws InvalidInputException {
        if (salary < 0) {
            throw new InvalidInputException("Salary cannot be negative.");
        }
    }

    private static void validateAge(int age) throws InvalidInputException {
        if (age < 18) {
            throw new InvalidInputException("Age must be at least 18.");
        }
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

    public void setAge(int age) throws InvalidInputException {
        validateAge(age);
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws InvalidInputException {
        validateSalary(salary);
        this.salary = salary;
    }


    public final void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
