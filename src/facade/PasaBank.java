package facade;

public class PasaBank extends Bank {

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
