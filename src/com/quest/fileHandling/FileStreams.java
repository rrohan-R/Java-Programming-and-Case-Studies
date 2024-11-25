package com.quest.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreams {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("File1.txt");
            System.out.println("File stream created successfully");
            System.out.println(fis.read());
            String str="Input as streams";
            int c=0;
            FileOutputStream fos = new FileOutputStream("File1.txt");
            fos.write(str.getBytes());
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }
//            fis.read();
            fis.close();
            System.out.println("\nFile stream closed successfully");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
