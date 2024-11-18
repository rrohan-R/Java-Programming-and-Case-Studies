package com.quest.oops.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Student s=new Student("john",18,"PHGHS");
        s.nameDisplay();
        s.study();
        Employee e=new Employee("Mike",107,35000);
        e.getEmpName();
        e.getSalary();
        StudyIn2 study=new StudyIn2("nana",88);
        study.method1();
        study.method2();
        study.meth();
    }
}
