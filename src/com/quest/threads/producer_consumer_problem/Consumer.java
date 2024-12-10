package com.quest.threads.producer_consumer_problem;

public class Consumer extends Thread {
    private Buffer buffer;
    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                buffer.consume();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
