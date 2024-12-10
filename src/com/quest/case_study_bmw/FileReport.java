package com.quest.case_study_bmw;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FileReport {
    public static void writeReport(Map<Customer, List<ServiceBooking>> customerBookings, String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            double totalRevenue = customerBookings.values().stream()
                    .flatMap(List::stream)
                    .mapToDouble(ServiceBooking::getCost)
                    .sum();

            Map<String, Long> serviceTypeCounts = customerBookings.values().stream()
                    .flatMap(List::stream)
                    .collect(Collectors.groupingBy(ServiceBooking::getServiceType, Collectors.counting()));

            writer.println("Total Revenue: " + totalRevenue);
            writer.println("Count of Services: ");
            serviceTypeCounts.forEach((type, count) -> writer.println(type + ": " + count));
            System.out.println("Report successfully written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readReport(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Service Report:");
            reader.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
