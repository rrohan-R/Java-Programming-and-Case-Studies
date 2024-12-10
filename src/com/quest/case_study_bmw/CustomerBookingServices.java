package com.quest.case_study_bmw;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CustomerBookingServices implements Cloneable {
    public static void main(String[] args) {
        Map<Customer, List<ServiceBooking>> bookingsOfCustomer = new HashMap<Customer, List<ServiceBooking>>();
        Customer c1 = new Customer("C1", "Rolex", "rolex@example.com",
                new ElectricVehicle("EV1", "Tesla", "Model S", 2018, 60000, "Rolex", 100, 400));
        Customer c2 = new Customer("C2", "Leo", "leo@example.com",
                new CombustionEngineVehicle("CEV2", "Toyota", "Camry", 2010, 120000, "Leo", "Petrol", 2.5));


        try {
            addCustomerBooking(bookingsOfCustomer, new ServiceBooking("B1", c1, LocalDateTime.now().plusDays(3), "Battery Check", 200));
            addCustomerBooking(bookingsOfCustomer, new ServiceBooking("B2", c2, LocalDateTime.now().plusDays(10), "Oil Change", 100));
            addCustomerBooking(bookingsOfCustomer, new ServiceBooking("B3", c1, LocalDateTime.now().plusDays(15), "General Service", 300));
        } catch (InvalidBookingException e) {
            System.out.println(e.getMessage());
        }

        Predicate<ServiceBooking> serviceBookingPredicate= i -> i.getServiceDate().isBefore(LocalDateTime.now().plusDays(7));
        Consumer<Customer> detailedInvoiceConsumer= i -> {
            List<ServiceBooking> bookings = bookingsOfCustomer.getOrDefault(i, new ArrayList<>());
            bookings.forEach(System.out::println);
            double totalCost= bookings.stream().mapToDouble(ServiceBooking::getCost).sum();
            System.out.println("Total Cost: "+totalCost);
        };

        Function<Customer, Double> applyDiscount = customer -> {
            List<ServiceBooking> bookings = bookingsOfCustomer.getOrDefault(customer, new ArrayList<>());
            double totalCost = bookings.stream().mapToDouble(ServiceBooking::getCost).sum();
            if (bookings.size()>3){
                totalCost *=0.85;
            }
            else {}
            return totalCost;
        };

        Supplier<ServiceBooking> randomBookingSupplier = () -> {
            String bookingId = "B" + new Random().nextInt();
            LocalDateTime serviceDate = LocalDateTime.now().plusDays(new Random().nextInt(15));
            String serviceType = "Random Service";
            double cost = 100 + new Random().nextInt(400);
            return new ServiceBooking(bookingId, c1, serviceDate, serviceType, cost);
        };

        detailedInvoiceConsumer.accept(c1);

        System.out.println("Total cost after discount for Alice: " + applyDiscount.apply(c1));

        System.out.println("Generated Booking: " + randomBookingSupplier.get());
        calculateAverageCost(bookingsOfCustomer);
        findTopSpender(bookingsOfCustomer);
    }
    public static void addCustomerBooking(Map<Customer, List<ServiceBooking>> bookingsOfCustomer, ServiceBooking serviceBooking) throws InvalidBookingException{
        List<ServiceBooking> bookings = bookingsOfCustomer.computeIfAbsent(serviceBooking.getCustomer(), k -> new ArrayList<>());
        boolean duplicate = bookings.stream().anyMatch(i -> i.getBookingId().equals(serviceBooking.getBookingId()));
        if (duplicate) {
            throw new InvalidBookingException("Customer " + serviceBooking.getCustomer() + " already exists");
        }
        else {
            bookingsOfCustomer.computeIfAbsent(serviceBooking.getCustomer(), k -> new ArrayList<>()).add(serviceBooking);
        }

    }
    public static void calculateAverageCost(Map<Customer, List<ServiceBooking>> customerBookings) {
        Map<String, Double> averageCostByType = customerBookings.values().stream()
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(
                        booking -> booking.getCustomer().getVehicle() instanceof ElectricVehicle ? "Electric" : "Combustion",
                        Collectors.averagingDouble(ServiceBooking::getCost)
                ));

        System.out.println("Average Cost by Vehicle Type:");
        averageCostByType.forEach((type, avgCost) -> System.out.println(type + ": " + avgCost));
    }
    public static void findTopSpender(Map<Customer, List<ServiceBooking>> customerBookings) {
        customerBookings.entrySet().stream()
                .max(Comparator.comparingDouble(entry -> entry.getValue().stream().mapToDouble(ServiceBooking::getCost).sum()))
                .ifPresent(entry -> {
                    Customer topCustomer = entry.getKey();
                    double totalSpent = entry.getValue().stream().mapToDouble(ServiceBooking::getCost).sum();
                    System.out.println("Top Spender: " + topCustomer.getName() + " (Total Spent: " + totalSpent + ")");
                });
    }


    @Override
    public CustomerBookingServices clone() {
        try {
            return (CustomerBookingServices) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
