package com.codewithnoelromero.springpactice.controllers;

import com.codewithnoelromero.springpactice.entities.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @RequestMapping("/hello")
    public Message sayHello() {
        return new Message( "Hello Noel");

    }
}
