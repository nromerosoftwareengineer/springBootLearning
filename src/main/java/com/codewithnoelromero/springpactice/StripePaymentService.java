package com.codewithnoelromero.springpactice;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiUrl}")
    private String apiUrl;
    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout:3000}")
    private int timeout;
    @Value("${stripe.supported-currencies}")
    private List<String> supportedCurrencies;

    @Override
    public void processPayment(double amount) {
        String paymentMethod = "Stripe";

        System.out.println("API URL: "+ apiUrl);
        System.out.println("Enabled: "+ enabled);
        System.out.println("Timeout: "+ timeout);
        System.out.println("SupportedCurrencies "+ supportedCurrencies);
        System.out.println("Payment method: " + paymentMethod);
        System.out.println("Amount" + amount);
    }
}
