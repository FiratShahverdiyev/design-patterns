package com.company.facade;

public class BankProvider {

    private Account account;

    public BankProvider(Account account) {
        this.account = account;
    }

    public Bank getBank(BankType bankType) {
        return switch (bankType) {
            case PASA -> new PasaBank(account);
            case KAPITAL -> new KapitalBank(account);
        };
    }

}
