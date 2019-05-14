package com.ymc.iotthings.webserver.rabbitmq.customize;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 固定订阅某个Queue,当同时订阅时，因为不是广播，所以会随机消费
 * @author lc
 */
@Component
public class RabbitReceive {

    @RabbitHandler
    @RabbitListener(queues = "QueueName")
    public void processMessage(String content){
        System.err.println(content);
    }
}
