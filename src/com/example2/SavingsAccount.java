package com.example2;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(int balance) {
        super ( balance );
    }

    @Override
    public void withdraw(int amountOut) {

        if (super.getBalance () <100){
            System.out.println ("Not enough funds!!!");
        }
        else {
            super.withdraw ( amountOut );
        }
    }
}
