package com.firsttest;

import com.example2.BankAccount;
import com.example2.SavingsAccount;

public class MainTwo {

    public static  void main(String args[]){
        BankAccount monCompte = new SavingsAccount (10  );
        monCompte.withdraw ( 500 );

    }
}
