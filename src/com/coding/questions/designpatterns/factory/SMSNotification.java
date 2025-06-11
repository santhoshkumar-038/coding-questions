package com.coding.questions.designpatterns.factory;

public class SMSNotification implements Notification{
    public void notifyUser(){
        System.out.println("User SMS Notification");
    }
}
