package com.quest.threads.producer_consumer_problem;

import java.util.ArrayList;
import java.util.List;

public class Buffer {
    private List<String> buffer;
    private int bufferCapacity;
    public Buffer(int bufferCapacity) {
        this.bufferCapacity = bufferCapacity;
        buffer = new ArrayList<>();
    }
    public synchronized void produce(String item) throws InterruptedException {
        while (buffer.size()==bufferCapacity) {
            System.out.println("The buffer is full (Producer waits)");
            wait();
        }
        buffer.add(item);
        System.out.println("Producer produced: "+item);
        notifyAll();
    }
    public synchronized String consume() throws InterruptedException {
        while (buffer.size()==0) {
            System.out.println("The buffer is empty (Consumer waits)");
            wait();
        }
        String item= buffer.remove(0);
        System.out.println("Consumer consumed:"+ item);
        notifyAll();
        return item;
    }
}

