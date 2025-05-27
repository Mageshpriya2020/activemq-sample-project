package com.activemq.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Producer {

    @Autowired
    JmsTemplate jmsTemplate;

    public void send(String message){
        log.info("Send messages from queue: {}",message);
       jmsTemplate.convertAndSend("simple-queue",message);

    }
}
