package com.quest.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class HandlingFiles2 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("file2.txt");
            fw.write("Hello World FileWriter1");
            fw.append("\nAdded some data");
            CharSequence charSequence = "\nBye World FileWriter1";
            fw.append(charSequence);
            fw.append("@asa",0,4);
            fw.close();
            System.out.println("File created and written to it successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
