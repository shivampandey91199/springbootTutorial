package com;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Publiser {

	@Autowired
	AmqpTemplate amqpTemplate;

	@Value("${spring.rabbitmq.template.exchange}")
	private String exchange;

	public void produceMsg(String msg) {
		amqpTemplate.convertAndSend(exchange, "", msg);
		System.out.println("Send msg = " + msg);		
	}
}
