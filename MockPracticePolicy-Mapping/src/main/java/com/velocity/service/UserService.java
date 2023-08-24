package com.velocity.service;

import java.util.List;

import com.velocity.model.User;

public interface UserService {

	public List<User> getAllUser();
	
	public void createUser(User user);
	
	public void updateUser(Integer id, User user);
	
	public void deleteUser(Integer id);
	
}
