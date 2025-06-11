package com.coding.questions.designpatterns.strategy;

public class NetbankingPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Net banking Payment" + amount + " Paid");
    }
}
