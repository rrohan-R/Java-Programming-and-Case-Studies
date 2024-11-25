package com.quest.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HandlingFile3 {
    public static void main(String[] args) {
        File file = new File("file3.txt");
        try {
            if (file.exists()) {
                System.out.println("File created");
            }
            else {
                file.createNewFile();
                System.out.println("File created");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            file.delete();
            System.out.println("File deleted");
        }
    }
}
