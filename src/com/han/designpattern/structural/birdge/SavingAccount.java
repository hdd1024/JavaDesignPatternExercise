package com.han.designpattern.structural.birdge;

/**
 * 活期存款账户
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开一个活期存款账户");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账户");
    }
}
