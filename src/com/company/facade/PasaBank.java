package com.company.facade;

public class PasaBank extends Bank {

    public PasaBank(Account account) {
        super.account = account;
    }

    @Override
    public void withdraw(int money) {
        System.out.println("PasaBank 2% commission : " + (money / 100F) * 2F);
        account.setBudget(account.getBudget() - money);
    }

    @Override
    public void deposit(int money) {
        System.out.println("PasaBank 2% commission : " + (money / 100F) * 2F);
        account.setBudget(account.getBudget() + money);
    }


}
