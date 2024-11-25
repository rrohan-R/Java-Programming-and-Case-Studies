package com.quest.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class HandlingFiles {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("File1.txt");
        /*if (file.exists()) {
            System.out.println("File created " + file.getAbsolutePath());
        } else {
            System.out.println("File already exists");
        }*/

        try {
            System.out.println("Try Started");
            if (file.exists()) {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    System.out.println(line);
                }
                sc.close();
                System.out.println("File created successfully");
            } else {
                System.out.println("File does not exist");
            }
            System.out.println("Try Ended");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
//        finally {
//            file.delete();
//            System.out.println("File deleted successfully");
//        }
        //file.delete();
    }
}
