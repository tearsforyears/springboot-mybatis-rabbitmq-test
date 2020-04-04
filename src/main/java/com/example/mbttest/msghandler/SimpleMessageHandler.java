package com.example.mbttest.msghandler;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@RabbitListener(queues = "testQueue")
public class SimpleMessageHandler {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("Receiver: get the msg at " + new Date() + " : " + msg);
    }
}
