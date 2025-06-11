package com.coding.questions.designpatterns.factory;

public class EmailNotification implements Notification{
    public void notifyUser(){
        System.out.println("User Email Notification");
    }
}
