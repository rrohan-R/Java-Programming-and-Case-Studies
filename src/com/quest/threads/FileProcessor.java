package com.quest.threads;

import java.io.*;

public class FileProcessor implements Runnable {
    private final String fileName;
    public FileProcessor(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public void run() {
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(fileName));
            System.out.println("Reading file: " + fileName);
            br1.lines().forEach(System.out::println);
            System.out.println();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        FileProcessor fileProcessor1 = new FileProcessor("file1.txt");
        FileProcessor fileProcessor2 = new FileProcessor("file2.txt");
        Thread thread1 = new Thread(fileProcessor1);
        Thread thread2 = new Thread(fileProcessor2);
        thread1.start();
        thread2.start();

    }
}
