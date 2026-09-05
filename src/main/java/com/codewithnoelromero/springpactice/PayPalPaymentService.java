package com.codewithnoelromero.springpactice;

import org.springframework.stereotype.Service;

@Service
public class PayPalPaymentService implements PaymentService {


    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL Payment");
        System.out.println("Amount: " + amount);

    }
}
