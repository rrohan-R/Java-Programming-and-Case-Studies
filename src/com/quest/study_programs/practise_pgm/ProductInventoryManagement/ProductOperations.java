package com.quest.study_programs.practise_pgm.ProductInventoryManagement;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductOperations {
    public static void main(String[] args) {
        List<Product> products = List.of(new Product(1,"Laptop",40000,2),new Product(2,"Monitor",15000,6),new Product(3,"Keyboard",1500,20),new Product(4,"Mobiles",25000,30));
        double total = products.stream().mapToDouble(p -> p.getPrice()*p.getQuantity()).sum();

        System.out.println("Total inventory value: " + total);
        List<String> expensiveProducts= products.stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed()).limit(3).map(Product::getName).toList();
        System.out.println("Top 3 most expensive products:\n"+expensiveProducts);
        Map<String, Double> productsMap = products.stream()
                .collect(Collectors.toMap(Product::getName, Product::getPrice));
        System.out.println("Products Map: "+productsMap);
    }
}
