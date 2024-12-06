package com.quest.CaseStudyDay22;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InventoryOfVehicles {
    public static void main(String[] args) {
        Vehicle[] vehicles=new Vehicle[]{
        new Car("c1", "Ford", "Mustang", 50000, LocalDate.of(2008, 5, 22), 5),
        new Car("c2", "Porsche", "Panamera", 40000, LocalDate.of(2010, 6, 2), 4),
        new Car("c3", "Maruthi", "Zen", 10000, LocalDate.of(2000, 1, 1), 4),
        new Bike("b1","Yamaha","FZ",22000,LocalDate.of(2015, 1, 30), 250),
        new Bike("b2","Pulsar","NS",14000,LocalDate.of(2009, 1, 30), 150)};
        List<Vehicle> vehicleList=Arrays.asList(vehicles);
        brandSorting(vehicleList,"porsche");
    }

    public static void brandSorting(List<Vehicle> vehicles,String brand) {
        System.out.println("Vehicles from brand: " + brand);
        vehicles.stream()
                .filter(vehicle -> vehicle.getBrand().equalsIgnoreCase(brand))
                .forEach(System.out::println);
    }

    public static Vehicle discountToVehicle(Vehicle vehicle) throws CloneNotSupportedException{
        Vehicle vehicleClone =  vehicle.clone();
        vehicleClone.setPrice(vehicle.getPrice() * 0.5);
        return vehicleClone;
    }
}
