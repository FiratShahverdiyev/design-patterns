package facade;

public class FacadeTest {

    public static void main(String[] args) {
        Account account = new Account(1000, "Firat");
        account.setBankType(BankType.KAPITAL);
        BankAccountFacade bankAccountFacade = new BankAccountFacade(account, "12345");
        System.out.println(account.getBudget());
        bankAccountFacade.withdraw(50);
        System.out.println(account.getBudget());
        bankAccountFacade.deposit(150);
        System.out.println(account.getBudget());
    }

}
