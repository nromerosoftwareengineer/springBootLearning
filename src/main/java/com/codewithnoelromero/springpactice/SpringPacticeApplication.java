package com.codewithnoelromero.springpactice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPacticeApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringPacticeApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();

    }

}
