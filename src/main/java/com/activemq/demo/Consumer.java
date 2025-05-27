package com.activemq.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Consumer {

    @JmsListener(destination = "simple-queue")
    public void Receive(String message)   {
        log.info("Receive messages from queue: {}",message);
        
    }
}
