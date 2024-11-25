package com.quest.exceptionHandling;

public class OutOfMemoryError {
    public static void main(String[] args) {
        try {
            causeOutOfMemory();
        }
        catch (java.lang.OutOfMemoryError e) {
            System.out.println("Out of memory error");
            e.printStackTrace();
        }

    }

    public static void causeOutOfMemory(){
        int[] arr=new int[Integer.MAX_VALUE];
    }
}
