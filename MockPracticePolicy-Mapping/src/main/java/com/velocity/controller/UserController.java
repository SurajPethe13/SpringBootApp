package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.User;
import com.velocity.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userservice;   
	
	@GetMapping("/getalluser")
	public List<User> getAllUser(){
		
		return userservice.getAllUser();
	}
	
	@PostMapping("/createuser")
	public void createUser(@RequestBody User user) {
		userservice.createUser(user);
	}
	
	@PutMapping("/updateuser/{id}")
	public void updateuser(@PathVariable Integer id, @RequestBody User user) {
		userservice.updateUser(id, user);
	}
	
	
	@DeleteMapping("/deleteuser/{id}")
	public void delete(@PathVariable Integer id) {
		userservice.deleteUser(id);
	}	
}
