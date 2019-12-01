package com.han.designpattern.structural.birdge;

/**
 * 中国工商银行
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAcount() {
        System.out.println("打开一个中国工商银行");
        return account.openAccount();
    }
}
