package com.quest.oops.Abstraction;

public class StudentFactory {
    public static Student getStudent(String studentName) {
        if (studentName.equalsIgnoreCase("Online")) {
            Student s= new OnlineStudent();
            return new OnlineStudent();
        }
        else if (studentName.equalsIgnoreCase("Offline")) {
            return new OfflineStudent();
        }
        else if (studentName.equalsIgnoreCase("Regular")) {
            return new RegularStudent();
        }
        else {
            return null;
        }
    }
}
