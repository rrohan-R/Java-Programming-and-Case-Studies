package com.quest.oops.inheritance;

public class Employment {
    String empName;
    int empID;

    public Employment(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;

    }
    public void getEmpName() {
        System.out.println("The name of employee is: "+empName);
        System.out.println("The employee ID is: "+empID);
    }
}


