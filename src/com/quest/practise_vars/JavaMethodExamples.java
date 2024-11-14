package com.quest.practise_vars;

public class JavaMethodExamples {
    public static void main(String[] args) {
        JavaMethodExamples jme = new JavaMethodExamples();
        jme.display("hello");
        int result= jme.add(2,4);
        System.out.println(result);
    }

    /**
     * displays string
     * @param str - name

     */
    private void display(String str){
        System.out.println(str);
    }

    /**
     * adds two numbers
     * @param a -n1
     * @param b -n2
     * @return n

     */

    private int add(int a, int b){
        return a+b;
    }
}
