package com.quest.practise_vars;

public class PractiseOperators {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        // Arithmetic Operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println(a/b);
        //Relational Operators
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        boolean x=true;
        boolean y=false;
        //Logical Operators
        System.out.println(x&&y);
        System.out.println(x||y);
        System.out.println(x!=y);

        int z=10;
        //Assignment Operators
        z+=5; //z=z+5
        //Unary Operators
        System.out.println(z++);
        System.out.println(++z);
        System.out.println(z);
        System.out.println(z--);
        System.out.println(--z);
        System.out.println(z);

        int p=10;
        int q=20;
        //Ternary Operators
        int result=p>15 ? ++q : 0;
        System.out.println(result);


    }
}
