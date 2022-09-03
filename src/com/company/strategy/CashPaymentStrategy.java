package com.company.strategy;

public class CashPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Pay by CASH successfully completed");
    }

}
