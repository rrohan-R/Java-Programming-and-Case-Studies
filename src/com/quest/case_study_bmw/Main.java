package com.quest.case_study_bmw;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static final Map<Customer, List<ServiceBooking>> customerBookings = new HashMap<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {

        while (true) {
            System.out.println("\n=== Vehicle Service Management System ===");
            System.out.println("1. Manage Vehicles");
            System.out.println("2. Manage Customers and Service Bookings");
            System.out.println("3. Generate Reports");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> manageVehicles();
                case 2 -> manageServiceBookings();
                case 3 -> generateReports();
                case 4 -> {
                    System.out.println("Exiting the system. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void manageVehicles() {
        System.out.println("\n=== Manage Vehicles ===");
        System.out.println("1. Add Electric Vehicle");
        System.out.println("2. Add Combustion Engine Vehicle");
        System.out.println("3. View All Vehicles");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1 -> addElectricVehicle();
            case 2 -> addCombustionEngineVehicle();
            case 3 -> viewAllVehicles();
            default -> System.out.println("Invalid choice! Please try again.");
        }
    }

    private static final List<Vehicle> vehicleList = new ArrayList<>();

    private static void addElectricVehicle() {
        System.out.print("Enter VIN: ");
        String vin = scanner.nextLine();
        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter Model: ");
        String model = scanner.nextLine();
        System.out.print("Enter Year: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Mileage: ");
        double mileage = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter Owner Name: ");
        String ownerName = scanner.nextLine();
        System.out.print("Enter Battery Capacity (kWh): ");
        double batteryCapacity = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter Range Per Charge (km): ");
        double rangePerCharge = Double.parseDouble(scanner.nextLine());

        vehicleList.add(new ElectricVehicle(vin, brand, model, year, mileage, ownerName, batteryCapacity, rangePerCharge));
        System.out.println("Electric vehicle added successfully!");
    }

    private static void addCombustionEngineVehicle() {
        System.out.print("Enter VIN: ");
        String vin = scanner.nextLine();
        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter Model: ");
        String model = scanner.nextLine();
        System.out.print("Enter Year: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Mileage: ");
        double mileage = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter Owner Name: ");
        String ownerName = scanner.nextLine();
        System.out.print("Enter Fuel Type: ");
        String fuelType = scanner.nextLine();
        System.out.print("Enter Engine Capacity (L): ");
        double engineCapacity = Double.parseDouble(scanner.nextLine());

        vehicleList.add(new CombustionEngineVehicle(vin, brand, model, year, mileage, ownerName, fuelType, engineCapacity));
        System.out.println("Combustion engine vehicle added successfully!");
    }

    private static void viewAllVehicles() {
        System.out.println("\nAll Vehicles:");
        vehicleList.forEach(System.out::println);
    }


    private static void manageServiceBookings() {
        System.out.println("\n=== Manage Customers and Service Bookings ===");
        System.out.println("1. Add Customer");
        System.out.println("2. Add Service Booking");
        System.out.println("3. View Bookings by Customer");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1 -> addCustomer();
            case 2 -> addServiceBooking();
            case 3 -> viewBookingsByCustomer();
            default -> System.out.println("Invalid choice! Please try again.");
        }
    }

    private static final List<Customer> customerList = new ArrayList<>();

    private static void addCustomer() {
        System.out.print("Enter Customer ID: ");
        String customerId = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.println("Select Vehicle:");
        for (int i = 0; i < vehicleList.size(); i++) {
            System.out.println((i + 1) + ". " + vehicleList.get(i));
        }
        System.out.print("Enter choice: ");
        int vehicleChoice = Integer.parseInt(scanner.nextLine()) - 1;

        if (vehicleChoice < 0 || vehicleChoice >= vehicleList.size()) {
            System.out.println("Invalid vehicle choice!");
            return;
        }

        Vehicle vehicle = vehicleList.get(vehicleChoice);
        Customer customer = new Customer(customerId, name, email, vehicle);
        customerList.add(customer);
        System.out.println("Customer added successfully!");
    }

    private static void addServiceBooking() {
        System.out.println("Select Customer:");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println((i + 1) + ". " + customerList.get(i));
        }
        System.out.print("Enter choice: ");
        int customerChoice = Integer.parseInt(scanner.nextLine()) - 1;

        if (customerChoice < 0 || customerChoice >= customerList.size()) {
            System.out.println("Invalid customer choice!");
            return;
        }

        Customer customer = customerList.get(customerChoice);

        System.out.print("Enter Booking ID: ");
        String bookingId = scanner.nextLine();
        System.out.print("Enter Service Date (YYYY-MM-DD HH:mm): ");
        String dateInput = scanner.nextLine();
        LocalDateTime serviceDate = LocalDateTime.parse(dateInput.replace(" ", "T"));
        System.out.print("Enter Service Type: ");
        String serviceType = scanner.nextLine();
        System.out.print("Enter Cost: ");
        double cost = Double.parseDouble(scanner.nextLine());

        ServiceBooking booking = new ServiceBooking(bookingId, customer, serviceDate, serviceType, cost);
        customerBookings.computeIfAbsent(customer, k -> new ArrayList<>()).add(booking);
        System.out.println("Service booking added successfully!");
    }

    private static void viewBookingsByCustomer() {
        System.out.println("Select Customer:");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println((i + 1) + ". " + customerList.get(i));
        }
        System.out.print("Enter choice: ");
        int customerChoice = Integer.parseInt(scanner.nextLine()) - 1;

        if (customerChoice < 0 || customerChoice >= customerList.size()) {
            System.out.println("Invalid customer choice!");
            return;
        }

        Customer customer = customerList.get(customerChoice);
        List<ServiceBooking> bookings = customerBookings.getOrDefault(customer, new ArrayList<>());
        System.out.println("\nBookings for " + customer.getName() + ":");
        bookings.forEach(System.out::println);
    }

    private static void generateReports() throws FileNotFoundException {
        System.out.println("\n=== Generate Reports ===");
        System.out.println("1. Serialize Data");
        System.out.println("2. Deserialize Data");
        System.out.println("3. Write Report to File");
        System.out.println("4. Read Report from File");
        System.out.println("5. Advanced Stream API Queries");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1 -> Serialization.serializeData(customerBookings, "serviceData.ser");
            case 2 -> Serialization.deserializeData("serviceData.ser");
            case 3 -> FileReport.writeReport(customerBookings, "serviceReports.txt");
            case 4 -> FileReport.readReport("serviceReports.txt");
            case 5 -> {
                CustomerBookingServices.calculateAverageCost(customerBookings);
                CustomerBookingServices.findTopSpender(customerBookings);
            }
            default -> System.out.println("Invalid choice! Please try again.");
        }

    }
}
