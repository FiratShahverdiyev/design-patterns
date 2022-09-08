package com.company.behavioral.strategy;

public class CardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Pay by CARD successfully completed");
    }

}
