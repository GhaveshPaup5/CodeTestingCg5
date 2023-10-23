package com.example2;

public class BankAccount {

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amountOut){
       balance -=-amountOut;
    }

    public void deposit(int amountIn){

    }

}
