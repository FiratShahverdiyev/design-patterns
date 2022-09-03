package com.company.facade;

public class KapitalBank extends Bank {

    public KapitalBank(Account account) {
        super.account = account;
    }

    @Override
    public void withdraw(int money) {
        System.out.println("KapitalBank 1% commission : " + (money / 100F));
        account.setBudget(account.getBudget() - money);
    }

    @Override
    public void deposit(int money) {
        System.out.println("KapitalBank 1% commission : " + (money / 100F));
        account.setBudget(account.getBudget() + money);
    }

}
