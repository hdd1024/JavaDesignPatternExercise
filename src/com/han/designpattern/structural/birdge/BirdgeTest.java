package com.han.designpattern.structural.birdge;

public class BirdgeTest {

    public static void main(String[] args) {
        Bank adbBank=new ADCBank(new DepositAccount());
        Account adbAccount = adbBank.openAcount();
        adbAccount.showAccountType();
        
        Bank icbcBank=new ICBCBank(new SavingAccount());
        Account icbcAccount = icbcBank.openAcount();
        icbcAccount.showAccountType();
    }
}
