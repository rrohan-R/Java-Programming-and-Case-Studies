package com.quest.fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreams2 {
    public static void main(String[] args) {
        File file=new File("file3.txt");
        try {
            if (file.exists()){
                FileOutputStream fos=new FileOutputStream(file,true);
                fos.write("Hello World\nHi world\nHow are you\nWho is this\nheloo".getBytes());
                fos.close();
                FileInputStream fis=new FileInputStream(file);
                int i;
                while((i=fis.read())!=-1){
                    System.out.print((char)i);
                }
                fis.close();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
