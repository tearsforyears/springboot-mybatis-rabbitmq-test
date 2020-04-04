package com.example.mbttest.msghandler;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TopicMessageHandler {

    @RabbitListener(queues = "topic.message")
    public void process(String msg) {
        System.out.println("message queue:"+msg);
    }
    @RabbitListener(queues = "topic.messages")
    public void processes(String msg) {
        System.out.println("messages queue:"+msg);
    }
}
