package com.quest.CaseStudyTSMS;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class TelecomSystem {
    private ArrayList<Subscribers> subscribers = new ArrayList<>();
    private ArrayList<CallDetails> callRecords = new ArrayList<>();
    private final String subscriberFile = "subscribers.txt";
    private final String callRecordsFile = "call_records.txt";

    // Adds a subscriber
    public void addSubscriber(Subscribers subscriber) {
        subscribers.add(subscriber);
        System.out.println("Subscriber added successfully");
    }

    // Updates subscriber balance
    public void updateSubscriberBalance(String id, double newBalance) {
        for (Subscribers subscriber : subscribers) {
            if (subscriber.getSubscriberId().equals(id)) {
                subscriber.setSubscriberBalance(newBalance);
                System.out.println("Balance updated successfully");
                return;
            }
        }
        System.out.println("Subscriber not found.");
    }

    // Displays all available subscribers
    public void listSubscriberDetails() {
        subscribers.forEach(System.out::println);
    }

    // adds the call details as records
    public void addCallRecord(String subscriberId, String callType, int duration) {
        CallDetails callRecord = new CallDetails(subscriberId, callType, duration, LocalDateTime.now());
        callRecords.add(callRecord);
        System.out.println("Call record added successfully"); //toCheck
    }

    // Display call history for a subscriber
    public void displayCallHistory(String subscriberId) {
        for (CallDetails record : callRecords) {
            if (record.toString().contains(subscriberId)) {
                System.out.println(record);
            }
        }
    }

    // Generate  postpaid subscriber bill
    public void generateBillAmount(String subscriberId) {
        Subscribers subscriber = null;
        for (Subscribers subscribers : subscribers) {
            if (subscribers.getSubscriberId().equals(subscriberId)) {
                subscriber = subscribers;
                break;
            }
        }

        if (subscriber == null || !subscriber.getSubscriberPlanType().equalsIgnoreCase("Postpaid")) {
            System.out.println("Subscriber not found or the entered subscriber is not of postpaid.");
            return;
        }

        double totalAmount = 0;
        for (CallDetails record : callRecords) {
            if (record.toString().contains(subscriberId)) {
                if (record.toString().equalsIgnoreCase("Local")){
                    totalAmount += record.getCallDuration() * 2;
                } else if (record.toString().equalsIgnoreCase("STD")) {
                    totalAmount += record.getCallDuration() * 4;
                } else if (record.toString().equalsIgnoreCase("ISD")) {
                    totalAmount += record.getCallDuration() *6 ;
                }
            }
        }

        System.out.println("Bill for Subscriber " + subscriberId + ": " + totalAmount +" Rs");
    }

    // Save data to files
    public void saveData() {
        try (ObjectOutputStream subOut = new ObjectOutputStream(new FileOutputStream(subscriberFile));
             ObjectOutputStream callOut = new ObjectOutputStream(new FileOutputStream(callRecordsFile))) {
            subOut.writeObject(subscribers);
            callOut.writeObject(callRecords);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    // Load data from files
    public void loadData() {
        try (ObjectInputStream out = new ObjectInputStream(new FileInputStream(subscriberFile));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream(callRecordsFile))) {
            subscribers = (ArrayList<Subscribers>) out.readObject();
            callRecords = (ArrayList<CallDetails>) in.readObject();
            System.out.println("Data loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
}
