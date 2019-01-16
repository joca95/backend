package com.usersapp.demo.service;

import java.util.List;

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

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return this.userRrepository.findAll();
	}
	
	
	
}
