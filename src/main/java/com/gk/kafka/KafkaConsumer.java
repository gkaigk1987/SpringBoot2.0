package com.gk.kafka;

import java.util.Optional;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

@Service
public class KafkaConsumer {
	
	private final static Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

	@KafkaListener(topics = {"gk_test"})
	public void listen(ConsumerRecord<?, ?> record) {
		Optional<?> optional = Optional.ofNullable(record.value());
		if(optional.isPresent()) {
			Object message = optional.get();
			logger.info("receive kafka message:{}",JSONObject.toJSONString(message));
		}
	}
	
}
