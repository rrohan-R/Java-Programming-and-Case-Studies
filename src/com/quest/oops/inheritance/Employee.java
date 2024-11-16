package com.quest.oops.inheritance;

public class Employee extends Employment {
    private int salary;
    public Employee(String empName, int age, int salary) {
        super(empName, age);
        this.salary = salary;
    }
    public void getSalary() {
        System.out.println("Salary is : " + salary);
    }

    @Override
    public void getEmpName() {
        super.getEmpName();
    }
}
