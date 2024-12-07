package com.quest.CaseStudyDay22;

import java.io.*;
import java.util.*;

public class CustomerMapping implements Serializable {
    Map<Customer, Set<Vehicle>> customers = new HashMap<Customer, Set<Vehicle>>();
    List<Vehicle> inventory = new ArrayList<Vehicle>();

    public void addToInventory(Vehicle v) {
        inventory.add(v);
    }

    public void addToPurchaseList(Customer c, String vehicleId) throws VehicleNotAvailableException {
        Vehicle vehiclePurchase = null;

        for (Vehicle v : inventory) {
            if (v.getVehicleId().equals(vehicleId)) {
                vehiclePurchase = v;
            }
        }
        if (vehiclePurchase == null) {
            throw new VehicleNotAvailableException("Vehicle not available");
        }
        c.addPurchasedVehicle(vehiclePurchase);
        customers.computeIfAbsent(c, k -> new HashSet<>()).add(vehiclePurchase);
        inventory.remove(vehiclePurchase);
    }

    public void displayPurchasedVehicles() {
        for (Map.Entry<Customer, Set<Vehicle>> entry : customers.entrySet()) {
            Customer customer = entry.getKey();
            Set<Vehicle> vehicles = entry.getValue();
            System.out.println("Customer ID: " + customer.getCustomerId() + "Vehicle ID: " + vehicles);
        }
    }


    }
