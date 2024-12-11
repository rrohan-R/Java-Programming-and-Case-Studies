package com.quest.study_programs.practise_pgm.EmployeeDataAnalysis;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeOperations {
    public static void main(String[] args) {
        List<Employee> employees = List.of(new Employee(1,"Rick","Science",43000),new Employee(2,"Morty","Fiction",55000),new Employee(3,"Jack","Technology",20000),new Employee(4,"Jill","Technology",20000));
        Map<String, List<String>> map = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));
        System.out.println("Grouped By Department \n"+map);
        List<String> salaryList= employees.stream()
                .filter(e -> e.getSalary()>50000)
                .map(Employee::getName).collect(Collectors.toList());
        System.out.println("Employees with salary > 50000: "+salaryList);
        List<Employee> highestSalary = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .stream().toList();
        System.out.println("Employee with highest salary : "+highestSalary);
        }
    }
