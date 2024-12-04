package com.quest.study_programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IndianDateFormat {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Todays date in Indian date format is: "+sdf.format(date));

    }
}
