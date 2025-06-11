package com.coding.questions.designpatterns.strategy;

public class UPIPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("UPI Payment" + amount + " Paid");
    }
}
