package com.company.facade;

public abstract class Bank {

    protected Account account;

    public abstract void withdraw(int money);
    public abstract void deposit(int money);

}
