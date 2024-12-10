package com.quest.threads.bank_acc_management;

public class UserDeposit extends Thread {
    private BankAccount acc;
    private double amount;
    public UserDeposit(BankAccount acc,double amount) {
        this.acc=acc;
        this.amount = amount;

    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            acc.deposit(amount);
        }
    }
}

