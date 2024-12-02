package com.quest.Collections.collection_programs.map_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapOfEmployee {
    public static void main(String[] args) {
        Map<String,String> employees = new HashMap<>();
        employees.put("ID1","Jack");
        employees.put("ID2","Peter");
        employees.put("ID3","Rose");
        employees.put("ID4","Eva");
        employees.put("ID5","Monica");
        System.out.println("The Employees are :"+employees.entrySet().stream().sorted(Map.Entry.comparingByKey()).toList());

        getEmpName(employees);
    }

    public static void getEmpName(Map<String,String> employees){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee ID: ");
        String id = sc.nextLine().toUpperCase();
        String name=employees.get(id);
        if(name!=null){
            System.out.println(name);
        }
        else{
            System.out.println("Employee ID not found");
        }
    }
}
