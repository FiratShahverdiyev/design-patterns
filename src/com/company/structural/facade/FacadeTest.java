package com.company.structural.facade;

public class FacadeTest {

    public static void main(String[] args) {
        Account account1 = new Account(1000, "Firat");
        account1.setBankType(BankType.KAPITAL);
        BankAccountFacade kapitalBank = new BankAccountFacade(account1, "12345");
        System.out.println(account1.getBudget());
        kapitalBank.withdraw(50);
        System.out.println(account1.getBudget());
        kapitalBank.deposit(150);
        System.out.println(account1.getBudget());

        Account account2 = new Account(2000, "Anar");
        account2.setBankType(BankType.PASA);
        BankAccountFacade pasaBank = new BankAccountFacade(account2, "12345");
        System.out.println(account2.getBudget());
        pasaBank.withdraw(150);
        System.out.println(account2.getBudget());
        pasaBank.deposit(25);
        System.out.println(account2.getBudget());
    }

}
