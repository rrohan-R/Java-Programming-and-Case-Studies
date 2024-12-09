package com.quest.Collections.streams.manage_employee_data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee em1 = new Employee("e1", "Rick", 34, "Sales", 10000.0, 1);
        Employee em2 = new Employee("e2", "Morty", 20, "Accounts", 18000.0, 2);
        Employee em3 = new Employee("e3", "Eva", 23, "IT", 20000.0, 3);

        List<Employee> employees = List.of(em1, em2, em3);

        System.out.println("Sorted employees:");
        employees.stream()
                .sorted((i, j) -> Double.compare(j.getSalary(), i.getSalary())).forEach(System.out::println);

        System.out.println("\nFiltered employees:");
        employees.stream()
                .filter(i -> i.getSalary() > 10000.0)
                .forEach(System.out::println);

        System.out.println("\nEmployee with maximum salary:");
        System.out.println(employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary)).get());

        System.out.println("\nSkipped sorted records:");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)).skip(2).forEach(System.out::println);

        System.out.println("\nCustom Actions:");
        employees.forEach(e -> System.out.println("Employee ID: " + e.getId() + ", Employee Name: " + e.getName()));

        double tot_salary=employees.stream()
                .map(Employee::getSalary).reduce(0.0, Double::sum);
        System.out.println("\nTotal salary: " + tot_salary);
        System.out.println("\nAverage salary: " + tot_salary/employees.size());


    }
}
