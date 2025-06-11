package com.coding.questions.designpatterns.factory;

public class FactoryPattern {
    public static void main(String[] args) {
      Notification emailNotification = NotificationFactory.createNotification("email");
      emailNotification.notifyUser();

      Notification smsNotification = NotificationFactory.createNotification("sms");
      smsNotification.notifyUser();
    }
}
