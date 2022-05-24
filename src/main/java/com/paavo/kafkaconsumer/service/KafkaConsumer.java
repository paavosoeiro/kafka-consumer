package com.paavo.kafkaconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "my_topic")
	public void receive(String message) {
		System.out.println(message);
	}
}
