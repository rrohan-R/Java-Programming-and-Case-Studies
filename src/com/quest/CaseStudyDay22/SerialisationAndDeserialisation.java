package com.quest.CaseStudyDay22;

import java.io.*;
import java.util.Map;
import java.util.Set;

public class SerialisationAndDeserialisation {

    public static void serialise(Map<Customer, Set<Vehicle>> salesData, String fileName) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(salesData);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static Map<Customer, Set<Vehicle>> deserialize(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Map<Customer, Set<Vehicle>>) in.readObject();
        }
    }
}
