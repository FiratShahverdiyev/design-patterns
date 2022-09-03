package com.company.facade;

public class AccountValidator {

    private Account account;

    public AccountValidator(Account account) {
        this.account = account;
    }

    public boolean haveEnoughMoney(int money) {
        return money <= account.getBudget();
    }

}
