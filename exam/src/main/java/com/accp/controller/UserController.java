package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.User;
import com.accp.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService ser;
	
	@RequestMapping("/toIndex")
	public String topage() {
		return "find";
	}
	
	@RequestMapping("/findById")
	@ResponseBody
	public User findById(String userid) {
		return ser.findById(userid);
	}
	
	
	@RequestMapping("/create")
	public String created(@RequestBody User user) {
		int count=ser.create(user);
		return "find";
	}
}
