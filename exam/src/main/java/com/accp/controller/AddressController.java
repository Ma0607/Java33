package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.domain.Address;
import com.accp.service.AddressService;

@Controller
@RequestMapping("/address")
public class AddressController {
	@Autowired
	AddressService ser;
	
	
	@RequestMapping("/create")
	public String create(Integer id,String address,String userid) {
		Address add=new Address();
		add.setAddresid(id);
		add.setAddress(address);
		add.setUserid(userid);
		int count=ser.create(add);
		return "find";
	}
	
	@RequestMapping("/update")
	 public String update(Integer id,String address,String userid) {
	  Address add=new Address();
	  add.setAddresid(id);
	  add.setAddress(address);
	  add.setUserid(userid);
	  int count=ser.update(add);
	  return "find";
	 }
}
