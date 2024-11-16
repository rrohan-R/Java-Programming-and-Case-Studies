package com.quest.oops.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Student s=new Student("john",18,"PHGHS");
        s.nameDisplay();
        s.study();
        Employee e=new Employee("Mike",107,35000);
        e.getEmpName();
        e.getSalary();
    }
}
