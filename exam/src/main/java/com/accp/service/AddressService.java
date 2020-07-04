package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.AddressMapper;
import com.accp.domain.Address;

@Service
@Transactional
public class AddressService {
	@Autowired
	AddressMapper amapper;

	public int create(Address add) {
		return amapper.insert(add);
	}

	public int update(Address add) {
		return amapper.updateByPrimaryKey(add);
	}
}
