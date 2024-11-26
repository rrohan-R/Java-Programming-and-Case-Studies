package com.quest.fileHandling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class OutputObject {
    public static void main(String[] args) {
        String s1="Added Content";
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file2.txt"));
            int c;
            while ((c = bis.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
