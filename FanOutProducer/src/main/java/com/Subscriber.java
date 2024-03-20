package com;

import java.nio.charset.StandardCharsets;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Subscriber {

	@RabbitListener(queues = "${jsa.rabbit.queue}")
	public void recievedMsg(String message) {
		String msg = new String(message.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
		System.out.println("Received msg : " + msg);

	}
}
