package com.quest.threads.producer_consumer_problem;

public class Producer extends Thread {
    Buffer buffer;
    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                buffer.produce("Item"+(i+1));

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
