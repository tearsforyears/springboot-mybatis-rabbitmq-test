package com.example.mbttest;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class MsgQueueTest {
    @Autowired
    private AmqpTemplate rabbitTemplate;


    @Test
    void test() throws Exception {
        String context = "this is time " + new Date() + " to send the msg";
        System.out.println("Sender : " + context);
        Thread.sleep(1000);
        rabbitTemplate.convertAndSend("testQueue", context);
    }

    @Test
    void testTopic() {
        String context1 = "this is msg1";
        String context2 = "this is msg2";
        rabbitTemplate.convertAndSend("exchange", "topic.messages", context1);
        rabbitTemplate.convertAndSend("exchange", "topic.message", context2);
    }

}
