package facade;

public class BankAccountFacade {

    private Account account;
    private String securityCode;

    private AccountValidator accountValidator;
    private BankProvider bankProvider;
    private AccountService accountService;

    public BankAccountFacade(Account account, String securityCode) {
        this.account = account;
        this.securityCode = securityCode;

        accountValidator = new AccountValidator(account);
        bankProvider = new BankProvider();
        accountService = new AccountService(account);
    }

    public void withdraw(int amount) {
        if (accountValidator.haveEnoughMoney(amount)) {
            Bank bank = bankProvider.getBank(account.getBankType());
            System.out.println(accountService.checkAccount());
            bank.withdraw(amount);
        }
    }

    public void deposit(int amount) {
        Bank bank = bankProvider.getBank(account.getBankType());
        System.out.println(accountService.checkAccount());
        bank.withdraw(amount);
    }

}
