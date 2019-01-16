package com.usersapp.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usersapp.demo.dao.UserRrepository;
import com.usersapp.demo.model.User;

@Service
public class UserServiceImplement implements UserService {
	
	@Autowired
	protected UserRrepository userRrepository;

	@Override
	public User save(User user) {
		return this.userRrepository.save(user);
	}
	
	
	
}
