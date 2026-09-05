package com.codewithnoelromero.springpactice.notificationService;


import org.springframework.stereotype.Service;

@Service("sms")
public class SMSNotificationService implements NotificationService{

    @Override
    public void send(String msg) {
        System.out.println("Sending message to PhoneNumber " + msg);
    }
}
