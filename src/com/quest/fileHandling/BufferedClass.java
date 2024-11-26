package com.quest.fileHandling;

import java.io.*;

public class BufferedClass {
    public static void main(String[] args) {
        String str="Hello World";
        try {
            BufferedInputStream bis=new BufferedInputStream(new FileInputStream("file2.txt"));
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("destination.txt"));
            byte[] buf=new byte[1024];
            int c;
            while ((c = bis.read(buf)) != -1) {
                System.out.print((char) c);
                bos.write(buf, 0, (char)c);
            }
            bos.flush();
            bis.close();
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }



    }
}
