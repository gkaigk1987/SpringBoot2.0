package com.gk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.gk.kafka.KafkaProducer;
import com.gk.model.User;

@Controller
@RequestMapping("/kafka")
public class KafkaController {
	
	@Autowired
	private KafkaProducer kafkaProducer;

	@GetMapping(value = "/send/{id}")
	public @ResponseBody JSONObject kafkaMsgSend(@PathVariable Long id, HttpServletRequest request) {
		JSONObject json = new JSONObject();
		User user = new User();
		user.setId(id);
		user.setAge(30);
		user.setName("GaoKai");
		kafkaProducer.produce(user);
		json.put("succ", true);
		json.put("msg", "Kafka消息发送成功！");
		return json;
	}
	
}
