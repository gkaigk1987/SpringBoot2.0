package com.gk.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gk.model.Thesis;
import com.gk.model.User;
import com.gk.service.IThesisService;

import io.swagger.annotations.ApiOperation;

@Controller
public class TestController {
	
	private static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private IThesisService thesisService;
	
	@ApiOperation(value="SpringBoot2 Test")
	@GetMapping("/")
	public String index(Model model, HttpServletRequest request, HttpSession session) {
		model.addAttribute("testName", "GK SpringBoot2 Test");
		return "index";
	}
	
	@ApiOperation(value="SpringBoot2 Json Test")
	@RequestMapping(value = "/jsonTest",method = RequestMethod.GET)
	@ResponseBody
	public User test() {
		User user = new User();
		user.setId(1L);
		user.setName("倩倩");
		user.setAge(27);
		logger.info(JSONObject.toJSONString(user));
		return user;
	}
	
	@RequestMapping("/getThesisCount")
	@ResponseBody
	public Long getThesisCount() {
		return thesisService.getThesisCount();
	}
	
	@GetMapping(value = "/thesisList")
	public String thesisList() {
		return "thesis/thesis";
	}
	
	@GetMapping(value = "/loadThesisList")
	@ResponseBody
	public JSONObject loadThesisList(HttpServletRequest request, HttpSession session) {
		JSONObject json = new JSONObject();
		Integer offset = Integer.valueOf(request.getParameter("offset"));
		Integer limit = Integer.valueOf(request.getParameter("limit"));
		int pageNum = offset / limit + 1;
		PageHelper.startPage(pageNum, limit);
		
		List<Thesis> thesisList = thesisService.getThesisList();
		PageInfo<Thesis> pageInfo = new PageInfo<>(thesisList);
		json.put("total", pageInfo.getTotal());
		json.put("rows", thesisList);
		return json;
	}
	
}
