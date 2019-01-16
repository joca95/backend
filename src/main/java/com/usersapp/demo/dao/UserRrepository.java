package com.usersapp.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usersapp.demo.model.User;

public interface UserRrepository extends JpaRepository<User, Long> {

	@SuppressWarnings("unchecked")
	User save(User user);

}
