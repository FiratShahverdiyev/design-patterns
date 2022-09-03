package strategy;

public class StrategyTest {

    public static void main(String[] args) {
        Payment cardPayment = new Payment(new CardPaymentStrategy());
        cardPayment.pay();
        Payment cashPayment = new Payment(new CashPaymentStrategy());
        cashPayment.pay();
    }

}
