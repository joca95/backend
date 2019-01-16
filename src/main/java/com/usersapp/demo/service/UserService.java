package com.usersapp.demo.service;

import java.util.List;

import com.usersapp.demo.model.User;

public interface UserService {

	User save(User user);

	List<User> findAll();

	void deleteUser(Long id);

}
