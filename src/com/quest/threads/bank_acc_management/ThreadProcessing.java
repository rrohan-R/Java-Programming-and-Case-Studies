package com.quest.threads.bank_acc_management;

public class ThreadProcessing {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(200);
        Thread t1 = new UserDeposit(bankAccount,100);
        Thread t2 = new UserWithdraw(bankAccount,200);
        Thread t3 = new UserWithdraw(bankAccount,50);
        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");

        t1.start();
        t2.start();
        t3.start();
    }
}
