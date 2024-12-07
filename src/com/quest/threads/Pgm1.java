package com.quest.threads;

public class Pgm1 {

    public static void main(String[] args) {
        OddThread thread1 = new OddThread();
        EvenThread thread2 = new EvenThread();
        thread2.setPriority(2);
        thread1.setPriority(1);
        thread1.start();
        thread2.start();

    }
}


     class OddThread extends Thread {
        @Override
        public void run() {
            System.out.println("OddNums");
            for (int i = 1; i <= 10; i+=2) {
                System.out.println(i);
            }
        }
    }
     class EvenThread extends Thread {
        @Override
        public void run() {
            System.out.println("EvenNums");
            for (int i = 2; i <= 10; i+=2) {
                System.out.println(i);
            }
        }
    }

