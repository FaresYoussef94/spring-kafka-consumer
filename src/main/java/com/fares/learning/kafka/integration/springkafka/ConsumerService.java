package com.fares.learning.kafka.integration.springkafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

	private static final Logger LOG = LoggerFactory.getLogger(ConsumerService.class);

	@KafkaListener(topics = "users", groupId = "group_id")
	public void consumeMessage(String message) {
		LOG.info("The consumed message is: {}", message);
	}

}
