package com.quest.threads.bank_acc_management;

public class UserWithdraw extends Thread {
    private BankAccount acc;
    private double amount;
    public UserWithdraw(BankAccount acc,double amount) {
        this.acc = acc;
        this.amount = amount;
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            acc.withdraw(amount);
        }

    }
}
