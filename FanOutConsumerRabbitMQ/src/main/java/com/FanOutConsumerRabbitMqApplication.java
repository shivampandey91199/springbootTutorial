package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FanOutConsumerRabbitMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(FanOutConsumerRabbitMqApplication.class, args);
	}

}
