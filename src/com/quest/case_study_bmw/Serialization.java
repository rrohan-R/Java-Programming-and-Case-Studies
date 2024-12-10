package com.quest.case_study_bmw;

import java.io.*;
import java.util.List;
import java.util.Map;

public class Serialization {
    public static void serializeData(Map<Customer, List<ServiceBooking>> data, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(data);
            System.out.println("Data successfully serialized to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Customer, List<ServiceBooking>> deserializeData(String fileName) throws FileNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Map<Customer, List<ServiceBooking>> map= (Map<Customer, List<ServiceBooking>>) ois.readObject();
            System.out.println("Data successfully deserialized to ");
            return map;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}