package facade;

public class KapitalBank extends Bank {

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
