package com.coding.questions.designpatterns.strategy;

public class StrategyRunner {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        context.setPaymentStrategy(new CreditCardPayment());
        context.payAmount(500);

        context.setPaymentStrategy(new NetbankingPayment());
        context.payAmount(1000);

        context.setPaymentStrategy(new UPIPayment());
        context.payAmount(1500);
    }
}
