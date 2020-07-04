package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.AddressMapper;
import com.accp.dao.UserMapper;
import com.accp.domain.Address;
import com.accp.domain.AddressExample;
import com.accp.domain.User;
import com.accp.domain.UserExample;

@Service
@Transactional
public class UserService {
	@Autowired
	UserMapper mapper;
	@Autowired
	AddressMapper amapper;
	
	public User findById(String userid){
		UserExample example=new UserExample();
		example.createCriteria().andUseridEqualTo(userid);
		User u=mapper.selectByExample(example).get(0);
		AddressExample example2=new AddressExample();
		example2.createCriteria().andUseridEqualTo(userid);
		List<Address> list=amapper.selectByExample(example2);
		u.setList(list);
		return u;
	}
	
	
	
	public int create(User user) {
		UserExample example=new UserExample();
		example.createCriteria().andUseridEqualTo(user.getUserid());
		int count=mapper.deleteByExample(example);
		return mapper.insert(user);
	}
}
