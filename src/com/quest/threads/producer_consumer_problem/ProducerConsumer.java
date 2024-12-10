package com.quest.threads.producer_consumer_problem;

public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer =new Buffer(2);
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        producer.start();
        consumer.start();
        


    }
}
