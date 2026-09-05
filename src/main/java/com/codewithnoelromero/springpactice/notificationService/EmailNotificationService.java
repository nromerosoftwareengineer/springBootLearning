package com.codewithnoelromero.springpactice.notificationService;

import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService implements  NotificationService{


    @Override
    public void send(String msg) {
        System.out.println("Sending message to Email " + msg);
    }
}
