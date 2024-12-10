package com.quest.threads.bank_acc_management;

public class BankAccount {
    private double accountBalance;
    public BankAccount(double accountBalance) {
        this.accountBalance=accountBalance;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public synchronized void deposit(double amount) {
        accountBalance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount );
    }

    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount );
        } else {
            System.out.println(Thread.currentThread().getName() + " withdrawal failed due to insufficient balance");
        }
    }

}
