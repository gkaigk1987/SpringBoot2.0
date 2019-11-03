package com.gk.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.gk.model.User;

/**
 * kafka 消息生产
 * @author gk
 * 
 * 2019年3月24日
 *
 */
@Service
public class KafkaProducer {
	
	private final static Logger logger = LoggerFactory.getLogger(KafkaProducer.class);
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void produce(User user) {
		logger.info("kafka produce message:{}",JSONObject.toJSONString(user));
		kafkaTemplate.send("gk_test", JSONObject.toJSONString(user));
	}
	
}
