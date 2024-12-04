package com.quest.study_programs;

import java.io.*;

public class FindAString {
    public static void main(String[] args) throws IOException {
        if (stringSearch("newfile.txt","This")){
            System.out.println("String Found");
        }
        else {
            System.out.println("String Not Found");
        }


    }

    public static boolean stringSearch(String str, String search) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(str));
        String line;
        while ((line = br.readLine()) != null) {
            if (line.contains(search)) {
                System.out.println("The line :" + line + " : contains " + search);
            }
        }
        return true;
    }



    }
