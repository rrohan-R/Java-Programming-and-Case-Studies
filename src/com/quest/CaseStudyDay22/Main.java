package com.quest.CaseStudyDay22;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        CustomerMapping customerSales = new CustomerMapping();
        Map<Customer, Set<Vehicle>> salesData = new HashMap<>();

        // Populate inventory with some sample vehicles
        customerSales.addToInventory(new Car("C1", "Toyota", "Camry", 30000, LocalDate.of(2020, 5, 10), 5));
        customerSales.addToInventory(new Car("C2", "Honda", "Civic", 25000, LocalDate.of(2019, 3, 15), 5));
        customerSales.addToInventory(new Bike("B1", "Yamaha", "YZF-R15", 1500, LocalDate.of(2022, 2, 5), 150));
        customerSales.addToInventory(new Bike("B2", "Suzuki", "Gixxer", 1200, LocalDate.of(2021, 8, 20), 155));

        while (true) {
            System.out.println("\n--- Vehicle Sales Management ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Purchase Vehicle");
            System.out.println("3. Display Purchased Vehicles");
            System.out.println("4. Apply Discount to a Vehicle");
            System.out.println("5. Serialize the data");
            System.out.println("6. Deserialize and display the data");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Add Customer
                    System.out.print("Enter Customer ID: ");
                    String customerId = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    Customer customer = new Customer(customerId, name, email);
                    salesData.put(customer, new HashSet<>());
                    System.out.println("Customer added successfully!");
                    break;

                case 2:
                    // Purchase Vehicle
                    System.out.print("Enter Customer ID: ");
                    String buyerId = scanner.nextLine();
                    Customer buyer = salesData.keySet().stream()
                            .filter(c -> c.getCustomerId().equals(buyerId))
                            .findFirst()
                            .orElse(null);

                    if (buyer == null) {
                        System.out.println("Customer not found!");
                        break;
                    }

                    System.out.print("Enter Vehicle ID to purchase: ");
                    String vehicleId = scanner.nextLine();

                        customerSales.addToPurchaseList(buyer, vehicleId);
                    System.out.println("Customer "+buyer+" purchased the vehicle "+vehicleId+" successfully!");
                    break;

                case 3:
                    // Display Purchased Vehicles
                    customerSales.displayPurchasedVehicles();
                    break;

                case 4:
                    // Apply Discount to a Vehicle
                    System.out.print("Enter Vehicle ID to apply discount: ");
                    String discountVehicleId = scanner.nextLine();
                    Vehicle vehicle = customerSales.inventory.stream()
                            .filter(v -> v.getVehicleId().equals(discountVehicleId))
                            .findFirst()
                            .orElse(null);

                    if (vehicle != null) {
                            Vehicle discountedVehicle =  vehicle.cloneDiscount(vehicle);
                            System.out.println("Discounted Vehicle: " + discountedVehicle);
                    } else {
                        System.out.println("Vehicle not found!");
                    }
                    break;

                case 5:
                    // Serialize
                    SerialisationAndDeserialisation.serialise(salesData, "salesData.ser");
                    break;

                case 6:
                    // Deserialize
                    Map<Customer, Set<Vehicle>> deserializedData = SerialisationAndDeserialisation.deserialize("salesData.ser");
                    if (deserializedData != null) {
                        deserializedData.forEach((cust, vehicles) -> {
                            System.out.println(cust);
                            vehicles.forEach(System.out::println);
                        });
                    }
                    break;

                case 7:
                    // Exit
                    System.out.println("Exited Successfully!");
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
