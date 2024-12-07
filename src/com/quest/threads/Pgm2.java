package com.quest.threads;

public class Pgm2 {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();

    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Hello");
    }
}
class Thread2 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("World");
    }
}
class Thread3 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("!");
    }
}
