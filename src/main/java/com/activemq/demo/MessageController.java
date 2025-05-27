package com.activemq.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    Producer producer;

    @PostMapping("/{message}")
    public void sendMessage(@PathVariable String message){
        producer.send(message);
    }
}
