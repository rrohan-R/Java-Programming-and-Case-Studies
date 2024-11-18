package com.quest.oops.Abstraction;

public class AbstractionExample {
    public static void main(String[] args) {
        Student online=new OnlineStudent();
        Student offline=new OfflineStudent();
        Student regular=new RegularStudent();
        offline.attendClass();
        offline.submitAssignment();
        online.attendClass();
        online.study();
        online.submitAssignment();
        regular.attendClass();
        regular.submitAssignment();


//        Student onlineStudent=StudentFactory.getStudent("online");
//        Student offlineStudent=StudentFactory.getStudent("offline");
//        Student regularStudent=StudentFactory.getStudent("regular");
//        onlineStudent.attendClass();
//        offlineStudent.attendClass();
//        regularStudent.attendClass();
//        onlineStudent.submitAssignment();
//        offlineStudent.submitAssignment();
//        regularStudent.submitAssignment();



    }
}
