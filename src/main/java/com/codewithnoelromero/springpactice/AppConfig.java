package com.codewithnoelromero.springpactice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Value("${payment-gateway:paypal}")
    private String paymentGateway;

    @Bean
    public PaymentService stripe () {
        return new StripePaymentService();
    }

    @Bean
    public OrderService orderService(){
        PaymentService paymentService = "stripe".equalsIgnoreCase(paymentGateway) ? stripe() : paypal();
        return new OrderService(paymentService);
    }

    @Bean
    public PaymentService paypal(){
        return new PayPalPaymentService();
    }



}
