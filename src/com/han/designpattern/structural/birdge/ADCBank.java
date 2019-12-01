package com.han.designpattern.structural.birdge;

/**
 * 农业银行
 */
public class ADCBank extends Bank {
    public ADCBank(Account account) {
        super(account);
    }

    @Override
    Account openAcount() {
        System.out.println("打开农业银行");
        return account.openAccount();
    }
}
