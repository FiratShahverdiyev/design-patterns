package com.company.structural.facade;

public class AccountService {

    private Account account;

    public AccountService(Account account) {
        this.account = account;
    }

    public String checkAccount() {
        return account.getName();
    }

}
