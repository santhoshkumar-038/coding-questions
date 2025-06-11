package com.coding.questions.designpatterns.factory;

public class NotificationFactory {
    public static Notification createNotification(String type){
        if(type == null || type.isEmpty()){
            return null;
        }

        switch (type.toLowerCase()){
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            default:
                throw new IllegalArgumentException("unknown type");
        }
    }
}
