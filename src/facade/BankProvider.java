package facade;

public class BankProvider {

    public Bank getBank(BankType bankType) {
        return switch (bankType) {
            case PASA -> new PasaBank();
            case KAPITAL -> new KapitalBank();
        };
    }

}
