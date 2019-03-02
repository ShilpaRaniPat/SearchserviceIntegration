package com.stackroute.service;

import com.stackroute.model.Question;
import com.stackroute.model.QuestionDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitService {
    @RabbitListener(queues="${jsa.rabbitmq.queue}")
    public void receivedMessage(QuestionDTO msg) {
        System.out.println("Received Message: " + msg);
        String question=msg.getQuestion();





//        System.out.println(msg.getAction());
//        System.out.println(msg.getQuestion());
//        System.out.println(msg.getUser());
//        Answer answer = msg.getAnswer().get(0);
    }
}

