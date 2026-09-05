package com.codewithnoelromero.springpactice;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service()
public class OrderService {
    private PaymentService paymentService;


    public OrderService( PaymentService paymentService) {
        System.out.println("Order service created ");
        this.paymentService = paymentService;
    }

    @PostConstruct
    public void init(){
        System.out.println("OrderService Post Construct");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Order PreDestroy");
    }

    public void placeOrder() {

        this.paymentService.processPayment( 10);

    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
