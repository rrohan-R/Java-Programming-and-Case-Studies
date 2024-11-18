package com.quest.oops.Interfaces;

public class Result implements InterfaceA, InterfaceB {
    @Override
    public void add1() {
        System.out.println("add1");

    }

    @Override
    public void add2() {
        System.out.println("add2");

    }

    @Override
    public void sub() {
        System.out.println("sub");
    }
    public static void main(String[] args) {
        Result r = new Result();
        System.out.println("from Result");
        r.add1();
        r.add2();
        r.sub();
    }
}
