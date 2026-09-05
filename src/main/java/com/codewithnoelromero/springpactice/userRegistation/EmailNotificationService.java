package com.codewithnoelromero.springpactice.userRegistation;

import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService{
    @Override
    public void send(String msg, String recipientEmail) {
        System.out.println("email msg : " + msg + " recipientEmail: " + recipientEmail);
    }
}
