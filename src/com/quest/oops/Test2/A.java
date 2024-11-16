package com.quest.oops.Test2;

public class A extends B {
    public static void main(String[] args) {
    A a = new A();
    a.add(1,2);
    }
    A(){
        System.out.println("A");
    }
    void add(){
        this.add(1,2);
        System.out.println("add method with no arguments");
    }
    @Override
    void add(int a, int b){
        super.add(a,b);
       int c=a+b;
        System.out.println("A Add"+c);
    }
    static void add(int a){
        System.out.println("A Add"+a);

    }
//    class C extends A{
//        A a = new A();
//        static void add(int a){
//            System.out.println("A Add"+a);
//
//        }
//    }
}

