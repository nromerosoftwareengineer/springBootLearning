package com.codewithnoelromero.springpactice;

public class StripePaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        String paymentMethod = "Stripe";
        System.out.println("Payment method: " + paymentMethod);
        System.out.println("Amount" + amount);
    }
}
