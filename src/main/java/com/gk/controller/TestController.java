package com.gk.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.gk.model.User;
import com.gk.service.IThesisService;

@Controller
public class TestController {
	
	private static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private IThesisService thesisService;
	
	@RequestMapping("/")
	public String index(Model model, HttpServletRequest request, HttpSession session) {
		model.addAttribute("testName", "GK SpringBoot2 Test");
		return "index";
	}
	
	@RequestMapping("/jsonTest")
	@ResponseBody
	public JSONObject test() {
		JSONObject json = new JSONObject();
		User user = new User();
		user.setId(1L);
		user.setName("倩倩");
		user.setAge(27);
		logger.info(JSONObject.toJSONString(user));
		json.put("succ", true);
		json.put("msg", "成功");
		return json;
	}
	
	@RequestMapping("/getThesisCount")
	@ResponseBody
	public Long getThesisCount() {
		return thesisService.getThesisCount();
	}
	
	
}
