package com.coding.questions.designpatterns.strategy;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Credit card payment" + amount + " Paid");
    }
}
